package com.check.main.activity.maintenance;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.check.main.R;
import com.check.main.model.PostResponse;
import com.check.main.utils.DialogUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.check.main.data.Constant.CREATE_DAILY;

public class DailyCheckActivity extends AppCompatActivity {

    @BindView(R.id.edt_date)
    EditText edtDate;
    @BindView(R.id.edt_tipe_simulator)
    EditText edtTipeSimulator;
    @BindView(R.id.rg_chassis)
    RadioGroup rgChassis;
    @BindView(R.id.rg_supply)
    RadioGroup rgSupply;
    @BindView(R.id.rg_normal)
    RadioGroup rgNormal;
    @BindView(R.id.rg_all)
    RadioGroup rgAll;
    @BindView(R.id.rg_terminal)
    RadioGroup rgTerminal;
    @BindView(R.id.rg_printer)
    RadioGroup rgPrinter;
    @BindView(R.id.edt_temp3)
    EditText edtTemp3;
    @BindView(R.id.edt_humidity)
    EditText edtHumidity;
    @BindView(R.id.rg_power)
    RadioGroup rgPower;
    @BindView(R.id.rg_console)
    RadioGroup rgConsole;
    @BindView(R.id.rg_indicators)
    RadioGroup rgIndicators;
    @BindView(R.id.rg_communication)
    RadioGroup rgCommunication;
    @BindView(R.id.rg_lighting_system)
    RadioGroup rgLightingSystem;
    @BindView(R.id.rg_instructor)
    RadioGroup rgInstructor;
    @BindView(R.id.rg_visual)
    RadioGroup rgVisual;
    @BindView(R.id.rg_oxygen)
    RadioGroup rgOxygen;
    @BindView(R.id.rg_fire)
    RadioGroup rgFire;
    @BindView(R.id.rg_operation1)
    RadioGroup rgOperation1;
    @BindView(R.id.rg_operation)
    RadioGroup rgOperation;
    @BindView(R.id.rg_normal_operation)
    RadioGroup rgNormalOperation;
    @BindView(R.id.rg_clean)
    RadioGroup rgClean;
    @BindView(R.id.rg_all_fans)
    RadioGroup rgAllFans;
    @BindView(R.id.rg_xmt_host)
    RadioGroup rgXmtHost;
    @BindView(R.id.rg_xmt)
    RadioGroup rgXmt;
    @BindView(R.id.edt_temp1)
    EditText edtTemp1;
    @BindView(R.id.edt_temp2)
    EditText edtTemp2;
    @BindView(R.id.edt_carried_out)
    EditText edtCarriedOut;
    @BindView(R.id.edt_approved_name)
    EditText edtApprovedName;
    @BindView(R.id.edt_temp4)
    EditText edtTemp4;
    @BindView(R.id.edt_temp5)
    EditText edtTemp5;
    @BindView(R.id.edt_temp6)
    EditText edtTemp6;

    String date, typeSimulator, chassis,hostChassis, hostPower, hostNode, hostConsole, hostNormal, cockpitTemperature;
    String hostPrinter, hostTemperature, hostHumidity, visualPower, visualConsole, cockpitIndicator, cockpitCommunication, cockpitLighting, cockpitInstructur, cockpitVisual;
    String cockpitOxygen, cockpitFire, controlNormal, drawbridgeNormal, motionNormal, motionClean, emmAll;
    String emmMonitorXmt, emmMotionRev, emmTemperature, airSupply, airReturn, airTemperature, approvedBy, checkBy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_check);
        ButterKnife.bind(this);

    }

    public void checkValidation() {
        if (rgChassis.getCheckedRadioButtonId() == R.id.rb_chassis_ok) {
            chassis = "1";
        } else {
            chassis = "0";
        }
        if (rgSupply.getCheckedRadioButtonId() == R.id.rb_supply_ok) {
            airSupply = "1";
        } else {
            airSupply = "0";
        }
        if (rgNormal.getCheckedRadioButtonId() == R.id.rb_normal_ok) {
            controlNormal = "1";
        } else {
            controlNormal = "0";
        }
        if (rgAll.getCheckedRadioButtonId() == R.id.rb_all_nok) {
            emmAll = "1";
        } else {
            emmAll = "0";
        }
        if (rgPrinter.getCheckedRadioButtonId() == R.id.rb_printer_ok) {
            hostPrinter = "1";
        } else {
            hostPrinter = "0";
        }
        if (rgPower.getCheckedRadioButtonId() == R.id.rb_power_ok) {
            hostPrinter = "1";
        } else {
            hostPrinter = "0";
        }
        if (rgConsole.getCheckedRadioButtonId() == R.id.rb_console_ok) {
            visualConsole = "1";
        } else {
            visualConsole = "0";
        }
        if (rgIndicators.getCheckedRadioButtonId() == R.id.rb_indicators_ok) {
            cockpitIndicator = "1";
        } else {
            cockpitIndicator = "0";
        }
        if (rgCommunication.getCheckedRadioButtonId() == R.id.rb_communication_ok) {
            cockpitCommunication = "1";
        } else {
            cockpitCommunication = "0";
        }
        if (rgLightingSystem.getCheckedRadioButtonId() == R.id.rb_lighting_system_ok) {
            cockpitLighting = "1";
        } else {
            cockpitLighting = "0";
        }
        if (rgInstructor.getCheckedRadioButtonId() == R.id.rb_instructor_ok) {
            cockpitInstructur = "1";
        } else {
            cockpitInstructur = "0";
        }
        if (rgVisual.getCheckedRadioButtonId() == R.id.rb_visual_ok) {
            cockpitVisual = "1";
        } else {
            cockpitVisual = "0";
        }
        if (rgOxygen.getCheckedRadioButtonId() == R.id.rb_oxygen_ok) {
            cockpitOxygen = "1";
        } else {
            cockpitOxygen = "0";
        }
        if (rgFire.getCheckedRadioButtonId() == R.id.rb_fire_ok) {
            cockpitFire = "1";
        } else {
            cockpitFire = "0";
        }
        if (rgNormalOperation.getCheckedRadioButtonId() == R.id.rb_normal_operation_ok) {
            controlNormal = "1";
        } else {
            controlNormal = "0";
        }
        if (rgClean.getCheckedRadioButtonId() == R.id.rb_clean_ok) {
            motionClean = "1";
        } else {
            motionClean = "0";
        }
        if (rgAll.getCheckedRadioButtonId() == R.id.rb_all_ok) {
            emmAll = "1";
        } else {
            emmAll = "0";
        }
        if (rgXmt.getCheckedRadioButtonId() == R.id.rb_xmt_ok) {
            emmMonitorXmt = "1";
        } else {
            emmMonitorXmt = "0";
        }
        if (rgXmtHost.getCheckedRadioButtonId() == R.id.rb_xmt_host_ok) {
            hostPrinter = "1";
        } else {
            hostPrinter = "0";
        }

        date = edtDate.getText().toString();
        typeSimulator = edtTipeSimulator.getText().toString();
        hostHumidity = edtHumidity.getText().toString();
        airTemperature = edtTemp1.getText().toString();
        cockpitTemperature = edtTemp2.getText().toString();
        emmTemperature = edtTemp3.getText().toString();
        hostTemperature = edtTemp4.getText().toString();
        approvedBy = edtApprovedName.getText().toString();
        checkBy = edtCarriedOut.getText().toString();

        Toast.makeText(this, "Chassis :" + chassis + "\n" +
                        "Supply :" + airSupply + "\n" +
                        "Normal :" + controlNormal + "\n" +
                        "All :" + emmAll + "\n" +
                        "Printer :" + hostPrinter + "\n" +
                        "Power :" + hostPower + "\n" +
                        "Console :" + visualConsole + "\n" +
                        "Indicators :" + cockpitIndicator + "\n" +
                        "Communication :" + cockpitCommunication + "\n" +
                        "Temp :" + hostTemperature + "\n" +
                        "Lighting_system :" + cockpitLighting + "\n" +
                        "Instructor :" + cockpitInstructur + "\n" +
                        "Visual :" + visualPower + "\n" +
                        "Oxygen :" + cockpitOxygen + "\n" +
                        "Fire :" + cockpitFire + "\n" +
                        "Operation1 :" + drawbridgeNormal + "\n" +
                        "Normal_operation :" + motionNormal + "\n" +
                        "Operation :" + hostNormal + "\n" +
                        "Clean :" + motionClean + "\n" +
                        "All_fans :" + emmAll + "\n" +
                        "Xmt_host :" + hostConsole + "\n" +
                        "Xmt :" + emmMonitorXmt + "\n" +
                        "Temp1 :" + hostTemperature + "\n" +
                        "Temp2 :" + emmTemperature + "\n" +
                        "CarriedOut :" + checkBy + "\n" +
                        "ApprovedName :" + approvedBy + "\n" +
                        "Indicator :" + cockpitIndicator + "\n" +
                        "Lighting :" + cockpitLighting + "\n"
                , Toast.LENGTH_SHORT).show();

        createDaily();
    }

    private void createDaily() {
        AndroidNetworking.post(CREATE_DAILY)
                .addBodyParameter("date", date)
                .addBodyParameter("simulator_type", typeSimulator)
                .addBodyParameter("host_chassis", hostChassis)
                .addBodyParameter("host_power", hostPower)
                .addBodyParameter("host_normal", hostNormal)
                .addBodyParameter("host_node", hostNode)
                .addBodyParameter("host_console", hostConsole)
                .addBodyParameter("host_printer", hostPower)
                .addBodyParameter("host_temperature", hostTemperature)
                .addBodyParameter("host_humidity", hostHumidity)
                .addBodyParameter("visual_power", visualPower)
                .addBodyParameter("visual_console", visualConsole)
                .addBodyParameter("cockpit_indicator", cockpitIndicator)
                .addBodyParameter("cockpit_communication", cockpitCommunication)
                .addBodyParameter("cockpit_lighting", cockpitInstructur)
                .addBodyParameter("cockpit_instructor", cockpitInstructur)
                .addBodyParameter("cockpit_visual", cockpitOxygen)
                .addBodyParameter("cockpit_oxygen", cockpitOxygen)
                .addBodyParameter("cockpit_fire", cockpitFire)
                .addBodyParameter("cockpit_temperature", cockpitTemperature)
                .addBodyParameter("control_normal", controlNormal)
                .addBodyParameter("drawbridge_normal", drawbridgeNormal)
                .addBodyParameter("motion_normal", motionNormal)
                .addBodyParameter("motion_clean", motionClean)
                .addBodyParameter("emm_all", emmAll)
                .addBodyParameter("emm_monitor_xmt", emmMonitorXmt)
                .addBodyParameter("emm_monitor_rev", emmMotionRev)
                .addBodyParameter("emm_temperature", emmTemperature)
                .addBodyParameter("air_supply", airSupply)
                .addBodyParameter("air_return", airReturn)
                .addBodyParameter("air_temperature", airTemperature)
                .addBodyParameter("approve_by", approvedBy)
                .addBodyParameter("check_by", checkBy)
                .build()
                .getAsObject(PostResponse.class, new ParsedRequestListener() {
                    @Override
                    public void onResponse(Object response) {
                        if (response instanceof PostResponse) {
                            PostResponse response1 = (PostResponse) response;
                            if (response1.getData().equalsIgnoreCase("1")) {
                                Toast.makeText(DailyCheckActivity.this, "Pengecekan Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
                                finish();
                            } else {
                                Toast.makeText(DailyCheckActivity.this, "Pengecekan Gagal Ditambahkan !", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

                    @Override
                    public void onError(ANError anError) {
                        Toast.makeText(DailyCheckActivity.this, "Gagal Response", Toast.LENGTH_SHORT).show();
                    }

                });
    }

    @OnClick({R.id.edt_date, R.id.edt_tipe_simulator, R.id.btn_dailysave})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.edt_date:
                DialogUtils.dialogTanggal(DailyCheckActivity.this, edtDate);
                break;
            case R.id.edt_tipe_simulator:
                final String[] items = getResources().getStringArray(R.array.tipesimulator);
                DialogUtils.dialogArray(DailyCheckActivity.this, items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edtTipeSimulator.setText(items[which]);
                    }
                });
                break;
            case R.id.btn_dailysave:
                checkValidation();
                break;
        }
    }
}
