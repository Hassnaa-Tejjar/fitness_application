package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class jour1_Exerc_Complet extends AppCompatActivity {
    CardView c1;
    CardView c2;
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
        c2=findViewById(R.id.cardView3);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jour1_Exerc_Complet.this,squats.class);
                startActivity(popupwindow);
            }
        });
    }
}