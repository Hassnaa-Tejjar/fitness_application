package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class Crunch extends AppCompatActivity {
    ProgressBar p1;
    int counter=0;
    Handler handler = new Handler();

    CardView start,stop,passer,preced;
    TextView t1;
    boolean isStart;
    TextView startP;
    TextView stopP;
    static final long START_TIME_IN_MILLIS=30000;
    CountDownTimer countDownTimer;
    //boolean mTimerRunning;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crunch);
        start=findViewById(R.id.start);
        stop=findViewById(R.id.stop);
        t1=findViewById(R.id.t1);

        startP=findViewById(R.id.startP);
        stopP=findViewById(R.id.stopP);
        p1 = (ProgressBar)findViewById(R.id.dp);
        passer = findViewById(R.id.pass);
        preced = findViewById(R.id.cardView1);
        preced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent window = new Intent(Crunch.this,jumping.class);
                startActivity(window);
            }
        });
        passer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent window = new Intent(Crunch.this,Break3.class);
                startActivity(window);
            }
        });


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // prog();
              /*  if(mTimerRunning){
                    pauseTimer();}
                else {
                    startTimer();}*/
                startTimer();
                isStart = true;
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pauseTimer();
                isStart = false;
            }
        });

        handler = new Handler()
        {
            public void handleMessage(android.os.Message msg)
            {
                if(isStart)
                {
                    counter++;
                }
                p1.setProgress(counter);
                //ShowText.setText(String.valueOf(progressBarValue/60)+":"+String.valueOf(progressBarValue%60));

                handler.sendEmptyMessageDelayed(0, 300);
            }
        };

        handler.sendEmptyMessage(0);
    }


    private void pauseTimer() {

        countDownTimer.cancel();
        //mTimerRunning=false;
        //start_stop.setText("start");
    }

    private void updateCountDownText() {
        int minutes=(int) (mTimeLeftInMillis/1000)/60;
        int seconds=(int) (mTimeLeftInMillis/1000)%60;
        String mtimeLeftFormatted= String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
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
                Intent window = new Intent(Crunch.this,Break3.class);
                startActivity(window);
                // mTimerRunning=false;
                //  start_stop.setText(("start"));
                // start_stop.setVisibility(View.INVISIBLE);
                //  p1.setVisibility(View.GONE);
            }
        }.start();
        // mTimerRunning=true;
        // start_stop.setText("pause");
    }

  /*  private void prog() {
        p1= findViewById(R.id.dp);
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
    }*/

}