package com.example.android.babymusicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OldiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldies);

        MediaPlayer oldiesMusic = MediaPlayer.create(this, R.raw.yummy);

        oldiesMusic.start();
    }
}
