package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Programme extends AppCompatActivity {
CardView jr1,jr2,j3,j4,j5,j6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programme);
        jr1 = findViewById(R.id.cardView1);
        jr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(Programme.this,jour1_Exerc_Complet.class);
                startActivity(popupwindow);
            }
        });
    }
}