package com.example.xumeng.leadscreen.LeadScreen.Levels.Cappilary;

import android.os.Bundle;

import com.example.xumeng.leadscreen.BaseActivity;
import com.example.xumeng.leadscreen.R;

public class CLevelTwoFour extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clevel_two_four);
        initViews(new CLevelTwoFourFragment());
        initEvents();
        setTitle("Capillary 15-24 ug/dL");

    }
}
