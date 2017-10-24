package com.medical.xumeng.leadscreen.LeadScreen.Levels.Venous;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class VLevelSixNine extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlevel_six_nine);
        initViews(new VLevelSixNineFragment());
        initEvents();
        setTitle("Venous 60-69 ug/dL");

    }

}
