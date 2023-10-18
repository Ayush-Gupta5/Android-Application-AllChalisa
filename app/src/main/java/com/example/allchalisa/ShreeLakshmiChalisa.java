package com.example.allchalisa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ShreeLakshmiChalisa extends AppCompatActivity {
MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shree_lakshmi_chalisa);
        m= MediaPlayer.create(this,R.raw.shree_laxmi_chalisa);
    }
    public void play(View view) {
        m.start();
    }
    public void pause(View view) {
        m.pause();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        m.stop();
    }
}