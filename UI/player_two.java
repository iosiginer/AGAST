package com.example.abby.musicapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class player_two extends AppCompatActivity {

    private question q = new question();
    private Question_Factory qf = new Question_Factory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_two);
        this.question(getWindow().getDecorView());
        this.correct_answer(getWindow().getDecorView());
    }


    public void question(View view) {
        TextView phrase = (TextView) findViewById(R.id.textView);
        String question = q.getPhrasing();
        phrase.setText(question);
    }

    public void correct_answer(View view) {
        Button t = (Button) findViewById(R.id.True);
        Button f = (Button) findViewById(R.id.False);
        String answer = q.getCorrectAnswer();
        if (answer.equals("True")) {
            good(t);
            bad(f);
        }
        if (answer.equals("False")) {
            good(f);
            bad(t);
        }
    }

    public void good(Button button) {
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(player_two.this);
                builder1.setMessage("CORRECT ANSWER!!");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Next question",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                qf.NextQuestion();
                                Intent intent = new Intent(player_two.this, two_players.class);
                                startActivity(intent);
                            }
                        });
                AlertDialog alert11 = builder1.create();
                alert11.show();


            }
        });
    }

    public void bad(Button button) {
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(player_two.this);
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
}

