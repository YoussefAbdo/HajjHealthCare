package com.example.android.hajjhealthcare;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class VideoCallSummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_video_call_summary);

        Button mFinishButton;

        mFinishButton = (Button) findViewById(R.id.finish_button);

        mFinishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(VideoCallSummaryActivity.this);
                alertDialogBuilder.setMessage("Are you ready to get the drone?");
                        alertDialogBuilder.setPositiveButton("YES",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface arg0, int arg1) {
                                        Toast.makeText(VideoCallSummaryActivity.this,
                                                "Drone is on it's way!",Toast.LENGTH_LONG).show();


                                        Intent i = new Intent(VideoCallSummaryActivity.this, VerficationCodeActivity.class);
                                        startActivity(i);
                                    }
                                });

                alertDialogBuilder.setNegativeButton("NO",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(VideoCallSummaryActivity.this,
                                "Please stay where you have submit your request!",Toast.LENGTH_LONG).show();
                        finish();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        String url = "http://b-055-hajjhealthkey.azurewebsites.net/app/VOIPhajjapp.html";
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse(url));
        startActivity(i);



    }


}
