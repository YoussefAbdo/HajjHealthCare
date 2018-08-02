package com.example.android.hajjhealthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        Button mDoctorConsultant;
        Button mMdedicalAssistance;
        Button mMedicalRelief;
        Button mSuggestionsComplains;

        mDoctorConsultant = (Button) findViewById(R.id.doctor_consultant_button);
        mMdedicalAssistance = (Button) findViewById(R.id.medical_assistance_button);
        mMedicalRelief = (Button) findViewById(R.id.ambulance_button);
        mSuggestionsComplains = (Button) findViewById(R.id.suggestions_complains_button);


        mDoctorConsultant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ServicesActivity.this, BotActivity.class);
                startActivity(i);
            }
        });

        mMdedicalAssistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ServicesActivity.this, MedicalAssistanceActivity.class);
                startActivity(i);
            }
        });
        mMedicalRelief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ServicesActivity.this, VideoCallActivity.class);
                startActivity(i);
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
