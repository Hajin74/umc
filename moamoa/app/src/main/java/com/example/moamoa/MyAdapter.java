package com.example.moamoa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<MyData> myDataList;
    private LayoutInflater layoutInflater;

    public MyAdapter(Context context, int layout, ArrayList<MyData> myDataList) {
        this.context = context;
        this.layout = layout;
        this.myDataList = myDataList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return myDataList.size();
    }

    @Override
    public Object getItem(int i) {
        return myDataList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return myDataList.get(i).get_id();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       final int position = i;

       if(view == null) {
           view = layoutInflater.inflate(layout, viewGroup, false);
       }

        TextView tvTitle = view.findViewById(R.id.title_ser_text);
        TextView tvText = view.findViewById(R.id.title_ser_text);
        TextView tvPoint = view.findViewById(R.id.coin_point_text);

        tvTitle.setText(myDataList.get(position).getTitle());
        tvText.setText(myDataList.get(position).getText());
        tvPoint.setText(myDataList.get(position).getPoint());

        return view;
    }

}
