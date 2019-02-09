package com.check.main.activity.auth;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.check.main.R;
import com.check.main.activity.WelcomeActivity;
import com.check.main.data.Session;
import com.check.main.utils.DialogUtils;

public class LoginActivity extends AppCompatActivity {
    EditText edt_nip;
    Button btn_login;

    Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Mengambil View dari Layout
        edt_nip = findViewById(R.id.edt_nip);
        btn_login = findViewById(R.id.btn_login);

        session = new Session(this);

        //Action Ketika Edit Text dan Login
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String edt_nipKey = edt_nip.getText().toString();

                String akun = "12345";

                if (edt_nipKey.equals(akun)) {
                    //jika login berhasil
                    session.createLoginSession(akun);
                    Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
                    LoginActivity.this.startActivity(intent);
                    finish();
                } else {
                    //jika login gagal
                    DialogUtils.showSnack(LoginActivity.this, "NIP Tidak Terdaftar !");
                }
            }

        });

    }
}