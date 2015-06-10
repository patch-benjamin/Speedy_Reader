package com.example.benjaminpatch.speedyreader;

import android.media.MediaPlayer;

/**
 * Created by benjaminpatch on 6/10/15.
 */
public class AudioPlayer {
    private MediaPlayer levelAudio;
    private boolean isPaused;

    public AudioPlayer(){
        isPaused = false;
    }

    public void newLevel(MediaPlayer audio){
        levelAudio = audio;
        isPaused = false;
        levelAudio = audio;
        pausePlay();
    }

    public void pausePlay(){
        if(!isPaused){
            levelAudio.pause();
            isPaused = true;
        }
        else if(levelAudio != null){
            levelAudio.start();
            isPaused = false;
        }
    }

    public void releaseAudio(){
        levelAudio.release();
    }
}
