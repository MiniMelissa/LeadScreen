package com.medical.xumeng.leadscreen.LeadScreen.Survey;

import android.os.Bundle;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class SurveyScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_screen);

        initViews(new RiskSurveyFragment());
        initEvents();
        setTitle("Risk Survey");

    }



}
