package com.chaturvediji.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Playerinit();

    }

    public void Playerinit(){
        mediaPlayer=MediaPlayer.create(this,R.raw.song);
    }

    public void play(View v){
        mediaPlayer.start();
    }

    public void pause(View v){
        mediaPlayer.pause();
    }

    public void stop(View v){
        mediaPlayer.stop();
        Playerinit();
    }

    public void forward(View v){
        int current=mediaPlayer.getCurrentPosition();
        int dur=mediaPlayer.getDuration();
        if(current+5000<dur){
            mediaPlayer.seekTo(current+5000);
        }
    }

    public void rewind(View v){
        int current=mediaPlayer.getCurrentPosition();
        if(current-5000>0){
            mediaPlayer.seekTo(current-5000);
        }
    }
}
