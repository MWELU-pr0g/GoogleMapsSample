package com.mutinda;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mutinda.adapters.CustomAdpter;

public class MainActivity extends AppCompatActivity {
    private ListView listView2;
    private String[] countries2;
    private CustomAdpter customAdpter;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources resources = getResources();
        countries2 = resources.getStringArray(R.array.countriesName);

        customAdpter = new CustomAdpter(countries2, this);

        listView2 = findViewById(R.id.listView);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

         @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),R.array.countriesName,Toast.LENGTH_SHORT).show();
            }
        });

        listView2.setAdapter(customAdpter);


    }


}



