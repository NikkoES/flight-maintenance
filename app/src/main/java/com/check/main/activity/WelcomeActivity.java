package com.check.main.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.check.main.R;
import com.check.main.activity.maintenance.MaintenanceActivity;
import com.check.main.activity.result.ResultActivity;
import com.check.main.activity.schedule.ScheduleActivity;
import com.check.main.data.Session;


public class WelcomeActivity extends AppCompatActivity {
    LinearLayout tv_schedule;
    LinearLayout tv_maintenance;
    LinearLayout tv_information;

    Button buttonLogout;

    Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        session = new Session(this);

        //Mengambil view dari layout
        tv_schedule = findViewById(R.id.tv_schedule);
        tv_maintenance = findViewById(R.id.tv_maintenance);
        tv_information = findViewById(R.id.tv_information);
        buttonLogout = findViewById(R.id.btn_logout);

        //Action ketika klik View
        tv_maintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, MaintenanceActivity.class);
                startActivity(intent);
            }
        });
        tv_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, ScheduleActivity.class);
                startActivity(intent);
            }
        });
        tv_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });
        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session.logoutUser();
            }
        });
    }
}
