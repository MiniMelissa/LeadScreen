package com.medical.xumeng.leadscreen.LeadScreen.GuideLine;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class GuideLineScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_line_screen);
        initViews(new GuideFragment());
        initEvents();
        setTitle("Differing Guidelines");
    }
}
