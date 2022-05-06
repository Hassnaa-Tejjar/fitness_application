package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class jambe extends AppCompatActivity {
    CardView jr1,jr2,jr3,jr4,jr5,jr6,jr7,jr8,jr9,jr10;
    CardView jr11,jr12,jr13,jr14,jr15,jr16,jr17,jr18,jr19,jr20;
    CardView jr21,jr22,jr23,jr24,jr25,jr26,jr27,jr28,jr29,jr30;
    TextView preced;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jambe);
        preced = findViewById(R.id.preced);
        preced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Ventre.class);
                startActivity(popupwindow);
            }
        });
        jr1 = findViewById(R.id.cardView1);
        jr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,jambe_exercices.class);
                startActivity(popupwindow);
            }
        });
        jr30 = findViewById(R.id.card30);
        jr30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,jambe_exercices.class);
                startActivity(popupwindow);
            }
        });
        jr27 = findViewById(R.id.card27);
        jr27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,jambe_exercices.class);
                startActivity(popupwindow);
            }
        });
        jr25 = findViewById(R.id.card25);
        jr25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,jambe_exercices.class);
                startActivity(popupwindow);
            }
        });
        jr22 = findViewById(R.id.card22);
        jr22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,jambe_exercices.class);
                startActivity(popupwindow);
            }
        });
        jr19 = findViewById(R.id.card18);
        jr19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,jambe_exercices.class);
                startActivity(popupwindow);
            }
        });
        jr17 = findViewById(R.id.card14);
        jr17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,jambe_exercices.class);
                startActivity(popupwindow);
            }
        });
        jr15 = findViewById(R.id.card12);
        jr15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,jambe_exercices.class);
                startActivity(popupwindow);
            }
        });
        jr11 = findViewById(R.id.card8);
        jr11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,jambe_exercices.class);
                startActivity(popupwindow);
            }
        });
        jr9 = findViewById(R.id.card6);
        jr9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,jambe_exercices.class);
                startActivity(popupwindow);
            }
        });
        jr6 = findViewById(R.id.card3);
        jr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,jambe_exercices.class);
                startActivity(popupwindow);
            }
        });
        jr2 = findViewById(R.id.cardView2);
        jr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Jour2_jambe.class);
                startActivity(popupwindow);
            }
        });
        jr29 = findViewById(R.id.card29);
        jr29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Jour2_jambe.class);
                startActivity(popupwindow);
            }
        });
        jr26 = findViewById(R.id.card26);
        jr26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Jour2_jambe.class);
                startActivity(popupwindow);
            }
        });
        jr23 = findViewById(R.id.card23);
        jr23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Jour2_jambe.class);
                startActivity(popupwindow);
            }
        });
        jr21 = findViewById(R.id.card21);
        jr21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Jour2_jambe.class);
                startActivity(popupwindow);
            }
        });
        jr18 = findViewById(R.id.card17);
        jr18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Jour2_jambe.class);
                startActivity(popupwindow);
            }
        });
        jr14 = findViewById(R.id.card10);
        jr14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Jour2_jambe.class);
                startActivity(popupwindow);
            }
        });
        jr13 = findViewById(R.id.card11);
        jr13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Jour2_jambe.class);
                startActivity(popupwindow);
            }
        });
        jr10 = findViewById(R.id.card7);
        jr10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Jour2_jambe.class);
                startActivity(popupwindow);
            }
        });
        jr7 = findViewById(R.id.card4);
        jr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Jour2_jambe.class);
                startActivity(popupwindow);
            }
        });
        jr5 = findViewById(R.id.card2);
        jr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Jour2_jambe.class);
                startActivity(popupwindow);
            }
        });
        jr3 = findViewById(R.id.card1);
        jr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Jour2_jambe.class);
                startActivity(popupwindow);
            }
        });

        jr4 = findViewById(R.id.cardView4);
        jr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Break_day_j.class);
                startActivity(popupwindow);
            }
        });
        jr8 = findViewById(R.id.card5);
        jr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Break_day_j.class);
                startActivity(popupwindow);
            }
        });
        jr12 = findViewById(R.id.card9);
        jr12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Break_day_j.class);
                startActivity(popupwindow);
            }
        });
        jr16 = findViewById(R.id.card13);
        jr16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Break_day_j.class);
                startActivity(popupwindow);
            }
        });
        jr20 = findViewById(R.id.card20);
        jr20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Break_day_j.class);
                startActivity(popupwindow);
            }
        });
        jr24 = findViewById(R.id.card24);
        jr24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Break_day_j.class);
                startActivity(popupwindow);
            }
        });
        jr28 = findViewById(R.id.card28);
        jr28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jambe.this,Break_day_j.class);
                startActivity(popupwindow);
            }
        });
    }
}