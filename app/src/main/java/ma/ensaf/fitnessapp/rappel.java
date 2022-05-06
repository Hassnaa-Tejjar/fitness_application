package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;

public class rappel extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener{
     TextView tv;
     ImageButton ib;
     ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rappel);
        tv=findViewById(R.id.alarm);
        ib=findViewById(R.id.ajout);
        iv=findViewById(R.id.img);
      ib.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              DialogFragment timePicker=new TimePickerFragment();
              timePicker.show(getSupportFragmentManager(),"time picker");
          }
      });
      iv.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              cancelAlarm();
          }
      });
    }
         @Override
        public void onTimeSet(TimePicker view,int hourOfDay,int minute){
            Calendar c=Calendar.getInstance();
            c.set(Calendar.HOUR_OF_DAY,hourOfDay);
            c.set(Calendar.MINUTE,minute);
            c.set(Calendar.SECOND,0);
            updateTimeText(c);
            startAlarm(c);
        }

    private void startAlarm(Calendar c) {
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, AlertReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 1, intent, 0);

        if (c.before(Calendar.getInstance())) {
            c.add(Calendar.DATE, 1);
        }

        alarmManager.setExact(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), pendingIntent);
    }

    private void updateTimeText(Calendar c) {
        String timetxt= DateFormat.getTimeInstance(DateFormat.SHORT).format(c.getTime());
        tv.setText(timetxt);
    }
    private void cancelAlarm() {
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, AlertReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 1, intent, 0);
        alarmManager.cancel(pendingIntent);
        tv.setText("");
    }
}