package com.check.main.activity.maintenance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.check.main.R;

public class ListSessionActivity extends AppCompatActivity {
    Button btnSession1;
    Button btnSession2;
    Button btnSession3;
    Button btnSession4;
    Button btnSession5;
    Button btnSession6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);

        //View Project
        btnSession1 = findViewById(R.id.sesisatu);
        btnSession2 = findViewById(R.id.sesidua);
        btnSession3 = findViewById(R.id.sesitiga);
        btnSession4 = findViewById(R.id.sesiempat);
        btnSession5 = findViewById(R.id.sesilima);
        btnSession6 = findViewById(R.id.sesienam);

        //Action Project
        btnSession1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListSessionActivity.this, SessionActivity.class);
                intent.putExtra("no_session", "1");
                intent.putExtra("jam", "02.10 - 06.00");
                startActivity(intent);
            }
        });
        btnSession2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListSessionActivity.this, SessionActivity.class);
                intent.putExtra("no_session", "2");
                intent.putExtra("jam", "06.10 - 10.00");
                startActivity(intent);
            }
        });
        btnSession3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListSessionActivity.this, SessionActivity.class);
                intent.putExtra("no_session", "3");
                intent.putExtra("jam", "10.10 - 14.00");
                startActivity(intent);
            }
        });
        btnSession4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListSessionActivity.this, SessionActivity.class);
                intent.putExtra("no_session", "4");
                intent.putExtra("jam", "14.10 - 18.00");
                startActivity(intent);
            }
        });
        btnSession5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListSessionActivity.this, SessionActivity.class);
                intent.putExtra("no_session", "5");
                intent.putExtra("jam", "18.10 - 22.00");
                startActivity(intent);
            }
        });
        btnSession6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListSessionActivity.this, SessionActivity.class);
                intent.putExtra("no_session", "6");
                intent.putExtra("jam", "22.10 - 02.00");
                startActivity(intent);
            }
        });
    }
}

