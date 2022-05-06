package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class page1 extends AppCompatActivity {
     TextView bar, womenfit,one;
     Animation baranim,womenfitanim,oneanim,imganim;
     ImageFilterView img;
     Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        bar=findViewById(R.id.bar);
        womenfit=findViewById(R.id.txtV);
        one=findViewById(R.id.textView2);
        img=findViewById(R.id.imageFilterView);
       baranim= AnimationUtils.loadAnimation(this,R.anim.baranim);
       womenfitanim=AnimationUtils.loadAnimation(this,R.anim.womenfitanim);
       imganim=AnimationUtils.loadAnimation(this,R.anim.imganim);
       womenfit.startAnimation(womenfitanim);
       bar.startAnimation(baranim);
       img.startAnimation(imganim);
       timer=new Timer();
       timer.schedule(new TimerTask() {
           @Override
           public void run() {
              Intent intent=new Intent(page1.this,login.class);
              startActivity(intent);
              finish();
           }
       },4840);

    }
}