package com.example.benjaminpatch.speedyreader;

import java.util.logging.Level;

/**
 * Created by benjaminpatch on 6/10/15.
 */
public class LevelHistory {
    private int level;
    private int timesCompleted;

    LevelHistory(int setlevel){
        level = setlevel;
        timesCompleted = 0;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int newLevel){
        level = newLevel;
    }

    public void completed(){
        timesCompleted++;
    }

    public void adjustLevel(int numCompleted){
        timesCompleted += numCompleted;
    }

}

