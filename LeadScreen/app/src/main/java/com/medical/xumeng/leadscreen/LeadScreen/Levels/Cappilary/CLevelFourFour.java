package com.medical.xumeng.leadscreen.LeadScreen.Levels.Cappilary;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class CLevelFourFour extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clevel_four_four);
        initViews(new CLevelFourFourFragment());
        initEvents();
        setTitle("Capillary 25-44 ug/dL");

    }
}
