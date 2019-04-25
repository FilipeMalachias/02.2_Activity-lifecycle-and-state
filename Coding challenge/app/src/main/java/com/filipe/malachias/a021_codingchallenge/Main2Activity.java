package com.filipe.malachias.a021_codingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    private TextView displayTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int buttonNumber = intent.getIntExtra(MainActivity.BTN_EXTRA, 1);
        displayTV = findViewById(R.id.textView);

        if (buttonNumber == 1) {
            displayTV.setText(R.string.textview1);
        } else if (buttonNumber == 2) {
            displayTV.setText(R.string.textview2);
        } else {
            displayTV.setText(R.string.textview3);
        }


    }
}
