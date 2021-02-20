package com.thirdparty.converterapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;

import com.thirdparty.converterapp.R;

public class MainActivity extends AppCompatActivity {
    private Button tempButton;
    private Button timeButton;
    private Button currencyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempButton = (Button)findViewById(R.id.tempButton);
        timeButton = (Button)findViewById(R.id.timeButton);
        currencyButton = (Button)findViewById(R.id.currencyButton);

        timeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent tempIntent = new Intent(getApplicationContext(), TimeActivity.class);
                startActivity(tempIntent);
            }
        });


        tempButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent tempIntent = new Intent(getApplicationContext(), TemperatureConverterActivity.class);
                startActivity(tempIntent);
            }
        });

        currencyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent tempIntent = new Intent(getApplicationContext(), CurrencyConverterActivity.class);
                startActivity(tempIntent);
            }
        });
    }

    private void tempListener(){

    }


    private void timeListener(){

    }

    private void currencyListener(){

    }





}