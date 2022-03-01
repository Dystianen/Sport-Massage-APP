package com.example.project_ibu_ayu_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video1 extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1);
        VideoView videoView = findViewById(R.id.vid);
//        String videoPath = "android.resource://"+getPackageName()+"/"+R.raw.petrisage;
        String videoPath = "https://firebasestorage.googleapis.com/v0/b/sportmassageapp.appspot.com/o/petrisage.mp4?alt=media&token=4dcc2c7a-19fb-48a0-9a07-c980a38f50ea";
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
}