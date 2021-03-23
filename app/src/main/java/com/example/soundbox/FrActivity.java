package com.example.soundbox;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_fr);

       mButton_1 = findViewById(R.id.imageViewItem);
       mMuteBtn = findViewById(R.id.mute_btn);
       mHomeBtn = findViewById(R.id.home_btn);

        mToolbar = (Toolbar) findViewById(R.id.soundbox_toolbar);
        setSupportActionBar(mToolbar);

        List<String> nameList = Arrays.asList(getResources().getStringArray(R.array.soundsNames));

        SoundObject[] soundItems = {
                new SoundObject(nameList.get(0), R.raw.bruma),
                new SoundObject(nameList.get(1), R.raw.but_somptueux),
                new SoundObject(nameList.get(2), R.raw.coup_de_clim),
                new SoundObject(nameList.get(3), R.raw.coup_du_foulard),
                new SoundObject(nameList.get(4), R.raw.dollar),
                new SoundObject(nameList.get(5), R.raw.et_peng)};

        soundList.addAll(Arrays.asList(soundItems));

        mSoundView = (RecyclerView) findViewById(R.id.soundbox_recycler);

        mSoundLayoutManager = new GridLayoutManager(this,3);

        mSoundView.setLayoutManager(mSoundLayoutManager);

        mSoundView.setAdapter(mSoundAdapter);

    }

    public void homeClick(View v) {
        Intent HomeIntent = new Intent(FrActivity.this, MainActivity.class);
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