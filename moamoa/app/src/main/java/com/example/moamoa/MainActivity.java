package com.example.moamoa;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MyData> myDataList;
    private MyAdapter myAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDataList = new ArrayList<MyData>();
        for(int i = 1; i <= 10; i++) {
            myDataList.add(new MyData(i, "사회현상에 대한 소비자 인식", "11개의 항목 ㅣ 선택형", "300p"));
        }

        myAdapter = new MyAdapter(this, R.layout.board_list_item, myDataList);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("아이템 클릭", "항목 : " + i);

                Intent intent = new Intent(MainActivity.this, surveyCheckActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, FormCreateActivity.class);
        startActivity(intent);
    }
}
