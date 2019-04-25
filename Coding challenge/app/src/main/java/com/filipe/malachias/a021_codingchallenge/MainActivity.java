package com.filipe.malachias.a021_codingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    public static final String BTN_EXTRA = "btnNumber";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchMain2Activity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, Main2Activity.class);
        Button button = (Button) view;
        if (button.getId() == R.id.BtnOne) {
            intent.putExtra(BTN_EXTRA, 1);
        } else if (button.getId() == R.id.BtnTwo) {
            intent.putExtra(BTN_EXTRA, 2);
        } else {
            intent.putExtra(BTN_EXTRA, 3);
        }
        startActivity(intent);
    }
}