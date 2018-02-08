package com.inception.gamescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_of_a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addScore_A ( int score )
    {
        TextView team_a_score = findViewById(R.id.team_a_score);

        team_a_score.setText( String.valueOf(score) );
    }




    public void add_three_btn(View view) {

        score_of_a = score_of_a + 3;

        addScore_A(score_of_a);
    }

    public void add_two_btn(View view) {

        score_of_a = score_of_a +2;

        addScore_A(score_of_a);
    }

    public void add_one_btn(View view) {

        score_of_a = score_of_a +1;

        addScore_A(score_of_a);
    }


}
