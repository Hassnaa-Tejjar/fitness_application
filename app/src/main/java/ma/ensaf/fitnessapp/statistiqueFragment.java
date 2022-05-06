
package ma.ensaf.fitnessapp;


import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class statistiqueFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView mcurrentheight;
        TextView mcurrentweight,mcurrentage;
        ImageView mincrementage,mdecrementage,mincrementweight,mdecrementweight;
        SeekBar mseekbarforheight;
        Button mcalculatebmi;
        RelativeLayout mmale,mfemale;
        Button s;

        final int[] intweight = {55};
        final int[] intage = {22};
        final int[] currentprogress = new int[1];

        final String[] mintprogress = {"170"};
        final String[] typerofuser = {"0"};
        final String[] weight2 = {"55"};
        final String[] age2 = {"22"};
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_statistique, container, false);
        mcurrentage=view.findViewById(R.id.currentage);
        mcurrentweight=view.findViewById(R.id.currentweight);
        mcurrentheight=view.findViewById(R.id.currentheight);
        mincrementage=view.findViewById(R.id.increnmentage);
        mdecrementage=view.findViewById(R.id.decrementage);
        mincrementweight=view.findViewById(R.id.increnmentweight);
        mdecrementweight=view.findViewById(R.id.decrementweight);
        mcalculatebmi=view.findViewById(R.id.calculatebmi);
        mseekbarforheight=view.findViewById(R.id.seekbarforheight);
        mmale=view.findViewById(R.id.male);
        mfemale=view.findViewById(R.id.female);
         s=view.findViewById(R.id.steps);
        mmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmale.setBackground(ContextCompat.getDrawable(getContext().getApplicationContext(),R.drawable.malefemalefocus));
                mfemale.setBackground(ContextCompat.getDrawable(getContext().getApplicationContext(),R.drawable.malefemalenotfocus));
                typerofuser[0] ="Male";

            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), steps.class);
                startActivity(intent);

            }
        });
        mfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mfemale.setBackground(ContextCompat.getDrawable(getContext().getApplicationContext(),R.drawable.malefemalefocus));
                mmale.setBackground(ContextCompat.getDrawable(getContext().getApplicationContext(),R.drawable.malefemalenotfocus));
                typerofuser[0] ="Female";
            }
        });

        mseekbarforheight.setMax(300);
        mseekbarforheight.setProgress(170);

        mseekbarforheight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                currentprogress[0] =progress;
                mintprogress[0] =String.valueOf(currentprogress[0]);
                mcurrentheight.setText(mintprogress[0]);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mincrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intweight[0] = intweight[0] +1;
                weight2[0] =String.valueOf(intweight[0]);
                mcurrentweight.setText(weight2[0]);
            }
        });

        mincrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intage[0] = intage[0] +1;
                age2[0] =String.valueOf(intage[0]);
                mcurrentage.setText(age2[0]);
            }
        });

        mdecrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intage[0] = intage[0] -1;
                age2[0] =String.valueOf(intage[0]);
                mcurrentage.setText(age2[0]);
            }
        });

        mdecrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intweight[0] = intweight[0] -1;
                weight2[0] =String.valueOf(intweight[0]);
                mcurrentweight.setText(weight2[0]);
            }
        });

        mcalculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(typerofuser[0].equals("0"))
                {
                    Toast.makeText(getContext().getApplicationContext(),"Select Your Gender First",Toast.LENGTH_SHORT).show();
                }

                else if(mintprogress[0].equals("0"))
                {
                    Toast.makeText(getContext().getApplicationContext(),"Select Your Height First",Toast.LENGTH_SHORT).show();
                }
                else if(intage[0] ==0 || intage[0] <0)
                {
                    Toast.makeText(getContext().getApplicationContext(),"Age is Incorrect",Toast.LENGTH_SHORT).show();
                }

                else if(intweight[0] ==0|| intweight[0] <0)
                {
                    Toast.makeText(getContext().getApplicationContext(),"Weight Is Incorrect",Toast.LENGTH_SHORT).show();
                }
                else {

                    Intent intent = new Intent(getActivity(), BmiActivity.class);
                    intent.putExtra("gender", typerofuser[0]);
                    intent.putExtra("height", mintprogress[0]);
                    intent.putExtra("weight", weight2[0]);
                    intent.putExtra("age", age2[0]);
                    startActivity(intent);

                }

            }

        });



        return view;
    }


}
