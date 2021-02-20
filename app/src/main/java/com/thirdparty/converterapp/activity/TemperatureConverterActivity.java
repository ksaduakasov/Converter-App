package com.thirdparty.converterapp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.thirdparty.converterapp.R;

public class TemperatureConverterActivity extends AppCompatActivity {
    private TextView resultText;
    private EditText wantedTemperature;
    private EditText userTemperature;
    private EditText temperatureAmount;
    private Button resultButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);



        resultText = (TextView)findViewById(R.id.tempResultText);
        wantedTemperature = (EditText)findViewById(R.id.wantedTemperature);
        userTemperature = (EditText)findViewById(R.id.userTemperature);
        temperatureAmount = (EditText)findViewById(R.id.temperatureAmount);
        resultButton = (Button)findViewById(R.id.tempConvertButton);


        resultButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = userTemperature.getText().toString().trim();
                String wantedTemp = wantedTemperature.getText().toString().trim();
                if(temp.equals("C")||temp.equals("F")||
                        wantedTemp.equals("C")||temp.equals("F")){
                    try{
                        Double userTemp = Double.parseDouble(temperatureAmount.getText().toString().trim());
                        Double result = converter(userTemp, temp, wantedTemp);
                        resultText.setText(result.toString());
                    }catch(NumberFormatException e){
                        Toast.makeText(TemperatureConverterActivity.this, "Check your 'temperature' field, please!", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(TemperatureConverterActivity.this, "Supported temperatures: C, F", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }


    private double converter(double temperature, String userTemp, String wantedTemp){
        if (wantedTemp.equals("C")) {
            if (userTemp.equals("F")) {
                return (temperature - 32) * 5/9;
            }
        }

        if (wantedTemp.equals("F")) {
            if (userTemp.equals("C")) {

                return (temperature * 9/5) + 32;
            }
        }
        return temperature;
    }
}
