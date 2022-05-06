package ma.ensaf.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {
    MeowBottomNavigation bottomNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNav=findViewById(R.id.bottomNav);
        bottomNav.add(new MeowBottomNavigation.Model(1,R.drawable.dumbbell));
        bottomNav.add(new MeowBottomNavigation.Model(2,R.drawable.food));
        bottomNav.add(new MeowBottomNavigation.Model(3,R.drawable.excercise));
        bottomNav.add(new MeowBottomNavigation.Model(4,R.drawable.stats));
        bottomNav.add(new MeowBottomNavigation.Model(5,R.drawable.user));


        bottomNav.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment=null;
               switch (item.getId()){
                   case 1:
                       fragment=new dashboard();
                       break;
                   case 2:
                       fragment=new HomeFragment();
                       break;
                   case 3:
                       fragment=new programmeFragment();
                       break;
                   case 4:
                       fragment=new statistiqueFragment();
                       break;
                   case 5:
                       fragment=new profilFragment();
                       break;
               }
                loadFragment(fragment);
            }
        });
        bottomNav.show(1,true);
        bottomNav.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {

            }
        });
    }
   private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout,fragment)
                .commit();
    }
}