package utm.csc301.theBrogrammers.myPlanBook.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import utm.csc301.theBrogrammers.myPlanBook.R;

public class Signup extends AppCompatActivity {

    private String firstName, lastName, password, cellphone, email;
    private EditText lastnameInput, passwordInput, firstnameInput, emailInput, cellphoneInput;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button done = findViewById(R.id.signupDoneButton);
        firstnameInput = findViewById(R.id.firstNameInput);
        lastnameInput = findViewById(R.id.lastNameInput);
        passwordInput = findViewById(R.id.passwordInput);
        emailInput = findViewById(R.id.emailInput);
        cellphoneInput = findViewById(R.id.cellInput);
        mAuth = FirebaseAuth.getInstance();

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAllFilled();
            }
        });


    }

    public void checkAllFilled(){

        firstName = firstnameInput.getText().toString();
        lastName = lastnameInput.getText().toString();
        password = passwordInput.getText().toString();
        email = emailInput.getText().toString();
        cellphone = cellphoneInput.getText().toString();

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    if(firstName.equals("") || lastName.equals("") || password.equals("") || email.equals("") || cellphone.equals("")){
                        Toast.makeText(Signup.this, "One or more fields needs to be filled in", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(Signup.this, "Signup successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Signup.this, LoginActivity.class);
                        startActivity(intent);
                    }
                }else{
                    Toast.makeText(Signup.this, "Email not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public String getPassword() {
        return password;
    }

}
