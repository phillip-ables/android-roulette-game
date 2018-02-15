package com.example.techtron.roulette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RouletteActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    ImageView wheelRoul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roulette);
        button = (Button) findViewById(R.id.btn_spin);
        textView = (TextView) findViewById(R.id.textView);
        wheelRoul = (ImageView) findViewById(R.id.imRoulette);
    }
}
