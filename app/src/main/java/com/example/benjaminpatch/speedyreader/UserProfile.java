package com.example.benjaminpatch.speedyreader;

/**
 * Created by benjaminpatch on 6/10/15.
 */

public class UserProfile {
    String name;
    int level;
    LevelHistory [] levelsVisited = new LevelHistory[MainActivity.NUM_LEVELS];

    public UserProfile(String newName, int newLevel){
        setName(newName);

    }
    public int getLevel(){
        return level;
    }

    public void setLevel(int newLevel){
        level = newLevel;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public void completedLevel(int level){
        levelsVisited[level].completed();
    }
}
