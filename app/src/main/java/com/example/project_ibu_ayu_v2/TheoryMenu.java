package com.example.project_ibu_ayu_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TheoryMenu extends AppCompatActivity implements View.OnClickListener {
    private CardView profil, definisi, sejarah, etika1, etika2, anatomi, fisiologi, metode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory_menu);

        profil = (CardView) findViewById(R.id.profile_card);
        definisi = (CardView) findViewById(R.id.definition_card);
        sejarah = (CardView) findViewById(R.id.history_card);
        etika1 = (CardView) findViewById(R.id.ethics1_card);
        etika2 = (CardView) findViewById(R.id.ethics2_card);
        anatomi = (CardView) findViewById(R.id.anatomy_card);
        fisiologi = (CardView) findViewById(R.id.physiology_card);
        metode = (CardView) findViewById(R.id.method_card);

        //add Click listener to the cards
        profil.setOnClickListener(this);
        definisi.setOnClickListener(this);
        sejarah.setOnClickListener(this);
        etika1.setOnClickListener(this);
        etika2.setOnClickListener(this);
        anatomi.setOnClickListener(this);
        fisiologi.setOnClickListener(this);
        metode.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.profile_card:
                i = new Intent(this, Profil.class);startActivity(i);
                break;
            case R.id.definition_card:
                i = new Intent(this, Definisi.class);startActivity(i);
                break;
            case R.id.history_card:
                i = new Intent(this, Sejarah.class);startActivity(i);
                break;
            case R.id.ethics1_card:
                i = new Intent(this, Etika.class);startActivity(i);
                break;
            case R.id.ethics2_card:
                i = new Intent(this, Etika2.class);startActivity(i);
                break;
            case R.id.anatomy_card:
                i = new Intent(this, Anatomi.class);startActivity(i);
                break;
            case R.id.physiology_card:
                i = new Intent(this, Fisiologi.class);startActivity(i);
                break;
            case R.id.method_card:
                i = new Intent(this, Metode.class);startActivity(i);
                break;
            default:break ;
        }
    }
}