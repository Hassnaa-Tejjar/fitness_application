package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ScrollingView;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    ScrollView s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 =findViewById(R.id.textView3);
        tv2 =findViewById(R.id.textView4);
        tv3 =findViewById(R.id.textView5);
        tv4 =findViewById(R.id.textView6);
        s1 =findViewById(R.id.scrollView);

    }
    private void scrollToBottom(){
        s1.post(new Runnable() {
            @Override
            public void run() {
                s1.smoothScrollTo(0,tv1.getBottom());
            }
        });
    }
}