package com.example.project_ibu_ayu_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TheoryMenu extends AppCompatActivity implements View.OnClickListener {
    private CardView theory1Card, theory2Card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory_menu);

        theory1Card = (CardView) findViewById(R.id.theory1_card);
        theory2Card = (CardView) findViewById(R.id.theory2_card);

        //add Click listener to the cards
        theory1Card.setOnClickListener(this);
        theory2Card.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.theory1_card:
                i = new Intent(this, Theory1.class);startActivity(i);
                break;
            case R.id.theory2_card:
                i = new Intent(this, Theory2.class);startActivity(i);
                break;
            default:break ;
        }
    }
}