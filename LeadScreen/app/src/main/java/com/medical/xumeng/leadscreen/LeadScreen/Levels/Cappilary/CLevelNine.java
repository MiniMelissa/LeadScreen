package com.medical.xumeng.leadscreen.LeadScreen.Levels.Cappilary;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class CLevelNine extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clevel_nine);
        initViews(new CLevelNineFragment());
        initEvents();
        setTitle("Capillary 5-9 ug/dL");

    }
}
