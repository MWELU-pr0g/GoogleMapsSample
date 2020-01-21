package com.mutinda;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListView listView2;
    private String[] countries2;
    private ArrayAdapter arrayAdapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources resources = getResources();
        countries2 = resources.getStringArray(R.array.countriesName);

        arrayAdapter2 = new ArrayAdapter(this, R.layout.lst_view, countries2);
        listView2 = findViewById(R.id.lview);

        listView2.setAdapter(new CustomAdpter(this));
    }


        }



