package com.example.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void readName(view view){
        TextView base = findViewById(R.id.textName);
        BreakIterator name = null;
        String textName = name.getText().toString();
        Toast.makeText(this,textName,Toast.LENGTH_SHORT).show();


    }


}