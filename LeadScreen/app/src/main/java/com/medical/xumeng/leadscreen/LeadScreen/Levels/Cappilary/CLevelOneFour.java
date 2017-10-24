package com.medical.xumeng.leadscreen.LeadScreen.Levels.Cappilary;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class CLevelOneFour extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clevel_one_four);
        initViews(new CLevelOneFourFragment());
        initEvents();
        setTitle("Capillary 10-14 ug/dL");

    }
}
