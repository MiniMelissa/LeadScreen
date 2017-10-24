package com.medical.xumeng.leadscreen.LeadScreen.Levels.Venous;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class VLevelOneFour extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlevel_one_four);
        initViews(new VLevelOneFourFragment());
        initEvents();
        setTitle("Venous 10-14 ug/dL");

    }
}
