package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void score3A(View view) {
        scoreA=scoreA+3;
        displayA(scoreA);

    }
    public void score2A(View view) {
        scoreA=scoreA+2;
        displayA(scoreA);

    }
    public void score1A(View view) {
        scoreA=scoreA+1;
        displayA(scoreA);

    }

  /**For Team B*/
    public void score3B(View view) {
        scoreB=scoreB+3;
        displayB(scoreB);

    }
    public void score2B(View view) {
        scoreB=scoreB+2;
        displayB(scoreB);

    }
    public void score1B(View view) {
        scoreB=scoreB+1;
        displayB(scoreB);

    }
    public void reset(View view) {
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);

    }
    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA);
        quantityTextView.setText("" + number);
    }
    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB);
        quantityTextView.setText("" + number);
    }

}
