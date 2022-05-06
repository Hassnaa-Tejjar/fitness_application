package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class jour2 extends AppCompatActivity {
TextView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jour2);
        r = findViewById(R.id.rt);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jour2.this,MainActivity.class);
                startActivity(popupwindow);
            }
        });
    }
}