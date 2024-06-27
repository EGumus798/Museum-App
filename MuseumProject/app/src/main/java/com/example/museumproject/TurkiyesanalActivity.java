package com.example.museumproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurkiyesanalActivity extends AppCompatActivity {

    Button button5;
    Button button6;
    Button button7;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkiyesanal);

        button5=findViewById(R.id.buton4);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), TrSanatActivity.class);
                startActivity(intent);
            }
        });
        button6=findViewById(R.id.buton5);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), TrTarihActivity.class);
                startActivity(intent);
            }
        });
        button7=findViewById(R.id.buton6);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), GirisActivity.class);
                startActivity(intent);
            }
        });
    }
}