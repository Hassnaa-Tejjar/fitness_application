package ma.ensaf.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity implements View.OnClickListener{
    EditText user,password;
    TextView forget,account;
    ImageButton log;
    DatabaseReference userdbRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userdbRef=FirebaseDatabase.getInstance().getReference().child("User");
        user=findViewById(R.id.et1);
        password=findViewById(R.id.pass);
        forget=findViewById(R.id.forgetPass);
        account=findViewById(R.id.createAccount);
        account.setOnClickListener(this);
        log=findViewById(R.id.login);
        log.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.createAccount:
                startActivity(new Intent(this,signup.class));
                break;
            case R.id.login:
                idUser();
                break;
        }
    }

    private void idUser() {
        final String name=user.getText().toString().trim();
        final String Password=password.getText().toString().trim();

        if(name.isEmpty()){
            user.setError("Full name is required!");
            user.requestFocus();
            return;
        }

        if(Password.isEmpty()){
            password.setError("Password is required!");
            password.requestFocus();
            return;
        }
        if(Password.length() < 6){
            password.setError("Min password length should be 6 characters!");
            password.requestFocus();
            return;
        }

        Query checkUser = userdbRef.orderByChild("fullname").equalTo(name);
        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                if(dataSnapshot.exists()){

                    for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                        if(snapshot.hasChild("password")){
                            if(snapshot.child("password").getValue(String.class).equals(Password)){
                                Intent intent=new Intent(login.this,page5.class);
                                String passwordFromDB = snapshot.child("password").getValue(String.class);
                                String fullnameFromDB = snapshot.child("fullname").getValue(String.class);
                                String user=snapshot.getKey().toString();
                                String emailFromDB = snapshot.child("email").getValue(String.class);
                                String poidsFromDB =snapshot.child("poids").getValue().toString();
                                String imageFromDB =snapshot.child("uimage").getValue(String.class);

                                String tailleFromDB = snapshot.child("taille").getValue().toString();
                                String dateFromDB = snapshot.child("date_naiss").getValue().toString();
                                intent.putExtra("fullname", fullnameFromDB );
                                intent.putExtra("email", emailFromDB);
                                intent.putExtra("poids", poidsFromDB);
                                intent.putExtra("taille", tailleFromDB);
                                intent.putExtra("user", user);

                                intent.putExtra("date", dateFromDB);
                                intent.putExtra("password", passwordFromDB);
                                intent.putExtra("img", imageFromDB);
                                startActivity(intent);
                                finish();

                            }
                            else {

                                password.setError("Wrong Password");
                                password.requestFocus();
                            }

                        }
                    }


                } else {
                    user.setError("No such User exist");
                    user.requestFocus();
                }
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }

}