package ma.ensaf.fitnessapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;
        TextView j11,j12,j13,j14,j15,j16,j17,j18,j19,j20;
        TextView j21,j22,j23,j24,j25,j26,j27,j28,j29,j30;
        ImageButton i;
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        i = view.findViewById(R.id.ques);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),QST.class);
                startActivity(popupwindow);
            }
        });
        j1 = view.findViewById(R.id.jr1);
        j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour1.class);
                startActivity(popupwindow);
            }
        });
        j2 = view.findViewById(R.id.jr2);
        j2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour2.class);
                startActivity(popupwindow);
            }
        });
        j3 = view.findViewById(R.id.jr3);
        j3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour3.class);
                startActivity(popupwindow);
            }
        });
        j4 = view.findViewById(R.id.jr4);
        j4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour4.class);
                startActivity(popupwindow);
            }
        });
        j5 = view.findViewById(R.id.jr5);
        j5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour1.class);
                startActivity(popupwindow);
            }
        });
        j6 = view.findViewById(R.id.jr6);
        j6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour2.class);
                startActivity(popupwindow);
            }
        });
        j7 = view.findViewById(R.id.jr7);
        j7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour3.class);
                startActivity(popupwindow);
            }
        });
        j8 = view.findViewById(R.id.jr8);
        j8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour4.class);
                startActivity(popupwindow);
            }
        });
        j9 = view.findViewById(R.id.jr9);
        j9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour1.class);
                startActivity(popupwindow);
            }
        });
        j10 = view.findViewById(R.id.jr10);
        j10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour2.class);
                startActivity(popupwindow);
            }
        });
        j11 = view.findViewById(R.id.jr11);
        j11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour3.class);
                startActivity(popupwindow);
            }
        });
        j12 = view.findViewById(R.id.jr12);
        j12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour4.class);
                startActivity(popupwindow);
            }
        });
        j13 = view.findViewById(R.id.jr13);
        j13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour1.class);
                startActivity(popupwindow);
            }
        });
        j14 = view.findViewById(R.id.jr14);
        j14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour2.class);
                startActivity(popupwindow);
            }
        });
        j15 = view.findViewById(R.id.jr15);
        j15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour3.class);
                startActivity(popupwindow);
            }
        });
        j16 = view.findViewById(R.id.jr16);
        j16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour4.class);
                startActivity(popupwindow);
            }
        });
        j17 = view.findViewById(R.id.jr17);
        j17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour1.class);
                startActivity(popupwindow);
            }
        });
        j18 = view.findViewById(R.id.jr18);
        j18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour2.class);
                startActivity(popupwindow);
            }
        });
        j19 = view.findViewById(R.id.jr19);
        j19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour3.class);
                startActivity(popupwindow);
            }
        });
        j20 = view.findViewById(R.id.jr20);
        j20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour4.class);
                startActivity(popupwindow);
            }
        });
        j21 = view.findViewById(R.id.jr21);
        j21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour1.class);
                startActivity(popupwindow);
            }
        });
        j22 = view.findViewById(R.id.jr22);
        j22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour2.class);
                startActivity(popupwindow);
            }
        });
        j23 = view.findViewById(R.id.jr23);
        j23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour3.class);
                startActivity(popupwindow);
            }
        });
        j24 = view.findViewById(R.id.jr24);
        j24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour4.class);
                startActivity(popupwindow);
            }
        });
        j25 = view.findViewById(R.id.jr25);
        j25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour1.class);
                startActivity(popupwindow);
            }
        });
        j26 = view.findViewById(R.id.jr26);
        j26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour2.class);
                startActivity(popupwindow);
            }
        });
        j27 = view.findViewById(R.id.jr27);
        j27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour3.class);
                startActivity(popupwindow);
            }
        });
        j28 = view.findViewById(R.id.jr28);
        j28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour4.class);
                startActivity(popupwindow);
            }
        });
        j29 = view.findViewById(R.id.jr29);
        j29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour1.class);
                startActivity(popupwindow);
            }
        });
        j30 = view.findViewById(R.id.jr30);
        j30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(),jour2.class);
                startActivity(popupwindow);
            }
        });
        return view;
    }
}