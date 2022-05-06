package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class jour1_Exerc_Complet extends AppCompatActivity {
    CardView c1,c3,c4,c5,c6,c7,c8;
    CardView c2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jour1_exerc_complet);
        c1=findViewById(R.id.cardView1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jour1_Exerc_Complet.this,pop1.class);
                startActivity(popupwindow);
            }
        });
        t=findViewById(R.id.rt);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jour1_Exerc_Complet.this,MainActivity.class);
                startActivity(popupwindow);
            }
        });
        c3=findViewById(R.id.cardView2);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jour1_Exerc_Complet.this,Hanches_desc.class);
                startActivity(popupwindow);
            }
        });
        c4=findViewById(R.id.cardView4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jour1_Exerc_Complet.this,jumping_desc.class);
                startActivity(popupwindow);
            }
        });
        c2=findViewById(R.id.cardView3);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jour1_Exerc_Complet.this,squats.class);
                startActivity(popupwindow);
            }
        });
        c5=findViewById(R.id.cardView5);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jour1_Exerc_Complet.this,Crunch_desc.class);
                startActivity(popupwindow);
            }
        });
        c6=findViewById(R.id.cardView6);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jour1_Exerc_Complet.this,Crunch2_desc.class);
                startActivity(popupwindow);
            }
        });
        c7=findViewById(R.id.cardView7);
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jour1_Exerc_Complet.this,Traction_desc.class);
                startActivity(popupwindow);
            }
        });
        c8=findViewById(R.id.cardView8);
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jour1_Exerc_Complet.this,Crunch_desc.class);
                startActivity(popupwindow);
            }
        });
    }
}