package com.filipe.malachias.activitylifecycledemo;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = "MainActivity";
    private TextView scoreTV;
    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: The activity is being created.");
        scoreTV = findViewById(R.id.scoreTV);
        if (savedInstanceState != null)
        {
            score = savedInstanceState.getInt("SCORE_KEY");
            if (scoreTV != null)
            {
                scoreTV.setText("" + score); // "" + int => "int"
            }
        }

        Button minusBtn = findViewById(R.id.minusBtn);
        Button plusBtn = findViewById(R.id.plusBtn);
        minusBtn.setOnClickListener(this);
        plusBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.minusBtn)
        {
            // -
            score--;
        } else if (v.getId() == R.id.plusBtn)
        {
            // +
            score++;
        }
        scoreTV.setText("" + score);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: The activity is about to become visible.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: The activity is between stopped and started.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: The activity has become visible. It is now resumed!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: Another activity is taking focus. This activity is about to be paused.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: The activity is no longer visible. It is now stopped!");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("SCORE_KEY", score);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: This activity is about to be destroyed.");
    }
}
