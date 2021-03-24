package com.example.soundbox;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageButton mMuteBtn;
    private MediaPlayer mPlayer;
    private ImageButton mButton_1;
    private ImageButton mHomeBtn;

    Toolbar mToolbar;

    ArrayList<SoundObject> soundList = new ArrayList<>();

    RecyclerView mSoundView;

    SoundboxRecyclerAdapter mSoundAdapter = new SoundboxRecyclerAdapter(soundList);

    RecyclerView.LayoutManager mSoundLayoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mButton_1 = findViewById(R.id.imageViewItem);
       mMuteBtn = findViewById(R.id.mute_btn);

        mToolbar = findViewById(R.id.soundbox_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        List<String> nameList = Arrays.asList(getResources().getStringArray(R.array.soundsNames));

        SoundObject[] soundItems = {
                new SoundObject(nameList.get(0), R.raw.bruma),
                new SoundObject(nameList.get(1), R.raw.but_somptueux),
                new SoundObject(nameList.get(2), R.raw.coup_de_clim),
                new SoundObject(nameList.get(3), R.raw.coup_du_foulard),
                new SoundObject(nameList.get(4), R.raw.dollar),
                new SoundObject(nameList.get(5), R.raw.et_peng)};

        soundList.addAll(Arrays.asList(soundItems));

        mSoundView = findViewById(R.id.soundbox_recycler);

        mSoundLayoutManager = new GridLayoutManager(this,3);

        mSoundView.setLayoutManager(mSoundLayoutManager);

        mSoundView.setAdapter(mSoundAdapter);

    }

    public void homeClick(View v) {
        Intent HomeIntent = new Intent(MainActivity.this, SplashScreenActivity.class);
        startActivity(HomeIntent);
        EventHandlerClass.releaseSound();
    }

    public void stopSound(View v) {
        EventHandlerClass.stopSound();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        EventHandlerClass.releaseSound();
    }
}