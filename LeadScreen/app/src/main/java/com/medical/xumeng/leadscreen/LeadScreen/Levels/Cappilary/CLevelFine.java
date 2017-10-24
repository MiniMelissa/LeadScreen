package com.medical.xumeng.leadscreen.LeadScreen.Levels.Cappilary;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class CLevelFine extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clevel_fine);
        initViews(new CLevelFineFragment());
        setTitle("Capillary < 5 ug/dL");

    }
}
