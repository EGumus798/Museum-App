package com.example.museumproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NemrutActivity extends AppCompatActivity {
 Button linkbutton;
 Button button25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nemrut);

        button25=findViewById(R.id.buton41);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), TrSanatActivity.class);
                startActivity(intent);
            }
        });

        linkbutton = (Button)findViewById(R.id.buton42);
        linkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object https;
                Uri link=Uri.parse("https://sanalmuze.gov.tr/muzeler/ADIYAMAN_NEMRUT_ORENYERI/");
                Intent intent =new Intent(Intent.ACTION_VIEW,link );
                startActivity(intent);
            }
        });
    }
}