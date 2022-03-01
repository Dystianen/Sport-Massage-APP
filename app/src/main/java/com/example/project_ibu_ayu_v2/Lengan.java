package com.example.project_ibu_ayu_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Lengan extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment_2);
        VideoView videoView = findViewById(R.id.segment);
//        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.lengantangan);
        videoView.setVideoPath("https://firebasestorage.googleapis.com/v0/b/sportmassageapp.appspot.com/o/lengantangan.mp4?alt=media&token=ced92f6b-cdf0-463e-9c96-5a1efe3cd0e5");
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
}