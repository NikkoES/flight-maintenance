package com.check.main.activity.maintenance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.check.main.R;

public class MaintenanceActivity extends AppCompatActivity {
    LinearLayout transisi;
    LinearLayout daily;
    LinearLayout monthly;
    LinearLayout three_monthly;
    LinearLayout six_monthly;
    LinearLayout yearly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //View Id
        transisi = findViewById(R.id.ln_transisi);
        daily = findViewById(R.id.ln_daily);
        monthly = findViewById(R.id.ln_monthly);
        three_monthly = findViewById(R.id.ln_three);
        six_monthly = findViewById(R.id.ln_six);
        yearly = findViewById(R.id.ln_yearly);

        //Action
        transisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaintenanceActivity.this, ListSessionActivity.class);
                startActivity(intent);
            }
        });
        daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaintenanceActivity.this, DailyCheckActivity.class);
                startActivity(intent);
            }
        });
        monthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaintenanceActivity.this, MonthlyCheckActivity.class);
                intent.putExtra("tipe", "one");
                intent.putExtra("judul", "Monthly Maintenance");
                startActivity(intent);
            }
        });
        three_monthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaintenanceActivity.this, MonthlyCheckActivity.class);
                intent.putExtra("tipe", "three");
                intent.putExtra("judul", "Three Month Maintenance");
                startActivity(intent);
            }
        });
        six_monthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaintenanceActivity.this, MonthlyCheckActivity.class);
                intent.putExtra("tipe", "six");
                intent.putExtra("judul", "Six Month Maintenance");
                startActivity(intent);
            }
        });
        yearly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaintenanceActivity.this, MonthlyCheckActivity.class);
                intent.putExtra("tipe", "year");
                intent.putExtra("judul", "Yearly Maintenance");
                startActivity(intent);
            }
        });
    }
}