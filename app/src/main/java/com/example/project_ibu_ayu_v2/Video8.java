package com.example.project_ibu_ayu_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video8 extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video8);
        VideoView videoView = findViewById(R.id.vid);
//        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.stroking);
        videoView.setVideoPath("https://firebasestorage.googleapis.com/v0/b/sportmassageapp.appspot.com/o/stroking.mp4?alt=media&token=9dac778d-63a1-41a4-9c99-885e50dbdeba");
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
}