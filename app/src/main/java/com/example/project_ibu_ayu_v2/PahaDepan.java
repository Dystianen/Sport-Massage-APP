package com.example.project_ibu_ayu_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class PahaDepan extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment_2);
        VideoView videoView = findViewById(R.id.segment);
//        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.pahadepan);
        videoView.setVideoPath("https://firebasestorage.googleapis.com/v0/b/sportmassageapp.appspot.com/o/pahadepan.mp4?alt=media&token=9c8df898-4057-4eca-8098-f60bf1888e33");
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
}