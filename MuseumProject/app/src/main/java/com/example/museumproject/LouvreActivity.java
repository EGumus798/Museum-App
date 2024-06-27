package com.example.museumproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LouvreActivity extends AppCompatActivity {
    Button linkbutton;
    Button button27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_louvre);

        button27=findViewById(R.id.buton45);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), DunyaSanatActivity.class);
                startActivity(intent);
            }
        });

        linkbutton = (Button)findViewById(R.id.buton46);
        linkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object https;
                Uri link=Uri.parse("https://petitegalerie.louvre.fr/visite-virtuelle/saison5/");
                Intent intent =new Intent(Intent.ACTION_VIEW,link );
                startActivity(intent);
            }
        });
    }
}