package com.example.xumeng.leadscreen.LeadScreen.Survey;

import android.os.Bundle;

import com.example.xumeng.leadscreen.BaseActivity;
import com.example.xumeng.leadscreen.R;

public class SurveyScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_screen);

        initViews(new RiskSurveyFragment());
        initEvents();
    }



}
