package com.example.android.project2_baseballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.project2_baseballcounter.R;

public class MainActivity extends AppCompatActivity {

    // Variables hold Team A run and out scores
    int teamA_RunScore = 0;
    int teamB_RunScore = 0;

    // Variables hold Team B run and out scores
    int teamA_OutScore = 0;
    int teamB_OutScore = 0;

    // Variables hold the current inning
    int inning = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given run and out score for Team A.
     */
    public void displayTeamARun(int runScore) {
        TextView ArunView = (TextView) findViewById(R.id.teamArun_score);
        ArunView.setText(String.valueOf(runScore));
    }

    public void teamARunPoint(View view) {
        teamA_RunScore += 1;
        displayTeamARun(teamA_RunScore);
    }

    public void displayTeamAOut(int outScore) {
        TextView AoutView = (TextView) findViewById(R.id.teamAout_score);
        AoutView.setText(String.valueOf(outScore));
    }

    public void teamAOutPoint(View view) {
        teamA_OutScore += 1;
        displayTeamAOut(teamA_OutScore);
    }


    /*
     * Displays the given score run and out for Team B
     */

    public void displayTeamBRun(int runScore) {
        TextView BrunView = (TextView) findViewById(R.id.teamBrun_score);
        BrunView.setText(String.valueOf(runScore));
    }

    public void teamBRunPoint(View view) {
        teamB_RunScore += 1;
        displayTeamBRun(teamB_RunScore);
    }

    public void displayTeamBOut(int outScore) {
        TextView BoutView = (TextView) findViewById(R.id.teamBout_score);
        BoutView.setText(String.valueOf(outScore));
    }

    public void teamBOutPoint(View view) {
        teamB_OutScore += 1;
        displayTeamBOut(teamB_OutScore);
    }


    /*
     * Displays Innings
     */

    public void displayInning(int inning){
        TextView inningView = (TextView) findViewById(R.id.inning_score);
        inningView.setText(String.valueOf(inning));
    }

    public void minusInning(View view){
        inning -= 1;
        displayInning(inning);
    }

    public void addInning(View view){
        inning += 1;
        displayInning(inning);
    }

    /*
     * Resets run, out and inning scores
     */
    public void resetScore(View view){
        teamA_RunScore = 0;
        teamB_RunScore = 0;
        teamA_OutScore = 0;
        teamB_OutScore = 0;
        inning = 0;

        displayTeamARun(teamA_RunScore);
        displayTeamBRun(teamB_RunScore);
        displayTeamAOut(teamA_OutScore);
        displayTeamBOut(teamB_OutScore);
        displayInning(inning);
    }

}
