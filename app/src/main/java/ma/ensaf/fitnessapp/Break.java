package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class Break extends AppCompatActivity {
    ProgressBar p1;
    TextView t1;
    CardView pas;
    static final long START_TIME_IN_MILLIS=30000;
    CountDownTimer countDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break);
        prog();
        t1=findViewById(R.id.t1);
        startTimer();
        pas = findViewById(R.id.pass);
        pas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent window = new Intent(Break.this,Hanches.class);
                startActivity(window);
            }
        });
    }
    private void prog() {
        p1= findViewById(R.id.pr);
        Timer t=new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                counter++;
                p1.setProgress(counter);
                if(counter==100)
                    t.cancel();
            }
        };
        t.schedule(tt,0,298);
    }
    private void updateCountDownText() {
        int minutes=(int) (mTimeLeftInMillis/1000)/60;
        int seconds=(int) (mTimeLeftInMillis/1000)%60;
        String mtimeLeftFormatted= String.format(Locale.getDefault(),"%02d",seconds);
        t1.setText((mtimeLeftFormatted));
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(mTimeLeftInMillis,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis=millisUntilFinished;
                updateCountDownText();
                // p1.setVisibility(View.VISIBLE);

            }

            @Override
            public void onFinish() {
                Intent window = new Intent(Break.this,Hanches.class);
                startActivity(window);
                // mTimerRunning=false;
                //  start_stop.setText(("start"));
                // start_stop.setVisibility(View.INVISIBLE);
                //  p1.setVisibility(View.GONE);
            }
        }.start();
    }
}
