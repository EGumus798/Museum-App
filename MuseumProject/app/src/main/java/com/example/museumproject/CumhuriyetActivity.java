package com.example.museumproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CumhuriyetActivity extends AppCompatActivity {
    Button linkbutton;
    Button button26;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cumhuriyet);

        button26=findViewById(R.id.buton43);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), TrSanatActivity.class);
                startActivity(intent);
            }
        });

        linkbutton = (Button)findViewById(R.id.buton44);
        linkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object https;
                Uri link=Uri.parse("https://sanalmuze.gov.tr/muzeler/ankara-kurtulus-savasi-muzesi/");
                Intent intent =new Intent(Intent.ACTION_VIEW,link );
                startActivity(intent);
            }
        });
    }
}