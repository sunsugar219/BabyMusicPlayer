package com.example.android.babymusicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classical);

        MediaPlayer classicalMusic = MediaPlayer.create(this,R.raw.snowflake);

        classicalMusic.start();
    }
}
