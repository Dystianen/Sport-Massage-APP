package com.example.project_ibu_ayu_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VideoMenu extends AppCompatActivity implements View.OnClickListener {
    private CardView video1Card,video2Card,video3Card,video4Card,video5Card,video6Card,video7Card,video8Card,video9Card,video10Card,video11Card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_menu);

        //defining Cards
        video1Card = (CardView) findViewById(R.id.video1_card);
//        video2Card = (CardView) findViewById(R.id.video2_card);
        video3Card = (CardView) findViewById(R.id.video3_card);
        video4Card = (CardView) findViewById(R.id.video4_card);
        video5Card = (CardView) findViewById(R.id.video5_card);
        video6Card = (CardView) findViewById(R.id.video6_card);
        video7Card = (CardView) findViewById(R.id.video7_card);
        video8Card = (CardView) findViewById(R.id.video8_card);
        video9Card = (CardView) findViewById(R.id.video9_card);


        //add Click listener to the cards
        video1Card.setOnClickListener(this);
//        video2Card.setOnClickListener(this);
        video3Card.setOnClickListener(this);
        video4Card.setOnClickListener(this);
        video5Card.setOnClickListener(this);
        video6Card.setOnClickListener(this);
        video7Card.setOnClickListener(this);
        video8Card.setOnClickListener(this);
        video9Card.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i ;

        switch (v.getId()) {
            case R.id.video1_card:
                i = new Intent(this, Video1.class);startActivity(i);
                break;
            case R.id.video2_card:
                i = new Intent(this, Video2.class);startActivity(i);
                break;
            case R.id.video3_card:
                i = new Intent(this, Video3.class);startActivity(i);
                break;
            case R.id.video4_card:
                i = new Intent(this, Video4.class);startActivity(i);
                break;
            case R.id.video5_card:
                i = new Intent(this, Video5.class);startActivity(i);
                break;
            case R.id.video6_card:
                i = new Intent(this, Video6.class);startActivity(i);
                break;
            case R.id.video7_card:
                i = new Intent(this, Video7.class);startActivity(i);
                break;
            case R.id.video8_card:
                i = new Intent(this, Video8.class);startActivity(i);
                break;
            case R.id.video9_card:
                i = new Intent(this, Video9.class);startActivity(i);
                break;
            default:break ;
        }
    }
}