package com.medical.xumeng.leadscreen.LeadScreen.Levels.Venous;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class VLevelTwoFour extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlevel_two_four);
        initViews(new VLevelTwoFourFragment());
        initEvents();
        setTitle("Venous 15-24 ug/dL");

    }
}
