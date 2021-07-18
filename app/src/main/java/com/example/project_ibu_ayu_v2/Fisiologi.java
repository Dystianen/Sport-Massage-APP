package com.example.project_ibu_ayu_v2;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Fisiologi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisiologi);
        ImageView imageView = findViewById(R.id.theory);
    }
}
