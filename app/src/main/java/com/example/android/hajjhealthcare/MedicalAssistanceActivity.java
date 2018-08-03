package com.example.android.hajjhealthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MedicalAssistanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_assistance);


        Button mPersonalButton = (Button) findViewById(R.id.personal);
        Button mAnotherPersonButton = (Button) findViewById(R.id.another_person);

        mPersonalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MedicalAssistanceActivity.this, VideoCallSummaryActivity.class);
                startActivity(i);

            }
        });

        mAnotherPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MedicalAssistanceActivity.this, VideoCallSummaryActivity.class);
                startActivity(i);

            }
        });
    }



}
