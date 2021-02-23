package com.thirdparty.converterapp.activity;

import android.widget.TextClock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.thirdparty.converterapp.R;


public class TimeActivity extends AppCompatActivity {
private TextClock cairoClock;
private TextClock fiijiClock;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        fiijiClock = (TextClock)findViewById(R.id.fiijiClock);
        cairoClock = (TextClock)findViewById(R.id.cairoClock);
        cairoClock.setTimeZone("Africa/Cairo");
        fiijiClock.setTimeZone("Pacific/Fiji");
        fiijiClock.setFormat12Hour("hh:mm:ss a");
        cairoClock.setFormat12Hour("hh:mm:ss a");
    }


}
