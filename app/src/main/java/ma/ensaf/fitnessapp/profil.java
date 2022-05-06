package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class profil extends AppCompatActivity {
    TextView q;
    TextView p,l,c,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        q=findViewById(R.id.qst);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(profil.this, QST.class);
                startActivity(popupwindow);
            }
        });
        r=findViewById(R.id.rq);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(profil.this, contact.class);
                startActivity(popupwindow);
            }
        });
        c=findViewById(R.id.C);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(profil.this, contact.class);
                startActivity(popupwindow);
            }
        });
        p=findViewById(R.id.poli);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(profil.this, politique.class);
                startActivity(popupwindow);
            }
        });
        l=findViewById(R.id.l);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(profil.this, langue.class);
                startActivity(popupwindow);
            }
        });
    }
}