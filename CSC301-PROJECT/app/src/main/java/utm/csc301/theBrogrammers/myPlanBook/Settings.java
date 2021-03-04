package utm.csc301.theBrogrammers.myPlanBook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import utm.csc301.theBrogrammers.myPlanBook.login.LoginActivity;

public class Settings extends AppCompatActivity {

    private Button changepass, feedback, BackSettings;
//    private Button notificationdemo;
    private ImageButton ProfileButton;
    private ImageButton sign_out;
    private FirebaseAuth FireLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        changepass = findViewById(R.id.Change_Password);
        changepass.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                clickchangepass();
            }
        });


        feedback = findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                clickfeedback();
            }
        });

        ProfileButton = findViewById(R.id.Profile);
        ProfileButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                clickProfile();
            }
        });

//        notificationdemo = findViewById(R.id.button4);
//        notificationdemo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clickNotificationDemo();
//            }
//        });

        BackSettings = findViewById(R.id.backSettings);
        BackSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backSettings(v);
            }
        });

        FireLogout = FirebaseAuth.getInstance();

        sign_out = findViewById(R.id.Log_out);
        sign_out.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                clickLogout();
            }
        });
    }

    public void clickchangepass() {
        Intent intent = new Intent(this, ChangePassword.class);
        startActivity(intent);
    }


    public void clickfeedback(){
        Intent intent = new Intent(this, Feedback.class);
        startActivity(intent);
    }

    public void clickProfile(){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

//    public void clickNotificationDemo(){
//        Intent intent = new Intent(this, Notification_Demo.class);
//        startActivity(intent);
//
//    }

    private void backSettings(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void clickLogout() {
        Toast.makeText(Settings.this,"Log Out Successfully", Toast.LENGTH_SHORT).show();
        FireLogout.signOut();
        finish();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}