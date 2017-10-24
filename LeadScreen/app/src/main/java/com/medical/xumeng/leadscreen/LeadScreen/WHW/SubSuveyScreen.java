package com.medical.xumeng.leadscreen.LeadScreen.WHW;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class SubSuveyScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_suvey_screen);
        initViews(new SubSuveyScreenFragment());
        initEvents();
        setTitle("Risk Survey");
    }
}
