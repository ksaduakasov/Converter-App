package com.thirdparty.converterapp.activity;

import android.widget.TextClock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.thirdparty.converterapp.R;


public class TimeActivity extends AppCompatActivity {
private TextClock astanaClock;
private TextClock laClock;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        laClock = (TextClock)findViewById(R.id.laTextClock);
        astanaClock = (TextClock)findViewById(R.id.astanaTextClock);
        laClock.setTimeZone("America/Los_Angeles");
        laClock.setFormat12Hour("hh:mm:ss a");
        astanaClock.setFormat12Hour("hh:mm:ss a");
    }


}
