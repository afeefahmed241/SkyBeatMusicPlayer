package com.example.skybeatmusicplayer;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public static ArrayList<Audio> audioList;

    @Override
    public void onCreate() {
        super.onCreate();

        audioList = new ArrayList<Audio>();
    }
}
