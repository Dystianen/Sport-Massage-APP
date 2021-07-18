package com.example.project_ibu_ayu_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Segment extends AppCompatActivity implements View.OnClickListener {
    private CardView segment1Card,segment2Card,segment3Card,segment4Card,segment5Card,segment6Card,segment7Card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment_menu);

        //defining Cards
        segment1Card = (CardView) findViewById(R.id.segment1_card);
//        segment2Card = (CardView) findViewById(R.id.segment2_card);
//        segment3Card = (CardView) findViewById(R.id.segment3_card);
//        segment4Card = (CardView) findViewById(R.id.segment4_card);
//        segment5Card = (CardView) findViewById(R.id.segment5_card);
//        segment6Card = (CardView) findViewById(R.id.segment6_card);
//        segment7Card = (CardView) findViewById(R.id.segment7_card);


        //add Click listener to the cards
        segment1Card.setOnClickListener(this);
//        segment2Card.setOnClickListener(this);
//        segment3Card.setOnClickListener(this);
//        segment4Card.setOnClickListener(this);
//        segment5Card.setOnClickListener(this);
//        segment6Card.setOnClickListener(this);
//        segment7Card.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        Intent i ;

        switch (v.getId()) {
            case R.id.segment1_card:
                i = new Intent(this, Leher.class);startActivity(i);
                break;
//            case R.id.segment2_card:
//                i = new Intent(this, Bahu.class);startActivity(i);
//                break;
//            case R.id.segment3_card:
//                i = new Intent(this, Punggung.class);startActivity(i);
//                break;
//            case R.id.segment4_card:
//                i = new Intent(this, Bokong.class);startActivity(i);
//                break;
//            case R.id.segment5_card:
//                i = new Intent(this, PahaBelakang.class);startActivity(i);
//                break;
//            case R.id.segment6_card:
//                i = new Intent(this, BetisBelakang.class);startActivity(i);
//                break;
//            case R.id.segment7_card:
//                i = new Intent(this, TelapakKaki.class);startActivity(i);
//                break;
        }
    }
}