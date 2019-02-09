package com.check.main.activity.result;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.check.main.R;

public class ResultActivity extends AppCompatActivity {
    LinearLayout ln_transisi;
    LinearLayout ln_daily;
    LinearLayout ln_monthly;
    LinearLayout ln_three;
    LinearLayout ln_six;
    LinearLayout ln_yearly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextinformation);

        //Find Id
        ln_transisi = findViewById(R.id.ln_transisi);
        ln_daily = findViewById(R.id.ln_daily);
        ln_monthly = findViewById(R.id.ln_monthly);
        ln_three = findViewById(R.id.ln_three);
        ln_six = findViewById(R.id.ln_six);
        ln_yearly = findViewById(R.id.ln_yearly);

        //Action Id
        ln_transisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, DetailTransisiActivity.class);
                startActivity(intent);
            }
        });
        ln_daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, DetailDailyActivity.class);
                startActivity(intent);
            }
        });
        ln_monthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, DetailMonthlyActivity.class);
                startActivity(intent);
            }
        });
        ln_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, DetailThreeMonthActivity.class);
                startActivity(intent);
            }
        });
        ln_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, DetailSixMonthActivity.class);
                startActivity(intent);
            }
        });
        ln_yearly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, DetailYearlyActivity.class);
                startActivity(intent);
            }
        });
    }
}
