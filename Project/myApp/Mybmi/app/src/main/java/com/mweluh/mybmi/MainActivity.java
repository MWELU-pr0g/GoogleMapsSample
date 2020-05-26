package com.mweluh.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {


    private TextView lblBmi, lblMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblBmi = findViewById(R.id.lblBmi);
        lblMessage = findViewById(R.id.lblMessage);

        
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // validate
                
                EditText heightEdittext = findViewById(R.id.height);
                EditText weightEdittext = findViewById(R.id.weight);
                
                String height = heightEdittext.getText().toString().trim();
                String weight = weightEdittext.getText().toString().trim();
                
                if(TextUtils.isEmpty(height) || TextUtils.isEmpty(weight))
                {
                    Toast.makeText(MainActivity.this, "Input error", Toast.LENGTH_SHORT).show();
                }else {
                    performNetworkRequest(height,weight);
                }
            }
        });
    }

    private void performNetworkRequest(String height, String weight) {


        /// singletons
        Call<BmiResponse> responseCall = RetrofitClient.getInstance().getApi().calcBmi(height, weight);

        responseCall.enqueue(new Callback<BmiResponse>() {
            @Override
            public void onResponse(Call<BmiResponse> call, Response<BmiResponse> response) {
                BmiResponse bmiResponse = response.body();

                lblBmi.setText(String.valueOf(bmiResponse.getBmi()));
                lblMessage.setText(bmiResponse.getMessage());
            }

            @Override
            public void onFailure(Call<BmiResponse> call, Throwable t) {
                Log.d("tst", "onFailure: "+ t.getMessage());

                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
