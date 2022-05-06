package ma.ensaf.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class signup extends AppCompatActivity implements View.OnClickListener{
    TextView login;
    EditText fullname,email,password,Poids,Taille,Date;
    ImageButton Signup;
    DatabaseReference userdbRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
         userdbRef= FirebaseDatabase.getInstance().getReference().child("User");
        login=findViewById(R.id.already);
        login.setOnClickListener(this);
        fullname=findViewById(R.id.name);
        email=findViewById(R.id.mail);
        password=findViewById(R.id.pass);
        Signup=findViewById(R.id.signup);
        Signup.setOnClickListener(this);
        Poids=findViewById(R.id.poids);
        Taille=findViewById(R.id.taille);
        Date=findViewById(R.id.date);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.already:
                startActivity(new Intent(this,login.class));
                break;
            case R.id.signup:

                    registerUser();

                break;
        }
    }
    private void registerUser()  {
        String nom = fullname.getText().toString().trim();
        String Email = email.getText().toString().trim();
        String Password = password.getText().toString().trim();
        String userPoids =Poids.getText().toString().trim();
        String userTaille= Taille.getText().toString().trim();
        String dateNaiss = Date.getText().toString().trim();
        if (nom.isEmpty()) {
            fullname.setError("Full name is required!");
            fullname.requestFocus();
            return;
        }
        if (Email.isEmpty()) {
            email.setError("Email is required!");
            email.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {
            email.setError("Please provid valid email!");
            email.requestFocus();
            return;
        }
        if (Password.isEmpty()) {
            password.setError("Password is required!");
            password.requestFocus();
            return;
        }
        if (Password.length() < 6) {
            password.setError("Min password length should be 6 characters!");
            password.requestFocus();
            return;
        }
        if (userTaille.isEmpty()) {
            Taille.setError(" Height is required!");
            Taille.requestFocus();
            return;
        }
        String regEx2 ="([1-3][0-9][0-9])";
        Matcher matcherObj2 = Pattern.compile(regEx2).matcher(userTaille);
        if (!matcherObj2.matches())
        {
            Taille.setError("Height must be between 100 and 399!");
           Taille.requestFocus();
            return;
        }
        if (userPoids.isEmpty()) {
            Poids.setError("Weight is required!");
            Poids.requestFocus();
            return;
        }
        String regEx1 ="([3-9][0-9]|[1-2][0-9][0-9])";
        Matcher matcherObj1 = Pattern.compile(regEx1).matcher(userPoids);
        if (!matcherObj1.matches())
        {
            Poids.setError("Weight must be between 30 and 299!");
            Poids.requestFocus();
            return;
        }
        if (dateNaiss.isEmpty()) {
            Date.setError("Birthday is required!");
            Date.requestFocus();
            return;
        }
        String regEx =
                "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        Matcher matcherObj = Pattern.compile(regEx).matcher(dateNaiss);
        if (!matcherObj.matches())
        {
            Date.setError("Please provid valid Birthday!");
            Date.requestFocus();
            return;
        }

        double p=Double.valueOf(userPoids).doubleValue();
        double t=Double.valueOf(userTaille).doubleValue();
        User user=new User(nom,Email,Password,p,t,dateNaiss);
        userdbRef.push().setValue(user);
        Intent intent=new Intent(signup.this,page2.class);

        startActivity(intent);
        finish();


    }

}