package com.aboutfuture.androidjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokePassed = findViewById(R.id.joke_passed_tv);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("joke")) {
            String joke = intent.getStringExtra("joke");
            if (!TextUtils.isEmpty(joke)) {
                jokePassed.setText(joke);
            }
        }

    }
}
