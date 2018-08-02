package com.example.android.hajjhealthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button mSignUpButton;
        Spinner mSexSpinner;
        Spinner mBloodTypeSpinner;
        CheckBox mTermsConditionsCheckBox;

        mSignUpButton = (Button) findViewById(R.id.sign_upButton);
        mSexSpinner = (Spinner) findViewById(R.id.sex_spinner);
        mBloodTypeSpinner = (Spinner) findViewById(R.id.blood_type_spinner);
        mTermsConditionsCheckBox = (CheckBox) findViewById(R.id.terms_conditions_checkbox);

        ArrayAdapter<CharSequence> adapterSex = ArrayAdapter.createFromResource(this,
                R.array.Sex, android.R.layout.simple_spinner_item);
        adapterSex.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSexSpinner.setAdapter(adapterSex);

        ArrayAdapter<CharSequence> adapterBloodType = ArrayAdapter.createFromResource(this,
                R.array.blood_types, android.R.layout.simple_spinner_item);
        adapterBloodType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mBloodTypeSpinner.setAdapter(adapterBloodType);

        mSexSpinner.setOnItemSelectedListener(this);
        mBloodTypeSpinner.setOnItemSelectedListener(this);

        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

        String checkBoxText = "I agree to all the <a href='https://www.samplestore.com/legal/tnc_for_members' > Terms and Conditions</a>";

        mTermsConditionsCheckBox.setText(Html.fromHtml(checkBoxText));
        mTermsConditionsCheckBox.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }



}
