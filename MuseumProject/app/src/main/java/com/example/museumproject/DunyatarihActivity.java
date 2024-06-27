package com.example.museumproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DunyatarihActivity extends AppCompatActivity {
    Button button27;
    Button button35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dunyatarih);

        button27=findViewById(R.id.buton39);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), DunyasanalActivity.class);
                startActivity(intent);
            }
        });
        button35=findViewById(R.id.buton34);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), SmithsonianActivity.class);
                startActivity(intent);
            }
        });
    }
}