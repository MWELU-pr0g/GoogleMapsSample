package com.sample.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  ArrayAdapter arrayAdapter;

    private String[] countries;

    private ListView listView;
//    private String TAG = "Mainactivity";
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Resources resources = getResources();
        countries = resources.getStringArray(R.array.countiesName);

        arrayAdapter = new ArrayAdapter(this, R.layout.list_view, countries);
        listView = findViewById(R.id.list1);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e(TAG, "onItemClick: "+ position);

                String country = countries[position];

                goToDetail(country);


            }
        });


    }

    private void goToDetail(String country) {

        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("country", country);
        startActivity(intent);
    }
}
