package com.example.moamoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class surveyCheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_check);

    }

    public void onClick(View v) {
        if(v.getId() == R.id.btn) {
            Intent intent = new Intent(this, FormInputActivity.class);
            startActivity(intent);
        }
    }

}