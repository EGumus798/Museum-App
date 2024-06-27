package com.example.museumproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SmithsonianActivity extends AppCompatActivity {
    Button linkbutton;
    Button button27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smithsonian);

        button27=findViewById(R.id.buton47);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), DunyatarihActivity.class);
                startActivity(intent);
            }
        });

        linkbutton = (Button)findViewById(R.id.buton48);
        linkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object https;
                Uri link=Uri.parse("https://naturalhistory2.si.edu/vt3/NMNH/");
                Intent intent =new Intent(Intent.ACTION_VIEW,link );
                startActivity(intent);
            }
        });
    }
}