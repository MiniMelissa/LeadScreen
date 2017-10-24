package com.medical.xumeng.leadscreen.LeadScreen.Levels.Cappilary;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class CLevelSeventy extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clevel_seventy);
        initViews(new CLevelSeventyFragment());
        initEvents();
        setTitle("Capillary >=70 ug/dL");

    }
}
