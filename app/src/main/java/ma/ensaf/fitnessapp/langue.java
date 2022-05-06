package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class langue extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_langue);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width  = dm.widthPixels;
        int height  = dm.heightPixels;
        getWindow().setLayout((int)(width*.8),(int)(height*.7));

    }
}