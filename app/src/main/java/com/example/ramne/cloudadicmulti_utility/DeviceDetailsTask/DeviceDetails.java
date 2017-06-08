package com.example.ramne.cloudadicmulti_utility.DeviceDetailsTask;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ramne.cloudadicmulti_utility.R;

public class DeviceDetails extends AppCompatActivity {

    TextView mTextView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_details);

        mTextView=(TextView)findViewById(R.id.details) ;

        String details = "VERSION.RELEASE : " + Build.VERSION.RELEASE
                + "\nVERSION.SDK.NUMBER : " + Build.VERSION.SDK_INT
                + "\nBRAND : " + Build.BRAND
                + "\nCPU_ABI : " + Build.CPU_ABI
                + "\nHARDWARE : " + Build.HARDWARE
                + "\nMANUFACTURER : " + Build.MANUFACTURER
                + "\nMODEL : " + Build.MODEL
                + "\nSERIAL : " + Build.SERIAL;
        mTextView.setText(details);
    }
}
