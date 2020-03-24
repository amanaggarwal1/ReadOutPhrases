package com.example.phrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer = new MediaPlayer();

    public void readOut(View view){
        if(mediaPlayer.isPlaying()){
            mediaPlayer.stop();
        }
        Button button = (Button) view;
        mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(button.getTag().toString(), "raw", getPackageName()));
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
