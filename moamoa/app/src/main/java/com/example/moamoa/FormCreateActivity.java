package com.example.moamoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class FormCreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_create);
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_form_create_cancel:
                finish();
                break;
        }
    }
}