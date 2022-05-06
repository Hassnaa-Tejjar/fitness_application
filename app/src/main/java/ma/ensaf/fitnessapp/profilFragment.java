package ma.ensaf.fitnessapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class profilFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView q;
        TextView p,l,c,r,rp;
        TextView p1,p2;
        TextView rap,r1,s;
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profil, container, false);
        s=view.findViewById(R.id.share);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID;
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });
        rap=view.findViewById(R.id.rappel);
        rap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(), rappel.class);
                startActivity(popupwindow);
            }
        });
        r1=view.findViewById(R.id.prof);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(), rappel.class);
                startActivity(popupwindow);
            }
        });
        q=view.findViewById(R.id.qst);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(), QST.class);
                startActivity(popupwindow);
            }
        });

        p1=view.findViewById(R.id.prof);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(), page5.class);
                startActivity(popupwindow);
            }
        });
        p2=view.findViewById(R.id.prof1);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(), page5.class);
                startActivity(popupwindow);
            }
        });
        r=view.findViewById(R.id.rq);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(), contact.class);
                startActivity(popupwindow);
            }
        });
        c=view.findViewById(R.id.C);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(), contact.class);
                startActivity(popupwindow);
            }
        });
        p=view.findViewById(R.id.poli);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(), politique.class);
                startActivity(popupwindow);
            }
        });
        l=view.findViewById(R.id.l);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(getActivity(), langue.class);
                startActivity(popupwindow);
            }
        });
        return view;
    }
}