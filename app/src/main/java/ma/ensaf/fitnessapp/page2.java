package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class page2 extends AppCompatActivity {
    CardView  card1,card2,card3,card4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        card1=findViewById(R.id.card1);

        card2=findViewById(R.id.cardView2);

        card3=findViewById(R.id.cardView3);

        card4=findViewById(R.id.cardView4);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card1.getBackground().setTint(Color.rgb(193,134,103));
                card2.getBackground().setTint(Color.rgb(215,177,157));
                card3.getBackground().setTint(Color.rgb(215,177,157));
               card4.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       startActivity(new Intent(page2.this,page3.class));
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
                        startActivity(new Intent(page2.this,page3.class));
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
                        startActivity(new Intent(page2.this,page3.class));
                        finish();
                    }
                });

            }
        });




        }




}