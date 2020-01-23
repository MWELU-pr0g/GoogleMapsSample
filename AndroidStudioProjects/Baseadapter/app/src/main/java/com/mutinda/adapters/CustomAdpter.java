package com.mutinda.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.mutinda.R;

public class CustomAdpter extends BaseAdapter {
    private ListView lstView;
    private  String[] countries;
    private LayoutInflater inflates;
    private Context context;


    public CustomAdpter(String[] countries, Context context) {
        this.countries = countries;
        this.context = context;
    }

    @Override
    public int getCount() {
        int count = countries.length;
        return count;
    }

    @Override
    public Object getItem(int position) {

        return countries[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item_layout,parent,false);
        }

        String country = countries[position];
        TextView textView = convertView.findViewById(R.id.label);
        textView.setText(country);
        return  convertView;
    }
}
