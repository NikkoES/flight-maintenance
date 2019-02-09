package com.check.main.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

import com.check.main.R;
import com.check.main.activity.auth.LoginActivity;
import com.check.main.data.Session;

public class SplashActivity extends AppCompatActivity {
    TextView tvSplash;

    Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menghilangkan ActionBar
        setContentView(R.layout.activity_splash);

        session = new Session(this);

        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    if (session.isLoggedIn()) {
                        startActivity(new Intent(SplashActivity.this, WelcomeActivity.class));
                    } else {
                        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    }
                }
            }
        };
        thread.start();
    }
}
