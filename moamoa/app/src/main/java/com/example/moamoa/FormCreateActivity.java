package com.example.moamoa;

import androidx.appcompat.app.AlertDialog;
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
            case R.id.btn_form_create_add:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("질문 추가")
                        .setIcon(R.mipmap.coin)
//                        .setView(R.layout.activity_intro_dev)
                        .setPositiveButton("확인", null)
                        .setCancelable(false)
                        .show();
                break;
        }
    }
}