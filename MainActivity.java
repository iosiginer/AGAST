package com.example.abby.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trivia(View view)
    {
        Intent intent = new Intent(this, Trivia.class);
        startActivity(intent);
    }

    public void two_players(View view)
    {
        Intent intent = new Intent(this, two_players.class);
        startActivity(intent);
    }
}
