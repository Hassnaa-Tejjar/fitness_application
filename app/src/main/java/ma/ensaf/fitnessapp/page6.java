package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page6 extends AppCompatActivity {
    TextView backArrow;
    CardView card1,card2,card3,card4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
        backArrow=findViewById(R.id.imaget);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(page6.this,page4.class));
            }
        });
        card1=findViewById(R.id.crd1);

        card2=findViewById(R.id.crd2);

        card3=findViewById(R.id.crd3);

        card4=findViewById(R.id.crd4);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card1.getBackground().setTint(Color.rgb(193,134,103));
                card2.getBackground().setTint(Color.rgb(215,177,157));
                card3.getBackground().setTint(Color.rgb(215,177,157));
                card4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(page6.this,MainActivity.class));
                        finish();
                    }
                });
            }});
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card2.getBackground().setTint(Color.rgb(193,134,103));
                card1.getBackground().setTint(Color.rgb(215,177,157));
                card3.getBackground().setTint(Color.rgb(215,177,157));
                card4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(page6.this,MainActivity.class));
                        finish();
                    }
                });

            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card3.getBackground().setTint(Color.rgb(193,134,103));
                card1.getBackground().setTint(Color.rgb(215,177,157));
                card2.getBackground().setTint(Color.rgb(215,177,157));
                card4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(page6.this,MainActivity.class));
                        finish();
                    }
                });

            }
        });



    }
}