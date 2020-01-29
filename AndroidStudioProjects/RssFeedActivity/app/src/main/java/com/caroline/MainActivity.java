package com.caroline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
;

import android.app.Activity;

import android.os.Bundle;

public class MainActivity extends Activity implements ListFragment.OnItemSelectedListener{

    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rssfeedactivity_main);}

    @Override
    public void onRssItemSelected(String text) {

        DetailFragment fragment = new DetailFragment();
                fragment.getFragmentManager().findFragmentById(R.id.detailFragmant);
        fragment.setText(text);
    }


}

