package com.check.main.activity.maintenance;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.OkHttpResponseListener;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.check.main.R;
import com.check.main.model.PostResponse;
import com.check.main.utils.DialogUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Response;

import static com.check.main.data.Constant.CREATE_MONTHLY;

public class MonthlyCheckActivity extends AppCompatActivity {

    @BindView(R.id.edt_date)
    EditText edtDate;
    @BindView(R.id.edt_tipe_simulator)
    EditText edtTipeSimulator;
    @BindView(R.id.rg_base)
    RadioGroup rgBase;
    @BindView(R.id.rg_cabinet)
    RadioGroup rgCabinet;
    @BindView(R.id.rg_inspection)
    RadioGroup rgInspection;
    @BindView(R.id.rg_measure)
    RadioGroup rgMeasure;
    @BindView(R.id.rg_motion_cabinet)
    RadioGroup rgMotionCabinet;
    @BindView(R.id.rg_emo)
    RadioGroup rgEmo;
    @BindView(R.id.rg_loading_system)
    RadioGroup rgLoadingSystem;
    @BindView(R.id.rg_inspact)
    RadioGroup rgInspact;
    @BindView(R.id.rg_power_pack)
    RadioGroup rgPowerPack;
    @BindView(R.id.rg_safety)
    RadioGroup rgSafety;
    @BindView(R.id.rg_test1)
    RadioGroup rgTest1;
    @BindView(R.id.rg_filter)
    RadioGroup rgFilter;
    @BindView(R.id.rg_flexible)
    RadioGroup rgFlexible;
    @BindView(R.id.rg_air)
    RadioGroup rgAir;
    @BindView(R.id.rg_felxible_hose)
    RadioGroup rgFelxibleHose;
    @BindView(R.id.rg_wheel)
    RadioGroup rgWheel;
    @BindView(R.id.rg_floor)
    RadioGroup rgFloor;
    @BindView(R.id.rg_clean_secure)
    RadioGroup rgCleanSecure;
    @BindView(R.id.rg_rails)
    RadioGroup rgRails;
    @BindView(R.id.rg_ensure)
    RadioGroup rgEnsure;
    @BindView(R.id.rg_loose)
    RadioGroup rgLoose;
    @BindView(R.id.rg_spare)
    RadioGroup rgSpare;
    @BindView(R.id.rg_correctly)
    RadioGroup rgCorrectly;
    @BindView(R.id.rg_adequatte)
    RadioGroup rgAdequatte;
    @BindView(R.id.rg_instrument)
    RadioGroup rgInstrument;
    @BindView(R.id.rg_door_locks)
    RadioGroup rgDoorLocks;
    @BindView(R.id.rg_computer_nodes)
    RadioGroup rgComputerNodes;
    @BindView(R.id.rg_lan_connection)
    RadioGroup rgLanConnection;
    @BindView(R.id.rg_clean1)
    RadioGroup rgClean1;
    @BindView(R.id.rg_change)
    RadioGroup rgChange;
    @BindView(R.id.rg_clean_host)
    RadioGroup rgCleanHost;
    @BindView(R.id.rg_delete)
    RadioGroup rgDelete;
    @BindView(R.id.rg_backup)
    RadioGroup rgBackup;
    @BindView(R.id.rg_for_normal)
    RadioGroup rgForNormal;
    @BindView(R.id.rg_exterior)
    RadioGroup rgExterior;
    @BindView(R.id.rg_availible)
    RadioGroup rgAvailible;
    @BindView(R.id.rg_set)
    RadioGroup rgSet;
    @BindView(R.id.rg_supplies)
    RadioGroup rgSupplies;
    @BindView(R.id.rg_vesda)
    RadioGroup rgVesda;
    @BindView(R.id.rg_operation1)
    RadioGroup rgOperation1;
    @BindView(R.id.rg_test)
    RadioGroup rgTest;
    @BindView(R.id.rg_air_sampling)
    RadioGroup rgAirSampling;
    @BindView(R.id.rg_filter_grills)
    RadioGroup rgFilterGrills;
    @BindView(R.id.rg_projector1)
    RadioGroup rgProjector1;
    @BindView(R.id.rg_checked)
    RadioGroup rgChecked;
    @BindView(R.id.rg_perform)
    RadioGroup rgPerform;
    @BindView(R.id.rg_auto)
    RadioGroup rgAuto;
    @BindView(R.id.edt_checked)
    EditText edtChecked;
    @BindView(R.id.edt_approved)
    EditText edtApproved;
    @BindView(R.id.txt_judul)
    TextView txtJudul;

    String date, typeSimulator, type, emm1, emm2;
    String emm3, emm4, emm5, emm6, controlLoading1, accessway1,accessway2;
    String accessway3,accessway4,airConditioning1,airConditioning2,printer1,printer2,printer3,printer4,safety1, safety2;
    String safety3, safety4,visual1,visual2,visual3,visual4,visual5,oxygen1,oxygen2,fuslage1a;
    String fuslage1b,fuslage1c1,fuslage1c2,fuslage1c3, fuslage1d,fuslage1e,fuslage1f,fuslage1g;
    String fuslage1h, fuslage2, host1,host2,host3,host4,host5,host6,carriedOut,approve;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly);
        ButterKnife.bind(this);

        typeSimulator = getIntent().getStringExtra("Type Simulator");
        txtJudul.setText(typeSimulator);
        type = getIntent().getStringExtra("type");
    }

    public void cekValidasi() {

        if (rgBase.getCheckedRadioButtonId() == R.id.rb_base_ok) {
            emm1 = "1";
        } else {
            emm1 = "0";
        }
        if (rgCabinet.getCheckedRadioButtonId() == R.id.rb_cabinet_ok) {
            emm2 = "1";
        } else {
            emm2 = "0";
        }
        if (rgInspection.getCheckedRadioButtonId() == R.id.rb_inspection_ok) {
            emm3 = "1";
        } else {
            emm3 = "0";
        }
        if (rgMeasure.getCheckedRadioButtonId() == R.id.rb_measure_ok) {
            emm4 = "1";
        } else {
            emm4 = "0";
        }
        if (rgMotionCabinet.getCheckedRadioButtonId() == R.id.rb_motion_cabinet_ok) {
            emm5 = "1";
        } else {
            emm5 = "0";
        }
        if (rgEmo.getCheckedRadioButtonId() == R.id.rb_emo_ok) {
            emm6 = "1";
        } else {
            emm6 = "0";
        }
        if (rgChecked.getCheckedRadioButtonId() == R.id.rb_checked_ok) {
            date = "1";
        } else {
            date = "0";
        }
        if (rgLoadingSystem.getCheckedRadioButtonId() == R.id.rb_loading_system_ok) {
            controlLoading1 = "1";
        } else {
            controlLoading1 = "0";
        }
        if (rgInspact.getCheckedRadioButtonId() == R.id.rb_inspact_ok) {
            accessway1 = "1";
        } else {
            accessway1 = "0";
        }
        if (rgPowerPack.getCheckedRadioButtonId() == R.id.rb_power_pack_ok) {
            accessway2 = "1";
        } else {
            accessway2 = "0";
        }
        if (rgSafety.getCheckedRadioButtonId() == R.id.rb_safety_ok) {
            accessway3 = "1";
        } else {
            accessway3 = "0";
        }
        if (rgTest1.getCheckedRadioButtonId() == R.id.rb_test1_ok) {
            accessway4 = "1";
        } else {
            accessway4 = "0";
        }
        if (rgFilter.getCheckedRadioButtonId() == R.id.rb_filter_ok) {
            airConditioning1 = "1";
        } else {
            airConditioning1 = "0";
        }
        if (rgFlexible.getCheckedRadioButtonId() == R.id.rb_flexible_ok) {
            airConditioning2 = "1";
        } else {
            airConditioning2 = "0";
        }
        if (rgAir.getCheckedRadioButtonId() == R.id.rb_air_ok) {
            printer1 = "1";
        } else {
            printer1 = "0";
        }
        if (rgFlexible.getCheckedRadioButtonId() == R.id.rb_flexible_ok) {
            printer2 = "1";
        } else {
            printer2 = "0";
        }
        if (rgWheel.getCheckedRadioButtonId() == R.id.rb_wheel_ok) {
            printer3 = "1";
        } else {
            printer3 = "0";
        }
        if (rgFloor.getCheckedRadioButtonId() == R.id.rb_floor_ok) {
            printer4 = "1";
        } else {
            printer4 = "0";
        }
        if (rgCleanSecure.getCheckedRadioButtonId() == R.id.rb_clean_secure_ok) {
            safety1 = "1";
        } else {
            safety1 = "0";
        }
        if (rgRails.getCheckedRadioButtonId() == R.id.rb_rails_ok) {
            safety2 = "1";
        } else {
            safety2 = "0";
        }
        if (rgEnsure.getCheckedRadioButtonId() == R.id.rb_ensure_ok) {
            safety3 = "1";
        } else {
            safety3 = "0";
        }
        if (rgLoose.getCheckedRadioButtonId() == R.id.rb_loose_ok) {
            safety4 = "1";
        } else {
            safety4 = "0";
        }
        if (rgSpare.getCheckedRadioButtonId() == R.id.rb_spare_ok) {
            visual1 = "1";
        } else {
            visual1 = "0";
        }
        if (rgCorrectly.getCheckedRadioButtonId() == R.id.rb_correctly_ok) {
            visual2 = "1";
        } else {
            visual2 = "0";
        }
        if (rgAdequatte.getCheckedRadioButtonId() == R.id.rb_adequatte_ok) {
            visual3 = "1";
        } else {
            visual3 = "0";
        }
        if (rgInstrument.getCheckedRadioButtonId() == R.id.rb_instrument_ok) {
            visual4 = "1";
        } else {
            visual4 = "0";
        }
        if (rgDoorLocks.getCheckedRadioButtonId() == R.id.rb_door_locks_ok) {
            visual5 = "1";
        } else {
            visual5 = "0";
        }
        if (rgComputerNodes.getCheckedRadioButtonId() == R.id.rb_computer_nodes_ok) {
            oxygen1 = "1";
        } else {
            oxygen1 = "0";
        }
        if (rgLanConnection.getCheckedRadioButtonId() == R.id.rb_lan_connection_Ok) {
            oxygen2 = "1";
        } else {
            oxygen2 = "0";
        }
        if (rgClean1.getCheckedRadioButtonId() == R.id.rb_clean1_Ok) {
            fuslage1a = "1";
        } else {
            fuslage1a = "0";
        }
        if (rgChange.getCheckedRadioButtonId() == R.id.rb_change_Ok) {
            fuslage1b = "1";
        } else {
            fuslage1b = "0";
        }
        if (rgCleanHost.getCheckedRadioButtonId() == R.id.rb_clean_host_Ok) {
            fuslage1c1 = "1";
        } else {
            fuslage1c1 = "0";
        }
        if (rgDelete.getCheckedRadioButtonId() == R.id.rb_delete_Ok) {
            fuslage1c2 = "1";
        } else {
            fuslage1c2 = "0";
        }
        if (rgBackup.getCheckedRadioButtonId() == R.id.rb_backup_Ok) {
            fuslage1c3 = "1";
        } else {
            fuslage1c3 = "0";
        }
        if (rgForNormal.getCheckedRadioButtonId() == R.id.rb_for_normal_Ok) {
            fuslage1d = "1";
        } else {
            fuslage1d = "0";
        }
        if (rgExterior.getCheckedRadioButtonId() == R.id.rb_exterior_Ok) {
            fuslage1e = "1";
        } else {
            fuslage1e = "0";
        }
        if (rgAvailible.getCheckedRadioButtonId() == R.id.rb_availible_Ok) {
            fuslage1f = "1";
        } else {
            fuslage1f = "0";
        }
        if (rgSet.getCheckedRadioButtonId() == R.id.rb_set_Ok) {
            fuslage1g = "1";
        } else {
            fuslage1g = "0";
        }
        if (rgSupplies.getCheckedRadioButtonId() == R.id.rb_supplies_Ok) {
            fuslage2 = "1";
        } else {
            fuslage2 = "0";
        }
        if (rgVesda.getCheckedRadioButtonId() == R.id.rb_vesda_Ok) {
            host1 = "1";
        } else {
            host1 = "0";
        }
        if (rgOperation1.getCheckedRadioButtonId() == R.id.rb_operation1_Ok) {
            host2 = "1";
        } else {
            host2 = "0";
        }
        if (rgTest.getCheckedRadioButtonId() == R.id.rb_test_ok) {
            host3 = "Ok";
        } else {
            host3 = "0";
        }
        if (rgAirSampling.getCheckedRadioButtonId() == R.id.rb_air_sampling_ok) {
            host4 = "1";
        } else {
            host4 = "0";
        }
        if (rgFilterGrills.getCheckedRadioButtonId() == R.id.rb_filter_grills_ok) {
            host5 = "1";
        } else {
            host5 = "0";
        }

        date = edtDate.getText().toString();
        typeSimulator = edtTipeSimulator.getText().toString();
        approve = edtApproved.getText().toString();
        carriedOut = edtChecked.getText().toString();

        createMonthly();
    }

    private void createMonthly() {
        ANRequest.MultiPartBuilder postRequestBuilder = new ANRequest.MultiPartBuilder<>(CREATE_MONTHLY);

        postRequestBuilder.addMultipartParameter("date", date);
        postRequestBuilder.addMultipartParameter("simulator_type", typeSimulator);
        postRequestBuilder.addMultipartParameter("type", type);
        postRequestBuilder.addMultipartParameter("emm_1", emm1);
        postRequestBuilder.addMultipartParameter("emm_2", emm2);
        postRequestBuilder.addMultipartParameter("emm_3", emm3);
        postRequestBuilder.addMultipartParameter("emm_4", emm4);
        postRequestBuilder.addMultipartParameter("emm_5", emm5);
        postRequestBuilder.addMultipartParameter("emm_6", emm6);
        postRequestBuilder.addMultipartParameter("control_loading_1", controlLoading1);
        postRequestBuilder.addMultipartParameter("accessway_1", accessway1);
        postRequestBuilder.addMultipartParameter("accessway_2", accessway2);
        postRequestBuilder.addMultipartParameter("accessway_3", accessway3);
        postRequestBuilder.addMultipartParameter("accessway_4", accessway4);
        postRequestBuilder.addMultipartParameter("air_conditioning_1", airConditioning1);
        postRequestBuilder.addMultipartParameter("air_conditioning_2", airConditioning2);
        postRequestBuilder.addMultipartParameter("printer_1", printer1);
        postRequestBuilder.addMultipartParameter("printer_2", printer2);
        postRequestBuilder.addMultipartParameter("printer_3", printer3);
        postRequestBuilder.addMultipartParameter("printer_4", printer4);
        postRequestBuilder.addMultipartParameter("safety_1", safety1);
        postRequestBuilder.addMultipartParameter("safety_2", safety2);
        postRequestBuilder.addMultipartParameter("safety_3", safety3);
        postRequestBuilder.addMultipartParameter("safety_4", safety4);
        postRequestBuilder.addMultipartParameter("visual_1", visual1);
        postRequestBuilder.addMultipartParameter("visual_2", visual2);
        postRequestBuilder.addMultipartParameter("visual_3", visual3);
        postRequestBuilder.addMultipartParameter("visual_4", visual4);
        postRequestBuilder.addMultipartParameter("visual_5", visual5);
        postRequestBuilder.addMultipartParameter("oxygen_1", oxygen1);
        postRequestBuilder.addMultipartParameter("oxygen_2", oxygen2);
        postRequestBuilder.addMultipartParameter("fuslage_1a", fuslage1a);
        postRequestBuilder.addMultipartParameter("fuslage_1b", fuslage1b);
        postRequestBuilder.addMultipartParameter("fuslage_1c1", fuslage1c1);
        postRequestBuilder.addMultipartParameter("fuslage_1c2", fuslage1c2);
        postRequestBuilder.addMultipartParameter("fuslage_1c3", fuslage1c3);
        postRequestBuilder.addMultipartParameter("fuslage_1d", fuslage1d);
        postRequestBuilder.addMultipartParameter("fuslage_1e", fuslage1e);
        postRequestBuilder.addMultipartParameter("fuslage_1f", fuslage1f);
        postRequestBuilder.addMultipartParameter("fuslage_1g", fuslage1g);
        postRequestBuilder.addMultipartParameter("fuslage_1h", fuslage1h);
        postRequestBuilder.addMultipartParameter("fuslage_2", fuslage2);
        postRequestBuilder.addMultipartParameter("host_1", host1);
        postRequestBuilder.addMultipartParameter("host_2", host2);
        postRequestBuilder.addMultipartParameter("host_3", host3);
        postRequestBuilder.addMultipartParameter("host_4", host4);
        postRequestBuilder.addMultipartParameter("host_5", host5);
        postRequestBuilder.addMultipartParameter("host_6", host6);
        postRequestBuilder.addMultipartParameter("carried_out", carriedOut);
        postRequestBuilder.addMultipartParameter("approve", approve);

        postRequestBuilder.build()
                .getAsOkHttpResponse(new OkHttpResponseListener() {
                    @Override
                    public void onResponse(Response response) {
                        if (response.isSuccessful()) {
                            Toast.makeText(MonthlyCheckActivity.this, "Pengecekan Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
                            finish();
                        } else {
                            Toast.makeText(MonthlyCheckActivity.this, "Pengecekan Gagal Ditambahkan !", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onError(ANError anError) {
                        Toast.makeText(MonthlyCheckActivity.this, "Pengecekan Gagal Ditambahkan !", Toast.LENGTH_SHORT).show();
                    }
                });

//        AndroidNetworking.post(CREATE_MONTHLY)
//                .addBodyParameter("date", tanggal)
//                .addBodyParameter("simulator_type", tipeSimulator)
//                .addBodyParameter("type", tipe)
//                .addBodyParameter("emm_1", Base)
//                .addBodyParameter("emm_2", Cabinet)
//                .addBodyParameter("emm_3", Inspection)
//                .addBodyParameter("emm_4", Measure)
//                .addBodyParameter("emm_5", Motion_cabinet)
//                .addBodyParameter("emm_6", Emo)
//                .addBodyParameter("control_loading_1", Loading_System)
//                .addBodyParameter("accessway_1", Inspact)
//                .addBodyParameter("accessway_2", Power_pack)
//                .addBodyParameter("accessway_3", Safety)
//                .addBodyParameter("accessway_4", Test1)
//                .addBodyParameter("air_conditioning_1", Filter)
//                .addBodyParameter("air_conditioning_2", Flexible)
//                .addBodyParameter("printer_1", Normal)
//                .addBodyParameter("printer_2", Exterior)
//                .addBodyParameter("printer_3", Avaalible)
//                .addBodyParameter("printer_4", Set)
//                .addBodyParameter("safety_1", Supplies)
//                .addBodyParameter("safety_2", Vesda)
//                .addBodyParameter("safety_3", Operation1)
//                .addBodyParameter("safety_4", Operation2)
//                .addBodyParameter("visual_1", Filter_grils)
//                .addBodyParameter("visual_2", Projector1)
//                .addBodyParameter("visual_3", Chacked)
//                .addBodyParameter("visual_4", Perform)
//                .addBodyParameter("visual_5", Auto)
//                .addBodyParameter("oxygen_1", Test)
//                .addBodyParameter("oxygen_2", Air_sampling)
//                .addBodyParameter("fuslage_1a", Spare)
//                .addBodyParameter("fuslage_1b", Correctly)
//                .addBodyParameter("fuslage_1c1", Adequatta)
//                .addBodyParameter("fuslage_1c2", Instrument)
//                .addBodyParameter("fuslage_1c3", Door_locks)
//                .addBodyParameter("fuslage_1d", Computer_Nodes)
//                .addBodyParameter("fuslage_1e", Lan_connnection)
//                .addBodyParameter("fuslage_1f", Clean1)
//                .addBodyParameter("fuslage_1g", Change)
//                .addBodyParameter("fuslage_1h", Clean_host)
//                .addBodyParameter("fuslage_2", Delete)
//                .addBodyParameter("host_1", Computer_Nodes)
//                .addBodyParameter("host_2", Lan_connnection)
//                .addBodyParameter("host_3", Clean1)
//                .addBodyParameter("host_4", Clean_host)
//                .addBodyParameter("host_5", Delete)
//                .addBodyParameter("host_6", Backup)
//                .addBodyParameter("carried_out", Checked)
//                .addBodyParameter("approve", Approved)
//                .build()
//                .getAsObject(PostResponse.class, new ParsedRequestListener() {
//                    @Override
//                    public void onResponse(Object response) {
//                        if (response instanceof PostResponse) {
//                            PostResponse response1 = (PostResponse) response;
//                            if (response1.getData().equalsIgnoreCase("1")) {
//                                Toast.makeText(MonthlyCheckActivity.this, "Pengecekan Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
//                                finish();
//                            } else {
//                                Toast.makeText(MonthlyCheckActivity.this, "Pengecekan Gagal Ditambahkan !", Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    }
//
//                    @Override
//                    public void onError(ANError anError) {
//                        Toast.makeText(MonthlyCheckActivity.this, "Gagal Response", Toast.LENGTH_SHORT).show();
//                    }
//
//                });
    }

    @OnClick({R.id.edt_date, R.id.edt_tipe_simulator, R.id.btn_save_monthly})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.edt_date:
                DialogUtils.dialogTanggal(MonthlyCheckActivity.this, edtDate);
                break;
            case R.id.edt_tipe_simulator:
                final String[] items = getResources().getStringArray(R.array.tipesimulator);
                DialogUtils.dialogArray(MonthlyCheckActivity.this, items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edtTipeSimulator.setText(items[which]);
                    }
                });
                break;
            case R.id.btn_save_monthly:
                cekValidasi();
                break;
        }
    }
}
