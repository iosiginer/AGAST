package com.example.abby.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class two_players extends AppCompatActivity {

    private question q = new question();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_players);
        this.question(getWindow().getDecorView());
    }

    public void player1(View view)
    {
        Intent intent = new Intent(this, player_one.class);
        startActivity(intent);
    }


    public void player2(View view)
    {
        Intent intent = new Intent(this, player_two.class);
        startActivity(intent);
    }

    public void question(View view) {
        TextView phrase = (TextView) findViewById(R.id.textView);
        String question = q.getPhrasing();
        phrase.setText(question);
    }
}
