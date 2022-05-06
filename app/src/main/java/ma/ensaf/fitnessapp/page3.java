package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class page3 extends AppCompatActivity{
      TextView backArrow;
      RadioButton rd1,rd2,rd3,rd4;
      CardView cd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
         backArrow=findViewById(R.id.imaget);
         backArrow.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(page3.this,page2.class));
             }
         });
         rd1=findViewById(R.id.radioButton);
         rd2=findViewById(R.id.radioButton4);
         rd3=findViewById(R.id.radioButton3);
         rd4=findViewById(R.id.radioButton2);
         cd=findViewById(R.id.cardView2);
         cd.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(page3.this,page4.class));
                 finish();
             }
         });
    }


}