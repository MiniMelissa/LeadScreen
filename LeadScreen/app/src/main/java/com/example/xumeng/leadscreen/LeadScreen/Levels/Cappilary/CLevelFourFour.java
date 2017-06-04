package com.example.xumeng.leadscreen.LeadScreen.Levels.Cappilary;

import android.os.Bundle;

import com.example.xumeng.leadscreen.BaseActivity;
import com.example.xumeng.leadscreen.R;

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
