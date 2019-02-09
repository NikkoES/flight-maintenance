package com.check.main.activity.maintenance;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.check.main.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SixMonthCheckActivity extends AppCompatActivity {

    @BindView(R.id.rb_base_ok)
    RadioButton rbBaseOk;
    @BindView(R.id.rb_base_nok)
    RadioButton rbBaseNok;
    @BindView(R.id.rg_base)
    RadioGroup rgBase;
    @BindView(R.id.rb_cabinet_ok)
    RadioButton rbCabinetOk;
    @BindView(R.id.rb_cabinet_nok)
    RadioButton rbCabinetNok;
    @BindView(R.id.rg_cabinet)
    RadioGroup rgCabinet;
    @BindView(R.id.rb_inspection_ok)
    RadioButton rbInspectionOk;
    @BindView(R.id.rb_inspection_nok)
    RadioButton rbInspectionNok;
    @BindView(R.id.rg_inspection)
    RadioGroup rgInspection;
    @BindView(R.id.rb_measure_ok)
    RadioButton rbMeasureOk;
    @BindView(R.id.rb_measure_nok)
    RadioButton rbMeasureNok;
    @BindView(R.id.rg_measure)
    RadioGroup rgMeasure;
    @BindView(R.id.rb_motion_cabinet_ok)
    RadioButton rbMotionCabinetOk;
    @BindView(R.id.rb_motion_cabinet_nok)
    RadioButton rbMotionCabinetNok;
    @BindView(R.id.rg_motion_cabinet)
    RadioGroup rgMotionCabinet;
    @BindView(R.id.rb_emo_ok)
    RadioButton rbEmoOk;
    @BindView(R.id.rb_check_nok)
    RadioButton rbCheckNok;
    @BindView(R.id.rg_emo)
    RadioGroup rgEmo;
    @BindView(R.id.rb_loading_system_ok)
    RadioButton rbLoadingSystemOk;
    @BindView(R.id.rb_loading_system_nok)
    RadioButton rbLoadingSystemNok;
    @BindView(R.id.rg_loading_system)
    RadioGroup rgLoadingSystem;
    @BindView(R.id.rb_inspact_ok)
    RadioButton rbInspactOk;
    @BindView(R.id.rb_inspact_nok)
    RadioButton rbInspactNok;
    @BindView(R.id.rg_inspact)
    RadioGroup rgInspact;
    @BindView(R.id.rb_power_pack_ok)
    RadioButton rbPowerPackOk;
    @BindView(R.id.rb_power_pack_nok)
    RadioButton rbPowerPackNok;
    @BindView(R.id.rg_power_pack)
    RadioGroup rgPowerPack;
    @BindView(R.id.rb_safety_ok)
    RadioButton rbSafetyOk;
    @BindView(R.id.rb_safety_nok)
    RadioButton rbSafetyNok;
    @BindView(R.id.rg_safety)
    RadioGroup rgSafety;
    @BindView(R.id.rb_test1_ok)
    RadioButton rbTest1Ok;
    @BindView(R.id.rb_test1_nok)
    RadioButton rbTest1Nok;
    @BindView(R.id.rg_test1)
    RadioGroup rgTest1;
    @BindView(R.id.rb_filter_ok)
    RadioButton rbFilterOk;
    @BindView(R.id.rb_filter_nok)
    RadioButton rbFilterNok;
    @BindView(R.id.rg_filter)
    RadioGroup rgFilter;
    @BindView(R.id.rb_flexible_ok)
    RadioButton rbFlexibleOk;
    @BindView(R.id.rb_flexible_nok)
    RadioButton rbFlexibleNok;
    @BindView(R.id.rg_flexible)
    RadioGroup rgFlexible;
    @BindView(R.id.rb_air_ok)
    RadioButton rbAirOk;
    @BindView(R.id.rb_air_nok)
    RadioButton rbAirNok;
    @BindView(R.id.rg_air)
    RadioGroup rgAir;
    @BindView(R.id.rb_felxible_hose_ok)
    RadioButton rbFelxibleHoseOk;
    @BindView(R.id.rb_felxible_hose_nok)
    RadioButton rbFelxibleHoseNok;
    @BindView(R.id.rg_felxible_hose)
    RadioGroup rgFelxibleHose;
    @BindView(R.id.rb_wheel_ok)
    RadioButton rbWheelOk;
    @BindView(R.id.rb_hose_nok)
    RadioButton rbHoseNok;
    @BindView(R.id.rg_wheel)
    RadioGroup rgWheel;
    @BindView(R.id.rb_floor_ok)
    RadioButton rbFloorOk;
    @BindView(R.id.rb_floor_nok)
    RadioButton rbFloorNok;
    @BindView(R.id.rg_floor)
    RadioGroup rgFloor;
    @BindView(R.id.rb_clean_secure_ok)
    RadioButton rbCleanSecureOk;
    @BindView(R.id.rb_clean_secure_nok)
    RadioButton rbCleanSecureNok;
    @BindView(R.id.rg_clean_secure)
    RadioGroup rgCleanSecure;
    @BindView(R.id.rb_rails_ok)
    RadioButton rbRailsOk;
    @BindView(R.id.rb_seat_nok)
    RadioButton rbSeatNok;
    @BindView(R.id.rg_rails)
    RadioGroup rgRails;
    @BindView(R.id.rb_ensure_ok)
    RadioButton rbEnsureOk;
    @BindView(R.id.rb_ensure_nok)
    RadioButton rbEnsureNok;
    @BindView(R.id.rg_ensure)
    RadioGroup rgEnsure;
    @BindView(R.id.rb_loose_ok)
    RadioButton rbLooseOk;
    @BindView(R.id.rb_loose_nok)
    RadioButton rbLooseNok;
    @BindView(R.id.rg_loose)
    RadioGroup rgLoose;
    @BindView(R.id.rb_spare_ok)
    RadioButton rbSpareOk;
    @BindView(R.id.rb_spare_nok)
    RadioButton rbSpareNok;
    @BindView(R.id.rg_spare)
    RadioGroup rgSpare;
    @BindView(R.id.rb_correctly_ok)
    RadioButton rbCorrectlyOk;
    @BindView(R.id.rb_correctly_nok)
    RadioButton rbCorrectlyNok;
    @BindView(R.id.rg_correctly)
    RadioGroup rgCorrectly;
    @BindView(R.id.rb_adequatte_ok)
    RadioButton rbAdequatteOk;
    @BindView(R.id.rb_adequatte_nok)
    RadioButton rbAdequatteNok;
    @BindView(R.id.rg_adequatte)
    RadioGroup rgAdequatte;
    @BindView(R.id.rb_instrument_ok)
    RadioButton rbInstrumentOk;
    @BindView(R.id.rb_instrument_nok)
    RadioButton rbInstrumentNok;
    @BindView(R.id.rg_instrument)
    RadioGroup rgInstrument;
    @BindView(R.id.rb_door_locks_ok)
    RadioButton rbDoorLocksOk;
    @BindView(R.id.rb_door_locks_nok)
    RadioButton rbDoorLocksNok;
    @BindView(R.id.rg_door_locks)
    RadioGroup rgDoorLocks;
    @BindView(R.id.rb_computer_nodes_ok)
    RadioButton rbComputerNodesOk;
    @BindView(R.id.rb_computer_nodes_nok)
    RadioButton rbComputerNodesNok;
    @BindView(R.id.rg_computer_nodes)
    RadioGroup rgComputerNodes;
    @BindView(R.id.rb_lan_connection_Ok)
    RadioButton rbLanConnectionOk;
    @BindView(R.id.rb_lan_connection_nok)
    RadioButton rbLanConnectionNok;
    @BindView(R.id.rg_lan_connection)
    RadioGroup rgLanConnection;
    @BindView(R.id.rb_clean1_Ok)
    RadioButton rbClean1Ok;
    @BindView(R.id.rb_clean1_nok)
    RadioButton rbClean1Nok;
    @BindView(R.id.rg_clean1)
    RadioGroup rgClean1;
    @BindView(R.id.rb_change_Ok)
    RadioButton rbChangeOk;
    @BindView(R.id.rb_change_nok)
    RadioButton rbChangeNok;
    @BindView(R.id.rg_change)
    RadioGroup rgChange;
    @BindView(R.id.rb_clean_host_Ok)
    RadioButton rbCleanHostOk;
    @BindView(R.id.rb_clean_host_nok)
    RadioButton rbCleanHostNok;
    @BindView(R.id.rg_clean_host)
    RadioGroup rgCleanHost;
    @BindView(R.id.rb_delete_Ok)
    RadioButton rbDeleteOk;
    @BindView(R.id.rb_delete_nok)
    RadioButton rbDeleteNok;
    @BindView(R.id.rg_delete)
    RadioGroup rgDelete;
    @BindView(R.id.rb_backup_Ok)
    RadioButton rbBackupOk;
    @BindView(R.id.rb_backup_nok)
    RadioButton rbBackupNok;
    @BindView(R.id.rg_backup)
    RadioGroup rgBackup;
    @BindView(R.id.rb_for_normal_Ok)
    RadioButton rbForNormalOk;
    @BindView(R.id.rb_for_normal_nok)
    RadioButton rbForNormalNok;
    @BindView(R.id.rg_for_normal)
    RadioGroup rgForNormal;
    @BindView(R.id.rb_exterior_Ok)
    RadioButton rbExteriorOk;
    @BindView(R.id.rb_exterior_nok)
    RadioButton rbExteriorNok;
    @BindView(R.id.rg_exterior)
    RadioGroup rgExterior;
    @BindView(R.id.rb_availible_Ok)
    RadioButton rbAvailibleOk;
    @BindView(R.id.rb_availible_nok)
    RadioButton rbAvailibleNok;
    @BindView(R.id.rg_availible)
    RadioGroup rgAvailible;
    @BindView(R.id.rb_set_Ok)
    RadioButton rbSetOk;
    @BindView(R.id.rb_set_nok)
    RadioButton rbSetNok;
    @BindView(R.id.rg_set)
    RadioGroup rgSet;
    @BindView(R.id.rb_supplies_Ok)
    RadioButton rbSuppliesOk;
    @BindView(R.id.rb_supplies_nok)
    RadioButton rbSuppliesNok;
    @BindView(R.id.rg_supplies)
    RadioGroup rgSupplies;
    @BindView(R.id.rb_vesda_Ok)
    RadioButton rbVesdaOk;
    @BindView(R.id.rb_vesda_nok)
    RadioButton rbVesdaNok;
    @BindView(R.id.rg_vesda)
    RadioGroup rgVesda;
    @BindView(R.id.rb_operation1_Ok)
    RadioButton rbOperation1Ok;
    @BindView(R.id.rb_operation1_nok)
    RadioButton rbOperation1Nok;
    @BindView(R.id.rg_operation1)
    RadioGroup rgOperation1;
    RadioGroup rgOperation2;
    @BindView(R.id.rb_test_ok)
    RadioButton rbTestOk;
    @BindView(R.id.rb_test_nok)
    RadioButton rbTestNok;
    @BindView(R.id.rg_test)
    RadioGroup rgTest;
    @BindView(R.id.rb_air_sampling_ok)
    RadioButton rbAirSamplingOk;
    @BindView(R.id.rb_air_sampling_nok)
    RadioButton rbAirSamplingNok;
    @BindView(R.id.rg_air_sampling)
    RadioGroup rgAirSampling;
    @BindView(R.id.rb_filter_grills_ok)
    RadioButton rbFilterGrillsOk;
    @BindView(R.id.rb_filter_grills_nok)
    RadioButton rbFilterGrillsNok;
    @BindView(R.id.rg_filter_grills)
    RadioGroup rgFilterGrills;
    @BindView(R.id.rb_projector1_ok)
    RadioButton rbProjector1Ok;
    @BindView(R.id.rb_projector1_nok)
    RadioButton rbProjector1Nok;
    @BindView(R.id.rg_projector1)
    RadioGroup rgProjector1;
    @BindView(R.id.rb_checked_ok)
    RadioButton rbCheckedOk;
    @BindView(R.id.rb_checked_nok)
    RadioButton rbCheckedNok;
    @BindView(R.id.rg_checked)
    RadioGroup rgChecked;
    @BindView(R.id.rb_perform_ok)
    RadioButton rbPerformOk;
    @BindView(R.id.rb_perform_nok)
    RadioButton rbPerformNok;
    @BindView(R.id.rg_perform)
    RadioGroup rgPerform;
    @BindView(R.id.rb_auto_ok)
    RadioButton rbAutoOk;
    @BindView(R.id.rb_auto_nok)
    RadioButton rbAutoNok;
    @BindView(R.id.rg_auto)
    RadioGroup rgAuto;
    @BindView(R.id.edt_checked)
    EditText edtChecked;
    @BindView(R.id.edt_approved)
    EditText edtApproved;
    @BindView(R.id.tv_date)
    TextView tvDate;
    @BindView(R.id.edt_date)
    EditText edtDate;
    @BindView(R.id.rb_mocab_ok)
    RadioButton rbMocabOk;
    @BindView(R.id.rb_mocab_nok)
    RadioButton rbMocabNok;
    @BindView(R.id.rg_mocab)
    RadioGroup rgMocab;
    @BindView(R.id.rb_emo_opo_ok)
    RadioButton rbEmoOpoOk;
    @BindView(R.id.rb_emo_opo_nok)
    RadioButton rbEmoOpoNok;
    @BindView(R.id.rg_emo_opo)
    RadioGroup rgEmoOpo;
    @BindView(R.id.rb_aileron_ok)
    RadioButton rbAileronOk;
    @BindView(R.id.rb_aileron_nok)
    RadioButton rbAileronNok;
    @BindView(R.id.rg_aileron)
    RadioGroup rgAileron;
    @BindView(R.id.rb_elevator_ok)
    RadioButton rbElevatorOk;
    @BindView(R.id.rb_elevator_nok)
    RadioButton rbElevatorNok;
    @BindView(R.id.rg_elevator)
    RadioGroup rgElevator;
    @BindView(R.id.rb_rudder_ok)
    RadioButton rbRudderOk;
    @BindView(R.id.rb_rudder_nok)
    RadioButton rbRudderNok;
    @BindView(R.id.rg_rudder)
    RadioGroup rgRudder;
    @BindView(R.id.rb_stabilizer_ok)
    RadioButton rbStabilizerOk;
    @BindView(R.id.rb_stabilizer_nok)
    RadioButton rbStabilizerNok;
    @BindView(R.id.rg_stabilizer)
    RadioGroup rgStabilizer;
    @BindView(R.id.rb_trim_ok)
    RadioButton rbTrimOk;
    @BindView(R.id.rb_trim_nok)
    RadioButton rbTrimNok;
    @BindView(R.id.rg_trim)
    RadioGroup rgTrim;
    @BindView(R.id.rb_landing_ok)
    RadioButton rbLandingOk;
    @BindView(R.id.rb_landing_nok)
    RadioButton rbLandingNok;
    @BindView(R.id.rg_landing)
    RadioGroup rgLanding;

    String Base, Cabinet, Inspection, Measure, Motion_cabinet, Emo, Check, Loading_System;
    String Inspact, Power_pack, Safety, Test1, Filter, Flexible, Air, Felxible_hose, wheel, hose;
    String Floor, Clean_Secure, Rails, Seat, Ensure, Loose, Spare, Correctly, Adequatta, Instrument;
    String Door_locks, Computer_Nodes, Lan_connnection, Clean1, Change, Clean_host, Delete, Backup;
    String Normal, Exterior, Avaalible, Set, Supplies, Vesda, Operation1, Operation2, Test, Air_sampling;
    String Filter_grils, Projector1, Chacked, Perform, Auto, Checked, Approved,Mocab,Aileron;
    String Rudder,Stabilizer,Trim,Landing;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.btn_save_six)
    public void onViewClicked() {

        if (rgMocab.getCheckedRadioButtonId()==R.id.rb_mocab_ok){
            Mocab ="OK";
        } else {
            Mocab ="NOK";
        }

        if (rgEmo.getCheckedRadioButtonId()==R.id.rb_emo_opo_ok){
            Emo ="OK";
        } else {
            Emo ="NOK";
        }

        if (rgAileron.getCheckedRadioButtonId()==R.id.rb_aileron_ok){
            Aileron ="OK";
        } else {
            Aileron ="NOK";
        }

        if (rgRudder.getCheckedRadioButtonId()==R.id.rb_rudder_ok){
            Rudder ="OK";
        } else {
            Rudder ="NOK";
        }

        if (rgStabilizer.getCheckedRadioButtonId()==R.id.rb_stabilizer_ok){
            Stabilizer ="OK";
        } else {
            Stabilizer ="NOK";
        }

        if (rgTrim.getCheckedRadioButtonId()==R.id.rb_trim_ok){
            Trim ="OK";
        } else {
            Trim ="NOK";
        }

        if (rgLanding.getCheckedRadioButtonId()==R.id.rb_landing_ok){
            Landing ="OK";
        } else {
            Landing ="NOK";
        }

        if (rgBase.getCheckedRadioButtonId() == R.id.rb_base_ok) {
            Base = "OK";
        } else {
            Base = "NOK";
        }
        if (rgCabinet.getCheckedRadioButtonId() == R.id.rb_cabinet_ok) {
            Cabinet = "OK";
        } else {
            Cabinet = "NOK";
        }
        if (rgInspection.getCheckedRadioButtonId() == R.id.rb_inspection_ok) {
            Inspection = "OK";
        } else {
            Inspection = "NOK";
        }
        if (rgMeasure.getCheckedRadioButtonId() == R.id.rb_measure_ok) {
            Measure = "OK";
        } else {
            Measure = "NOK";
        }
        if (rgMotionCabinet.getCheckedRadioButtonId() == R.id.rb_motion_cabinet_ok) {
            Motion_cabinet = "OK";
        } else {
            Motion_cabinet = "NOK";
        }
        if (rgEmo.getCheckedRadioButtonId() == R.id.rb_emo_ok) {
            Emo = "OK";
        } else {
            Emo = "NOK";
        }
        if (rgChecked.getCheckedRadioButtonId() == R.id.rb_checked_ok) {
            Checked = "OK";
        } else {
            Checked = "NOK";
        }
        if (rgLoadingSystem.getCheckedRadioButtonId() == R.id.rb_loading_system_ok) {
            Loading_System = "OK";
        } else {
            Loading_System = "NOK";
        }
        if (rgInspact.getCheckedRadioButtonId() == R.id.rb_inspact_ok) {
            Inspact = "OK";
        } else {
            Inspact = "NOK";
        }
        if (rgPowerPack.getCheckedRadioButtonId() == R.id.rb_power_pack_ok) {
            Power_pack = "OK";
        } else {
            Power_pack = "NOK";
        }
        if (rgSafety.getCheckedRadioButtonId() == R.id.rb_safety_ok) {
            Safety = "OK";
        } else {
            Safety = "NOK";
        }
        if (rgTest1.getCheckedRadioButtonId() == R.id.rb_test1_ok) {
            Test1 = "OK";
        } else {
            Test1 = "NOK";
        }
        if (rgFilter.getCheckedRadioButtonId() == R.id.rb_filter_ok) {
            Filter = "OK";
        } else {
            Filter = "NOK";
        }
        if (rgFlexible.getCheckedRadioButtonId() == R.id.rb_flexible_ok) {
            Flexible = "OK";
        } else {
            Flexible = "NOK";
        }
        if (rgAir.getCheckedRadioButtonId() == R.id.rb_air_ok) {
            Air = "OK";
        } else {
            Air = "NOK";
        }
        if (rgFlexible.getCheckedRadioButtonId() == R.id.rb_flexible_ok) {
            Flexible = "OK";
        } else {
            Flexible = "NOK";
        }
        if (rgWheel.getCheckedRadioButtonId() == R.id.rb_wheel_ok) {
            wheel = "OK";
        } else {
            wheel = "NOK";
        }
        if (rgFloor.getCheckedRadioButtonId() == R.id.rb_floor_ok) {
            Floor = "OK";
        } else {
            Floor = "NOK";
        }
        if (rgCleanSecure.getCheckedRadioButtonId() == R.id.rb_clean_secure_ok) {
            Clean_Secure = "OK";
        } else {
            Clean_Secure = "NOK";
        }
        if (rgRails.getCheckedRadioButtonId() == R.id.rb_rails_ok) {
            Rails = "OK";
        } else {
            Rails = "NOK";
        }
        if (rgEnsure.getCheckedRadioButtonId() == R.id.rb_ensure_ok) {
            Ensure = "OK";
        } else {
            Ensure = "NOK";
        }
        if (rgLoose.getCheckedRadioButtonId() == R.id.rb_loose_ok) {
            Loose = "OK";
        } else {
            Loose = "NOK";
        }
        if (rgSpare.getCheckedRadioButtonId() == R.id.rb_spare_ok) {
            Spare = "OK";
        } else {
            Spare = "NOK";
        }
        if (rgCorrectly.getCheckedRadioButtonId() == R.id.rb_correctly_ok) {
            Correctly = "OK";
        } else {
            Correctly = "NOK";
        }
        if (rgAdequatte.getCheckedRadioButtonId() == R.id.rb_adequatte_ok) {
            Adequatta = "OK";
        } else {
            Adequatta = "NOK";
        }
        if (rgInstrument.getCheckedRadioButtonId() == R.id.rb_instrument_ok) {
            Instrument = "OK";
        } else {
            Instrument = "NOK";
        }
        if (rgDoorLocks.getCheckedRadioButtonId() == R.id.rb_door_locks_ok) {
            Door_locks = "OK";
        } else {
            Door_locks = "NOK";
        }
        if (rgComputerNodes.getCheckedRadioButtonId() == R.id.rb_computer_nodes_ok) {
            Computer_Nodes = "OK";
        } else {
            Computer_Nodes = "NOK";
        }
        if (rgLanConnection.getCheckedRadioButtonId() == R.id.rb_lan_connection_Ok) {
            Lan_connnection = "OK";
        } else {
            Lan_connnection = "NOK";
        }
        if (rgClean1.getCheckedRadioButtonId() == R.id.rb_clean1_Ok) {
            Clean1 = "OK";
        } else {
            Clean1 = "NOK";
        }
        if (rgChange.getCheckedRadioButtonId() == R.id.rb_change_Ok) {
            Change = "OK";
        } else {
            Change = "NOK";
        }
        if (rgCleanHost.getCheckedRadioButtonId() == R.id.rb_clean_host_Ok) {
            Clean_host = "OK";
        } else {
            Clean_host = "NOK";
        }
        if (rgDelete.getCheckedRadioButtonId() == R.id.rb_delete_Ok) {
            Delete = "OK";
        } else {
            Delete = "NOK";
        }
        if (rgBackup.getCheckedRadioButtonId() == R.id.rb_backup_Ok) {
            Backup = "OK";
        } else {
            Backup = "NOK";
        }
        if (rgForNormal.getCheckedRadioButtonId() == R.id.rb_for_normal_Ok) {
            Normal = "OK";
        } else {
            Normal = "NOK";
        }
        if (rgExterior.getCheckedRadioButtonId() == R.id.rb_exterior_Ok) {
            Exterior = "OK";
        } else {
            Exterior = "NOK";
        }
        if (rgAvailible.getCheckedRadioButtonId() == R.id.rb_availible_Ok) {
            Exterior = "OK";
        } else {
            Exterior = "NOK";
        }
        if (rgSet.getCheckedRadioButtonId() == R.id.rb_set_Ok) {
            Set = "OK";
        } else {
            Set = "NOK";
        }
        if (rgSupplies.getCheckedRadioButtonId() == R.id.rb_supplies_Ok) {
            Supplies = "OK";
        } else {
            Supplies = "NOK";
        }
        if (rgVesda.getCheckedRadioButtonId() == R.id.rb_vesda_Ok) {
            Vesda = "OK";
        } else {
            Vesda = "NOK";
        }
        if (rgOperation1.getCheckedRadioButtonId() == R.id.rb_operation1_Ok) {
            Operation1 = "OK";
        } else {
            Operation1 = "NOK";
        }
        if (rgTest.getCheckedRadioButtonId() == R.id.rb_test_ok) {
            Test = "Ok";
        } else {
            Test = "NOK";
        }
        if (rgAirSampling.getCheckedRadioButtonId() == R.id.rb_air_sampling_ok) {
            Air_sampling = "OK";
        } else {
            Air_sampling = "NOK";
        }
        if (rgFilterGrills.getCheckedRadioButtonId() == R.id.rb_filter_grills_ok) {
            Filter_grils = "OK";
        } else {
            Filter_grils = "NOK";
        }
        if (rgProjector1.getCheckedRadioButtonId() == R.id.rb_projector1_ok) {
            Projector1 = "OK";
        } else {
            Projector1 = "NOK";
        }
        if (rgAuto.getCheckedRadioButtonId() == R.id.rb_auto_ok) {
            Auto = "OK";
        } else {
            Auto = "NOK";
        }
        Approved = edtApproved.getText().toString();
        Checked = edtChecked.getText().toString();

        Toast.makeText(this, "Base :" + Base + "\n" +
                        "Cabinet :" + Cabinet + "\n" +
                        "Inspection :" + Inspection + "\n" +
                        "Measure :" + Measure + "\n" +
                        "Motion_cabinet :" + Motion_cabinet + "\n" +
                        "Emo :" + Emo + "\n" +
                        "Check :" + Check + "\n" +
                        "Loading_System :" + Loading_System + "\n" +
                        "Inspact :" + Inspact + "\n" +
                        "Power_pack :" + Power_pack + "\n" +
                        "Safety :" + Safety + "\n" +
                        "Test1 :" + Test1 + "\n" +
                        "Filter :" + Filter + "\n" +
                        "Flexible :" + Flexible + "\n" +
                        "Air :" + Air + "\n" +
                        "whell :" + wheel + "\n" +
                        "hose :" + hose + "\n" +
                        "Floor :" + Floor + "\n" +
                        "Clean_Secure :" + Clean_Secure + "\n" +
                        "Rails :" + Rails + "\n" +
                        "Seat :" + Seat + "\n" +
                        "Ensure :" + Ensure + "\n" +
                        "Loose :" + Loose + "\n" +
                        "Spare :" + Spare + "\n" +
                        "Correctly :" + Correctly + "\n" +
                        "Adequatta +" + Adequatta + "\n" +
                        "Instrumen :" + Instrument + "\n" +
                        "Normal :" + Normal + "\n" +
                        "Exterior :" + Exterior + "\n" +
                        "Availible :" + Avaalible + "\n" +
                        "Set :" + Set + "\n" +
                        "Supplies :" + Supplies + "\n" +
                        "Vesda :" + Vesda + "\n" +
                        "Operation1 :" + Operation1 + "\n" +
                        "Operation2 :" + Operation2 + "\n" +
                        "Test :" + Test1 + "\n" +
                        "Air_sampling :" + Air_sampling + "\n" +
                        "Filter_grils :" + Filter_grils + "\n" +
                        "Projector1 :" + Projector1 + "\n" +
                        "Chacked :" + Chacked + "\n" +
                        "Approved :" + Approved + "\n"+
                "Mocab :"+ Mocab +"\n" +
                "Rudder :"+ Rudder +"\n"+
                "Stabilzer :"+ Stabilizer +"\n"+
                "Trim :"+ Trim +"\n"+
                "Landing :"+ Landing +"\n" +
                "Aileron :"+ Aileron +"\n"
                , Toast.LENGTH_SHORT).show();

    }
}
