package com.example.licenta_denis_mot;

import android.media.MediaParser;
import android.media.MediaPlayer;

public class MyMediaPlayer {

    static MediaPlayer instance;

    public static MediaPlayer getInstace() {
        if (instance == null) {
            instance = new MediaPlayer();
        }
        return instance;
    }


    public static int currentIndex = -1;
}
