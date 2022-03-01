package com.example.project_ibu_ayu_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video7 extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video7);
        VideoView videoView = findViewById(R.id.vid);
//        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.skinrolling);
        videoView.setVideoPath("https://firebasestorage.googleapis.com/v0/b/sportmassageapp.appspot.com/o/skinrolling.mp4?alt=media&token=01d7c90c-3108-4400-b9a2-3bce2133db66");
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
}