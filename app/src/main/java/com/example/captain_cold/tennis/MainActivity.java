package com.example.captain_cold.tennis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * adds three to the given score for Team A.
     */
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 30;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adds two to the given score for Team A.
     */
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 20;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adds one to the given score for Team A.
     */
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * adds three to the given score for Team B.
     */
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 30;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adds two to the given score for Team B.
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 20;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adds one to the given score for Team B.
     */
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    /**
     * this method clears the scores for both team A and B.
     */
    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
