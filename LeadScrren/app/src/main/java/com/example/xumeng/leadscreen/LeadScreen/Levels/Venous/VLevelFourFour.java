package com.example.xumeng.leadscreen.LeadScreen.Levels.Venous;

import android.os.Bundle;

import com.example.xumeng.leadscreen.BaseActivity;
import com.example.xumeng.leadscreen.R;

public class VLevelFourFour extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlevel_four_four);
        initViews(new VLevelFourFourFragment());
        initEvents();
    }
}