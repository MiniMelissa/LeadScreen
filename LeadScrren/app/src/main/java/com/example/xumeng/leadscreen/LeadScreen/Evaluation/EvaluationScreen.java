package com.example.xumeng.leadscreen.LeadScreen.Evaluation;

import android.os.Bundle;

import com.example.xumeng.leadscreen.BaseActivity;
import com.example.xumeng.leadscreen.R;

public class EvaluationScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation_screen);
        initViews(new EvaluationFragment());
        initEvents();
    }
}
