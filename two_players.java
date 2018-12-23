package com.example.abby.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class two_players extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_players);
    }

    public void player1(View view)
    {
        Intent intent = new Intent(this, player_one.class);
        startActivity(intent);
    }

    public void question(View view) {
        view.findViewById(R.id.textView)
    }

    public void player2(View view)
    {
        Intent intent = new Intent(this, player_two.class);
        startActivity(intent);
    }
}
