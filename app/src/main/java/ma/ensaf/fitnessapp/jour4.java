package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class jour4 extends AppCompatActivity {
    TextView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        r = findViewById(R.id.rt);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popupwindow = new Intent(jour4.this,MainActivity.class);
                startActivity(popupwindow);
            }
        });
    }
}