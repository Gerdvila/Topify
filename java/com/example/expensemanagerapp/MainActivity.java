package com.example.expensemanagerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText mEmail;
    private EditText mPassw;
    private Button BtnLogin;
    private TextView mForgetPassword;
    private TextView mSignupHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginDetails();
    }

    private void loginDetails(){

        mEmail=findViewById(R.id.email_login);
        mPassw=findViewById(R.id.pswd_login);
        BtnLogin=findViewById(R.id.btn_login);
        mForgetPassword=findViewById(R.id.forget_password);
        mSignupHere=findViewById(R.id.signup_login);

        BtnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String email=mEmail.getText().toString().trim();
                String pass=mPassw.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    mEmail.setError("Email is Required");
                    return;
                }
                if (TextUtils.isEmpty(pass)){
                    mEmail.setError("Password is Required..");
                    return;
                }
            }
        });
        mSignupHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),RegistrationActivity.class));
            }
        });
        mForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Reset_Activity.class));
            }
        });
    }
}