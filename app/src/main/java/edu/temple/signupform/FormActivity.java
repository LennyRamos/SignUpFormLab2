package edu.temple.signupform;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    Button saveButton;
    TextView email;
    TextView password;
    TextView confirmPassword;


    //Toast toast2 = Toast.makeText(this, incorrectPass, duration);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        saveButton = (Button) findViewById(R.id.buttonSave);
        email = (EditText) findViewById(R.id.textEmail);
        password = (EditText) findViewById(R.id.textPassword);
        confirmPassword = (EditText) findViewById(R.id.textConfirmPass);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("") || password.getText().toString().equals("") || confirmPassword.getText().toString().equals("")){

                    Toast.makeText(FormActivity.this, "One of the fields is empty", Toast.LENGTH_LONG).show();

                } else if (!(password.getText().toString().equals(confirmPassword.getText().toString()))){

                    Toast.makeText(FormActivity.this, "Your passwords do not match", Toast.LENGTH_LONG).show();

                } else {

                    Toast.makeText(FormActivity.this, "Input saved", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
