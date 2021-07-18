package com.example.project_ibu_ayu_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VideoButton extends AppCompatActivity implements View.OnClickListener {
    private Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_video);

        //defining Cards
        button1 = (Button) findViewById(R.id.button1_card);
        button2 = (Button) findViewById(R.id.button2_card);


        //add Click listener to the cards
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i ;

        switch (v.getId()) {
            case R.id.button1_card:
                i = new Intent(this, Leher.class);startActivity(i);
                break;
            case R.id.button2_card:
                i = new Intent(this, Button2.class);startActivity(i);
                break;
            default:break ;
        }
    }
}