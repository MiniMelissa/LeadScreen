package com.medical.xumeng.leadscreen.LeadScreen.Levels.Venous;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class VLevelNine extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlevel_nine);
        initViews(new VLevelNineFragment());
        initEvents();
        setTitle("Venous 5-9 ug/dL");

    }
}
