package com.alexslab.soundbox;/* Created by Alexandre Labreveux */

import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.widget.PopupMenu;

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

    public static void popupManager(final View view, final SoundObject soundObject){

        PopupMenu popup = new PopupMenu(view.getContext(),view);
        popup.getMenuInflater().inflate(R.menu.longclick,popup.getMenu());
        popup.show();
    }
}
