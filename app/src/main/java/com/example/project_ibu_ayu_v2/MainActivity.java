package com.example.project_ibu_ayu_v2;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView theoryCard,videoCard,segmentCard,languageCard,aboutCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadLocale();
        setContentView(R.layout.activity_main);

        //defining Cards
        theoryCard = (CardView) findViewById(R.id.theory_card);
//        videoCard = (CardView) findViewById(R.id.video_card);
        segmentCard = (CardView) findViewById(R.id.segment_card);
        languageCard = (CardView) findViewById(R.id.language_card) ;
        aboutCard = (CardView) findViewById(R.id.about_card);


        //add Click listener to the cards
        theoryCard.setOnClickListener(this);
        segmentCard.setOnClickListener(this);
//        videoCard.setOnClickListener(this);
        languageCard.setOnClickListener(this);
        aboutCard.setOnClickListener(this);

        SliderView sliderView = findViewById(R.id.imageSlider);
        List<Integer> images= new ArrayList<>();
        images.add(R.drawable.anatomi);
        images.add(R.drawable.image1);
        images.add(R.drawable.image2);
        images.add(R.drawable.image3);
        images.add(R.drawable.image4);
        images.add(R.drawable.image5);
        images.add(R.drawable.image6);

        MyAdapter myAdapter = new MyAdapter(images);
        sliderView.setSliderAdapter(myAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.THIN_WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setScrollTimeInSec(3); //set scroll delay in seconds
        sliderView.startAutoCycle();
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.theory_card:
                i = new Intent(this, TheoryMenu.class);startActivity(i);
                break;
            case R.id.segment_card:
                i = new Intent(this, VideoButton.class);startActivity(i);
                break;
//            case R.id.video_card:
//                i = new Intent(this, VideoMenu.class);startActivity(i);
//                break;
            case R.id.language_card:
                showLanguageDialog();
                break;
            case R.id.about_card:
                i = new Intent(this, About.class);startActivity(i);
                break;
            default:break ;
        }

    }

    private void showLanguageDialog() {
        final String[] listItems = new String[] {
                "Indonesia",
                "English"
        };
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
        mBuilder.setTitle("Choose Language...");
        mBuilder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    setLocale("id");
                    recreate();
                } else if (i == 1) {
                    setLocale("en");
                    recreate();
                }
                dialogInterface.dismiss();

            }
        });

        AlertDialog mDialog = mBuilder.create();
        mDialog.show();
    }

    private void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("My_Lang", lang);
        editor.apply();
    }

    public void loadLocale(){
        SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language = prefs.getString("My_Lang", "");
        setLocale(language);
    }
}