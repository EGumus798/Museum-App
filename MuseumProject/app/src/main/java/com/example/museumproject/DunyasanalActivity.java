package com.example.museumproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DunyasanalActivity extends AppCompatActivity {
    Button button8;
    Button button9;
    Button button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dunyasanal);
        button8=findViewById(R.id.buton7);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), DunyaSanatActivity.class);
                startActivity(intent);
            }
        });
        button9=findViewById(R.id.buton8);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), DunyatarihActivity.class);
                startActivity(intent);
            }
        });
        button10=findViewById(R.id.buton9);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), GirisActivity.class);
                startActivity(intent);
            }
        });
    }
}