package com.example.soundbox;/* Created by Alexandre Labreveux */

import android.media.MediaPlayer;
import android.os.Environment;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EventHandlerClass {
    private static final String LOG_TAG="EVENTHANDLER";

    private static MediaPlayer mMediaPlayer;

    public static void startSound(View view, Integer soundID){

        try{

            if(soundID != null){
                if(mMediaPlayer != null) {
                    mMediaPlayer.reset();
                }
                    mMediaPlayer = MediaPlayer.create(view.getContext(),soundID);
                    mMediaPlayer.start();
            }

        } catch (Exception e){
            Log.e(LOG_TAG, "Erreur lors de l'initialisation de MediaPlayer" + e.getMessage());
        }

    }

    public static void stopSound(){
        if (mMediaPlayer != null){
            mMediaPlayer.stop();
            mMediaPlayer = null;
        }
    }


    public static void releaseSound(){
        if (mMediaPlayer != null){

            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}
