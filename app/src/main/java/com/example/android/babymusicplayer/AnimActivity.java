package com.example.android.babymusicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim);

        MediaPlayer animMusic = MediaPlayer.create(this, R.raw.star);

        animMusic.start();

    }
}
