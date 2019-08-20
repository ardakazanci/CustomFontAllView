package com.ardakazanci.customfontallview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import me.anwarshahriar.calligrapher.Calligrapher;

public class MainActivity extends AppCompatActivity {

    private Calligrapher calligrapher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"HelveticaNeueUltraLight.ttf",true);






    }
}
