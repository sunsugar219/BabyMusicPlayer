package com.example.android.babymusicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BabySongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_songs);

        MediaPlayer babyMusic = MediaPlayer.create(this, R.raw.babyshark);

        babyMusic.start();
    }
}
