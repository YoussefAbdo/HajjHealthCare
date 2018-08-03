package com.example.android.hajjhealthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SuggestionsComplainsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestions_complains);

        Button mSubmit = (Button) findViewById(R.id.submit);

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Thank you!",Toast.LENGTH_LONG).show();

                Intent i = new Intent(SuggestionsComplainsActivity.this, ServicesActivity.class);
                startActivity(i);
            }
        });
    }
}
