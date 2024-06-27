package com.example.museumproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DunyaSanatActivity extends AppCompatActivity {

    Button button25;
    Button button26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dunya_sanat);

        button25=findViewById(R.id.buton27);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), LouvreActivity.class);
                startActivity(intent);
            }
        });

        button26=findViewById(R.id.buton32);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), DunyasanalActivity.class);
                startActivity(intent);
            }
        });
    }
}