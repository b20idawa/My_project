package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Animals[] animals;
    ArrayAdapter<Animals> adapter;
    private ArrayList<Animals> animalsArrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.firstbutton);
        Button button2 = findViewById(R.id.secondbutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("knapp", "Du tryckte på första knappen!");
                Intent intent = new Intent(MainActivity.this, Savannen.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("knapp", "Du tryckte på andra knappen!");
                Intent intent = new Intent(MainActivity.this, Djungeln.class);
                startActivity(intent);
            }
        });
    }
}