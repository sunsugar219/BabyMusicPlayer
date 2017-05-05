package com.example.android.babymusicplayer;

import android.content.Intent;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView babySongs = (ImageView) findViewById(R.id.babyshark);

        babySongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent babyIntent = new Intent(MainActivity.this, BabySongsActivity.class);

                startActivity(babyIntent);
            }
        });

        ImageView classical = (ImageView) findViewById(R.id.snowflake);

        classical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent classicalIntent = new Intent(MainActivity.this, ClassicalActivity.class);

                startActivity(classicalIntent);
            }
        });

        ImageView anim = (ImageView) findViewById(R.id.baby_songs);

        anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animIntent = new Intent(MainActivity.this, AnimActivity.class);

                startActivity(animIntent);
            }
        });

        ImageView pop = (ImageView) findViewById(R.id.abc_song);

        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);

                startActivity(popIntent);
            }
        });

        ImageView oldies = (ImageView) findViewById(R.id.yummy);

        oldies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oldiesIntent = new Intent(MainActivity.this, OldiesActivity.class);

                startActivity(oldiesIntent);
            }
        });
    }
}
