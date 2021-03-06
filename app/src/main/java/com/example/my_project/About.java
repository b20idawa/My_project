package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Button button = findViewById(R.id.tillbaka1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("knapp", "Du tryckte på tillbaka!");
                Intent intent = new Intent(About.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}