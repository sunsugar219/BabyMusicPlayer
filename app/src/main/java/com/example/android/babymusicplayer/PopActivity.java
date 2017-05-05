package com.example.android.babymusicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        MediaPlayer popMusic = MediaPlayer.create(this, R.raw.abc);

        popMusic.start();
/*
        VideoView popVideo = (VideoView) findViewById(R.id.pop_video);

        popVideo.setVideoPath("https://www.youtube.com/watch?v=GIQn8pab8Vc&list=RDGIQn8pab8Vc");
        popVideo.start();*/
    }
}
