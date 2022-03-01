package com.example.project_ibu_ayu_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video2 extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video2);
        VideoView videoView = findViewById(R.id.vid);
//        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.shaking);
        videoView.setVideoPath("https://firebasestorage.googleapis.com/v0/b/sportmassageapp.appspot.com/o/shaking.mp4?alt=media&token=5834c9d1-7e57-42ad-8b3f-2ec136abe877");
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
}