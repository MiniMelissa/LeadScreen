package com.medical.xumeng.leadscreen.LeadScreen.Levels.Venous;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class VLevelFive extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlevel_five);
        initViews(new VLevelFiveFragment());
        initEvents();
        setTitle("Venous < 5 ug/dL");

    }
}
