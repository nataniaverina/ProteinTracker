package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        super.onCreate(savedInstanceState);
        TextView myTextView = new TextView(this);
myTextView.setText("Some Help Text");
setContentView(myTextView);
}
}