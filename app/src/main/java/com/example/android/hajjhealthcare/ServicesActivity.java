package com.example.android.hajjhealthcare;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ServicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        Button mDoctorConsultant;
        Button mMedicalAssistance;
        Button mMedicalRelief;
        Button mSuggestionsComplains;

        mDoctorConsultant = (Button) findViewById(R.id.doctor_consultant_button);
        mMedicalAssistance = (Button) findViewById(R.id.medical_assistance_button);
        mMedicalRelief = (Button) findViewById(R.id.ambulance_button);
        mSuggestionsComplains = (Button) findViewById(R.id.suggestions_complains_button);


        mDoctorConsultant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i = new Intent(ServicesActivity.this, BotActivity.class);
                //startActivity(i);
                String url = "http://b-055-hajjhealthkey.azurewebsites.net/app/ChatBothajjapp.html";

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.setComponent(new ComponentName("org.mozilla.firefox", "org.mozilla.firefox.App"));
                startActivity(intent);
            }
        });

        mMedicalAssistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ServicesActivity.this, MedicalAssistanceActivity.class);
                startActivity(i);
            }
        });
        mMedicalRelief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ServicesActivity.this,
                        "We have got your location!",Toast.LENGTH_LONG).show();
            }
        });
        mSuggestionsComplains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ServicesActivity.this, SuggestionsComplainsActivity.class);
                startActivity(i);
            }
        });
    }
}