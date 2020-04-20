package com.bytedance.clockapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.bytedance.clockapplication.widget.Clock;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    private View mRootView;
    private Clock mClockView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRootView = findViewById(R.id.root);
        mClockView = findViewById(R.id.clock);

    }


}
