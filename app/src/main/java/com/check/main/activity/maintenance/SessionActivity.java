package com.check.main.activity.maintenance;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.check.main.R;
import com.check.main.data.Session;
import com.check.main.model.PostResponse;
import com.check.main.utils.DialogUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.check.main.data.Constant.CREATE_TRANSITION;

public class SessionActivity extends AppCompatActivity {


    String tanggal, tipeSimulator, nomorSesi, jam;
    String normal, printer, scan, indicator, oxygen, clean, control, breaf, lighting;
    String temperatur, humidity, remark, temp, checked, approved;

    @BindView(R.id.dp_trans)
    EditText etTanggal;
    @BindView(R.id.et_tipe_simulator)
    EditText etTipeSimulator;
    @BindView(R.id.rg_normal)
    RadioGroup rgNormal;
    @BindView(R.id.rg_printer)
    RadioGroup rgPrinter;
    @BindView(R.id.edt_temperatur)
    EditText edtTemperatur;
    @BindView(R.id.edt_humidity)
    EditText edtHumidity;
    @BindView(R.id.rg_scan)
    RadioGroup rgScan;
    @BindView(R.id.rg_indicator)
    RadioGroup rgIndicator;
    @BindView(R.id.rg_lighting)
    RadioGroup rgLighting;
    @BindView(R.id.rg_oxygen)
    RadioGroup rgOxygen;
    @BindView(R.id.rg_clean)
    RadioGroup rgClean;
    @BindView(R.id.edt_temp)
    EditText edtTemp;
    @BindView(R.id.rg_control)
    RadioGroup rgControl;
    @BindView(R.id.rg_breaf)
    RadioGroup rgBreaf;
    @BindView(R.id.edt_remark)
    EditText edtRemark;
    @BindView(R.id.edt_checked)
    EditText edtChecked;
    @BindView(R.id.edt_approved)
    EditText edtApproved;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session1);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        nomorSesi = getIntent().getStringExtra("no_session");
        jam = getIntent().getStringExtra("jam");
        etTanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.dialogTanggal(SessionActivity.this, etTanggal);
            }
        });
        etTipeSimulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] items = getResources().getStringArray(R.array.tipesimulator);
                DialogUtils.dialogArray(SessionActivity.this, items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        etTipeSimulator.setText(items[which]);
                    }
                });
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @OnClick(R.id.btn_savesesi1)
    public void onViewClicked() {
        if (rgNormal.getCheckedRadioButtonId() == R.id.rb_normal_ok) {
            normal = "1";
        } else {
            normal = "0";
        }
        if (rgPrinter.getCheckedRadioButtonId() == R.id.rb_printer_ok) {
            printer = "1";
        } else {
            printer = "0";
        }

        int iScan = rgScan.getCheckedRadioButtonId();
        if (iScan == R.id.rb_scan_ok) {
            scan = "1";
        } else {
            scan = "0";
        }

        int iIndicator = rgIndicator.getCheckedRadioButtonId();
        if (iIndicator == R.id.rb_indicator_ok) {
            indicator = "1";
        } else {
            indicator = "0";
        }

        int ilighting = rgLighting.getCheckedRadioButtonId();
        if (ilighting == R.id.rb_lighting_ok) {
            lighting = "1";
        } else {
            lighting = "0";
        }

        int iOxygen = rgOxygen.getCheckedRadioButtonId();
        if (iOxygen == R.id.rb_oxygen_ok) {
            oxygen = "1";
        } else {
            oxygen = "0";
        }

        int iClean = rgClean.getCheckedRadioButtonId();
        if (iClean == R.id.rb_clean_ok) {
            clean = "1";
        } else {
            clean = "0";
        }

        int iControl = rgControl.getCheckedRadioButtonId();
        if (iControl == R.id.rb_control_ok) {
            control = "1";
        } else {
            control = "0";
        }

        int iBreaf = rgBreaf.getCheckedRadioButtonId();
        if (iBreaf == R.id.rb_breaf_ok) {
            breaf = "1";
        } else {
            breaf = "0";
        }

        checked = edtChecked.getText().toString();
        approved = edtApproved.getText().toString();
        remark = edtRemark.getText().toString();
        humidity = edtHumidity.getText().toString();
        temp = edtTemp.getText().toString();
        temperatur = edtTemperatur.getText().toString();
        tanggal = etTanggal.getText().toString();
        tipeSimulator = etTipeSimulator.getText().toString();

        createTransisi();

    }

    private void createTransisi() {
        AndroidNetworking.post(CREATE_TRANSITION)
                .addBodyParameter("date", tanggal)
                .addBodyParameter("simulator_type", tipeSimulator)
                .addBodyParameter("session", nomorSesi)
                .addBodyParameter("normal_operation", normal)
                .addBodyParameter("printer", printer)
                .addBodyParameter("temperature_host", temperatur)
                .addBodyParameter("humidity", humidity)
                .addBodyParameter("visual", scan)
                .addBodyParameter("indicator", indicator)
                .addBodyParameter("lighting", lighting)
                .addBodyParameter("instructor_station", "0")
                .addBodyParameter("oxygen", oxygen)
                .addBodyParameter("cleanup", clean)
                .addBodyParameter("temperature_cockpit", temp)
                .addBodyParameter("control", control)
                .addBodyParameter("brief", breaf)
                .addBodyParameter("remark", remark)
                .addBodyParameter("check_by", checked)
                .addBodyParameter("approve_by", approved)
                .build()
                .getAsObject(PostResponse.class, new ParsedRequestListener() {
                    @Override
                    public void onResponse(Object response) {
                        if (response instanceof PostResponse) {
                            PostResponse response1 = (PostResponse) response;
                            if (response1.getData().equalsIgnoreCase("1")) {
                                Toast.makeText(SessionActivity.this, "Pengecekan Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
                                finish();
                            } else {
                                Toast.makeText(SessionActivity.this, "Pengecekan Gagal Ditambahkan !", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

                    @Override
                    public void onError(ANError anError) {
                        Toast.makeText(SessionActivity.this, "Gagal Response", Toast.LENGTH_SHORT).show();
                    }

                });
    }
}

