package ma.ensaf.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import com.squareup.picasso.Picasso;
import com.theartofdev.edmodo.cropper.CropImage;

import java.io.InputStream;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.hdodenhof.circleimageview.CircleImageView;

public class page5 extends AppCompatActivity {
    EditText name,mail,pass,poids,taille,datenaiss;
    TextView change,retour;
    CircleImageView profileimageview;
    Uri imageUri;
    Bitmap bitmap;
    DatabaseReference reference;
    String user_fullname,user_email,user_taille,user_poids,user_date,user_password,u,user_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        profileimageview=findViewById(R.id.imgprofile);
        name = findViewById(R.id.fullname_profile);
        mail = findViewById(R.id.email_profile);
        pass = findViewById(R.id.password_profile);
        poids = findViewById(R.id.poids_profile);
        taille = findViewById(R.id.taille_profile);
        datenaiss = findViewById(R.id.date_profile);
        change=findViewById(R.id.changeprf);
        retour=findViewById(R.id.imaget);
        showAllUserData();
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(page5.this,page2.class);
                startActivity(intent);
            }
        });
        profileimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dexter.withActivity(page5.this)
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse response) {
                                Intent intent=new Intent(Intent.ACTION_PICK);
                                intent.setType("image/*");
                                startActivityForResult(Intent.createChooser(intent,"select file image"),1);

                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse response) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
                                token.continuePermissionRequest();
                            }
                        }).check();

            }
        });
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadProfileimg();
            }
        });
    }



    protected void onActivityResult(int requestCode,int resultCode,Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 && resultCode==RESULT_OK){
            imageUri=data.getData();
            try {
                InputStream inputStream= getContentResolver().openInputStream(imageUri);
                bitmap= BitmapFactory.decodeStream(inputStream);
                profileimageview.setImageBitmap(bitmap);
            }catch (Exception e){

            }
        }
    }


    private void showAllUserData() {
        Intent intent = getIntent();
        user_fullname = intent.getStringExtra("fullname");
        user_email = intent.getStringExtra("email");
        user_taille = intent.getStringExtra("taille");
        user_poids = intent.getStringExtra("poids");
        user_date= intent.getStringExtra("date");
        user_password = intent.getStringExtra("password");
        user_image = intent.getStringExtra("img");
        u = intent.getStringExtra("user");
        name.setText(user_fullname);
        mail.setText(user_email);
        pass.setText(user_password);
        taille.setText(user_taille );
        poids.setText(user_poids );
        datenaiss.setText(user_date);
        Picasso.get().load(user_image).into(profileimageview);
    }
    public void update(View view){
        FirebaseDatabase db=FirebaseDatabase.getInstance();
        DatabaseReference root=db.getReference("User");
        if (name.getText().toString().isEmpty()) {
            name.setError("Full name is required!");
            name.requestFocus();
            return;
        }
        if (mail.getText().toString().isEmpty()) {
            mail.setError("Email is required!");
            mail.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(mail.getText().toString()).matches()) {
            mail.setError("Please provid valid email!");
            mail.requestFocus();
            return;
        }
        if (pass.getText().toString().isEmpty()) {
            pass.setError("Password is required!");
            pass.requestFocus();
            return;
        }
        if (pass.getText().toString().length() < 6) {
            pass.setError("Min password length should be 6 characters!");
            pass.requestFocus();
            return;
        }
        if (taille.getText().toString().isEmpty()) {
            taille.setError(" Height is required!");
            taille.requestFocus();
            return;
        }
        String regEx2 ="([1-3][0-9][0-9])";
        Matcher matcherObj2 = Pattern.compile(regEx2).matcher(taille.getText().toString());
        if (!matcherObj2.matches())
        {
            taille.setError("Height must be between 100 and 399!");
            taille.requestFocus();
            return;
        }
        if (poids.getText().toString().isEmpty()) {
            poids.setError("Weight is required!");
            poids.requestFocus();
            return;
        }
        String regEx1 ="([3-9][0-9]|[1-2][0-9][0-9])";
        Matcher matcherObj1 = Pattern.compile(regEx1).matcher(poids.getText().toString());
        if (!matcherObj1.matches())
        {
            poids.setError("Weight must be between 30 and 299!");
            poids.requestFocus();
            return;
        }
        if (datenaiss.getText().toString().isEmpty()) {
            datenaiss.setError("Birthday is required!");
            datenaiss.requestFocus();
            return;
        }
        String regEx =
                "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        Matcher matcherObj = Pattern.compile(regEx).matcher(datenaiss.getText().toString());
        if (!matcherObj.matches())
        {
            datenaiss.setError("Please provid valid Birthday!");
            datenaiss.requestFocus();
            return;
        }

        User obj=new User(name.getText().toString(),mail.getText().toString(),pass.getText().toString(),user_image,Double.valueOf(poids.getText().toString()).doubleValue(),Double.valueOf(taille.getText().toString()).doubleValue(),datenaiss.getText().toString());
        root.child(u).setValue(obj);

    }

    private void uploadProfileimg() {
        final ProgressDialog dialog=new ProgressDialog(this);
        dialog.setTitle("File uploader");
        dialog.show();
        FirebaseStorage storage=FirebaseStorage.getInstance();
        StorageReference uploader=storage.getReference("Image1"+new Random().nextInt(50));
        uploader.putFile(imageUri)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        uploader.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {
                                dialog.dismiss();
                                FirebaseDatabase db=FirebaseDatabase.getInstance();
                                DatabaseReference root=db.getReference("User");
                                if (name.getText().toString().isEmpty()) {
                                    name.setError("Full name is required!");
                                    name.requestFocus();
                                    return;
                                }
                                if (mail.getText().toString().isEmpty()) {
                                    mail.setError("Email is required!");
                                    mail.requestFocus();
                                    return;
                                }
                                if (!Patterns.EMAIL_ADDRESS.matcher(mail.getText().toString()).matches()) {
                                    mail.setError("Please provid valid email!");
                                    mail.requestFocus();
                                    return;
                                }
                                if (pass.getText().toString().isEmpty()) {
                                    pass.setError("Password is required!");
                                    pass.requestFocus();
                                    return;
                                }
                                if (pass.getText().toString().length() < 6) {
                                    pass.setError("Min password length should be 6 characters!");
                                    pass.requestFocus();
                                    return;
                                }
                                if (taille.getText().toString().isEmpty()) {
                                    taille.setError(" Height is required!");
                                    taille.requestFocus();
                                    return;
                                }
                                String regEx2 ="([1-3][0-9][0-9])";
                                Matcher matcherObj2 = Pattern.compile(regEx2).matcher(taille.getText().toString());
                                if (!matcherObj2.matches())
                                {
                                    taille.setError("Height must be between 100 and 399!");
                                    taille.requestFocus();
                                    return;
                                }
                                if (poids.getText().toString().isEmpty()) {
                                    poids.setError("Weight is required!");
                                    poids.requestFocus();
                                    return;
                                }
                                String regEx1 ="([3-9][0-9]|[1-2][0-9][0-9])";
                                Matcher matcherObj1 = Pattern.compile(regEx1).matcher(poids.getText().toString());
                                if (!matcherObj1.matches())
                                {
                                    poids.setError("Weight must be between 30 and 299!");
                                    poids.requestFocus();
                                    return;
                                }
                                if (datenaiss.getText().toString().isEmpty()) {
                                    datenaiss.setError("Birthday is required!");
                                    datenaiss.requestFocus();
                                    return;
                                }
                                String regEx =
                                        "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
                                Matcher matcherObj = Pattern.compile(regEx).matcher(datenaiss.getText().toString());
                                if (!matcherObj.matches())
                                {
                                    datenaiss.setError("Please provid valid Birthday!");
                                    datenaiss.requestFocus();
                                    return;
                                }
                                User obj=new User(name.getText().toString(),mail.getText().toString(),pass.getText().toString(),uri.toString(),Double.valueOf(poids.getText().toString()).doubleValue(),Double.valueOf(taille.getText().toString()).doubleValue(),datenaiss.getText().toString());
                                root.child(u).setValue(obj);

                            }
                        });
                    }
                })
                .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                        float percent=(100*taskSnapshot.getBytesTransferred())/taskSnapshot.getTotalByteCount();
                        dialog.setMessage("Uploaded:"+(int)percent+" %");
                    }
                });
    }





}