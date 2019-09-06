package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button myBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);

        Button myBtn = (Button)findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                EditText myEditText = (EditText)findViewById((R.id.editText1));
                Log.d("Proteintracker",myEditText.getText().toString());
            }
        });

        View.OnClickListener myBtnClickListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                EditText myEditText = (EditText)findViewById(R.id.editText1);
                Log.d("Proteintracker",myEditText.getText().toString());
            }
        };
        myBtn.setOnClickListener(myBtnClickListener);

        View.OnClickListener helpButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                Intent intent = new Intent(MainActivity.this,HelpActivity.class);
                startActivity(intent);
            }
        };

        Button helpBtn = (Button)findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);


    }

}


