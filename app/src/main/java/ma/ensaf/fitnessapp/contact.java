package ma.ensaf.fitnessapp;

import static androidx.core.content.ContextCompat.getSystemService;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class contact extends AppCompatActivity {
    EditText su,msg;
    TextView to;
    CardView se;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        to=findViewById(R.id.to);
        su=findViewById(R.id.su);
        msg=findViewById(R.id.msg);
        se=findViewById(R.id.cardView);
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent window = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"+to.getText().toString()));
                window.putExtra(Intent.EXTRA_SUBJECT,su.getText().toString());
                window.putExtra(Intent.EXTRA_TEXT,msg.getText().toString());
                startActivity(window);
            }
        });
    }
}