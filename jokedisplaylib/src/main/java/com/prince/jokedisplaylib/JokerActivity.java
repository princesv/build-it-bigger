package com.prince.jokedisplaylib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class JokerActivity extends AppCompatActivity {
    TextView textView;
    public static final String TAG_JOKE = "joke-tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);
        textView = findViewById(R.id.joke_view);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra(TAG_JOKE));
    }
}
