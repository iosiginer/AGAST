package com.example.abby.musicapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Trivia extends AppCompatActivity {

    private question q = new question();
    private Question_Factory qf = new Question_Factory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trivia);
        this.question(getWindow().getDecorView());
        this.options(getWindow().getDecorView());
    }

    public void question(View view) {
        TextView phrase = (TextView) findViewById(R.id.textView);
        String question = q.getPhrasing();
        phrase.setText(question);
    }

    public void options(View view) {
        Button b1 = (Button) findViewById(R.id.HighScores);
        Button b2 = (Button) findViewById(R.id.highScores);
        Button b3 = (Button) findViewById(R.id.highScores2);
        Button b4 = (Button) findViewById(R.id.highScores3);
        ArrayList<String> options = q.getOptions();
        b1.setText(options.get(0));
        b2.setText(options.get(1));
        b3.setText(options.get(2));
        b4.setText(options.get(3));
        int value = correct(options);
        checkValue(value, b1, b2, b3, b4);
    }

    public void checkValue(int value, Button b1, Button b2, Button b3, Button b4) {
        if(value == 0) correct_answer(b1);
        if(value != 0) wrong_answer(b1);
        if(value == 1) correct_answer(b2);
        if(value != 1) wrong_answer(b2);
        if (value == 2) correct_answer(b3);
        if(value != 2) wrong_answer(b3);
        if (value == 3) correct_answer(b4);
        if(value != 3) wrong_answer(b4);
    }

    public void correct_answer(Button button) {
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(Trivia.this);
                builder1.setMessage("CORRECT ANSWER!!");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Next question",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                qf.NextQuestion();
                                Intent intent = new Intent(Trivia.this, Trivia.class);
                                startActivity(intent);
                            }
                        });
                AlertDialog alert11 = builder1.create();
                alert11.show();




            }
        });
    }

    public void wrong_answer(Button button) {
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(Trivia.this);
                builder1.setMessage("WRONG ANSWER!!");
                builder1.setCancelable(true);

                builder1.setNegativeButton(
                        "Try Again",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert11 = builder1.create();
                alert11.show();

            }
        });
    }

    public int correct(ArrayList<String> options) {
        String correct_answer = q.getCorrectAnswer();
        for(int i = 0; i < options.size(); i++) {
            if (correct_answer.equals(options.get(i))) {
                return i;
            }
        }
        return 0;
    }

}
