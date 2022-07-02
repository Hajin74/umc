package com.example.moamoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FormInputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_input);
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_form_input_submit:
                Toast.makeText(this, "제출되었습니다.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_form_input_cancel:
                break;
        }
        finish();
    }

}