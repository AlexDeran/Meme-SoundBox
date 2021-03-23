package com.example.soundbox;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MainActivity extends AppCompatActivity {

    ImageView mAppName;
    Button mFR;
    Button mMonde;
    Button mMV;
    Button mJD;
    Button mWTC;
    Button mInconnus;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFR = findViewById(R.id.france_btn);
        mMonde = findViewById(R.id.monde_btn);
        mMV = findViewById(R.id.mv_btn);
        mJD = findViewById(R.id.jd_btn);
        mWTC = findViewById(R.id.wtc_btn);
        mInconnus = findViewById(R.id.inc_btn);

        mFR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FRActivityIntent = new Intent(MainActivity.this, FrActivity.class);
                startActivity(FRActivityIntent);
            }
        });


    }
}