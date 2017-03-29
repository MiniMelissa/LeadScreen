package com.example.xumeng.leadscreen.LeadScreen.Levels.Venous;

import android.os.Bundle;

import com.example.xumeng.leadscreen.BaseActivity;
import com.example.xumeng.leadscreen.R;

public class VLevelFiveNine extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlevel_five_nine);
        initViews(new VLevelFiveNineFragment());
        initEvents();
        setTitle("Venous 45-59 ug/dL");

    }
}
