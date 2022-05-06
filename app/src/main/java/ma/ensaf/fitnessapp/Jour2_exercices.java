package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Jour2_exercices extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c10;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jour2_exercices);

      c10=findViewById(R.id.cardView3);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(Jour2_exercices.this,squats.class);
                startActivity(popupwindow);
            }
        });

       c1=findViewById(R.id.cardView1);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(Jour2_exercices.this,squats_desc.class);
                startActivity(popupwindow);
            }
        });
        t=findViewById(R.id.rt);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(Jour2_exercices.this,Ventre.class);
                startActivity(popupwindow);
            }
        });

        c2=findViewById(R.id.cardView2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(Jour2_exercices.this,battements_desc.class);
                startActivity(popupwindow);
            }
        });
        c3=findViewById(R.id.cardView4);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(Jour2_exercices.this,Flexions_desc.class);
                startActivity(popupwindow);
            }
        });
        c4=findViewById(R.id.cardView6);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(Jour2_exercices.this,Planche_desc.class);
                startActivity(popupwindow);
            }
        });
        c5=findViewById(R.id.cardView5);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(Jour2_exercices.this,Donkey_desc.class);
                startActivity(popupwindow);
            }
        });
        c6=findViewById(R.id.cardView7);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(Jour2_exercices.this,Escalade_desc.class);
                startActivity(popupwindow);
            }
        });
        c7=findViewById(R.id.cardView8);
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(Jour2_exercices.this,Fente_desc.class);
                startActivity(popupwindow);
            }
        });

    }
}