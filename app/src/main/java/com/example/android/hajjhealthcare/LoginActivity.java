package com.example.android.hajjhealthcare;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText mEmailEditText;
        EditText mPasswordEditText;
        Button mRegisterButton;
        Button mSignin;

        mEmailEditText = (EditText) findViewById(R.id.email_view);
        mPasswordEditText = (EditText) findViewById(R.id.password_view);
        mRegisterButton = (Button) findViewById(R.id.sign_up);
        mSignin = (Button) findViewById(R.id.sign_in);


        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });

        mSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, ServicesActivity.class);
                startActivity(i);

            }
        });
    }




}
