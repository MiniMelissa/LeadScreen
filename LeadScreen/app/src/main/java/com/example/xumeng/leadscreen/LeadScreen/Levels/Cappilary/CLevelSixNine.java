package com.example.xumeng.leadscreen.LeadScreen.Levels.Cappilary;

import android.os.Bundle;

import com.example.xumeng.leadscreen.BaseActivity;
import com.example.xumeng.leadscreen.R;

public class CLevelSixNine extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clevel_six_nine);
        initViews(new CLevelSixNineFragment());
        initEvents();
        setTitle("Capillary 60-69 ug/dL");

    }
}
