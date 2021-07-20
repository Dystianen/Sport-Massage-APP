package com.example.project_ibu_ayu_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegmentTerlentang extends AppCompatActivity implements View.OnClickListener {
    private CardView segment8Card,segment9Card,segment10Card,segment11Card,segment12Card,segment13Card,segment14Card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment_terlentang);

        //defining Cards
        segment8Card = (CardView) findViewById(R.id.segment8_card);
        segment9Card = (CardView) findViewById(R.id.segment9_card);
        segment10Card = (CardView) findViewById(R.id.segment10_card);
        segment11Card = (CardView) findViewById(R.id.segment11_card);
        segment12Card = (CardView) findViewById(R.id.segment12_card);
        segment13Card = (CardView) findViewById(R.id.segment13_card);
        segment14Card = (CardView) findViewById(R.id.segment14_card);


        //add Click listener to the cards
        segment8Card.setOnClickListener(this);
        segment9Card.setOnClickListener(this);
        segment10Card.setOnClickListener(this);
        segment11Card.setOnClickListener(this);
        segment12Card.setOnClickListener(this);
        segment13Card.setOnClickListener(this);
        segment14Card.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        Intent i ;

        switch (v.getId()) {
            case R.id.segment8_card:
                i = new Intent(this, Dada.class);startActivity(i);
                break;
            case R.id.segment9_card:
                i = new Intent(this, Perut.class);startActivity(i);
                break;
            case R.id.segment10_card:
                i = new Intent(this, PahaDepan.class);startActivity(i);
                break;
            case R.id.segment11_card:
                i = new Intent(this, BetisDepan.class);startActivity(i);
                break;
            case R.id.segment12_card:
                i = new Intent(this, PunggungKaki.class);startActivity(i);
                break;
            case R.id.segment13_card:
                i = new Intent(this, Lengan.class);startActivity(i);
                break;
            case R.id.segment14_card:
                i = new Intent(this, Kepala.class);startActivity(i);
                break;
        }
    }
}