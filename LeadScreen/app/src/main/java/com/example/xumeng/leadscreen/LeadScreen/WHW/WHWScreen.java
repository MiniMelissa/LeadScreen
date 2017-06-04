package com.example.xumeng.leadscreen.LeadScreen.WHW;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.xumeng.leadscreen.BaseActivity;
import com.example.xumeng.leadscreen.R;

public class WHWScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whwscreen);
        initViews(new WHWFragment());
        initEvents();
        setTitle("Who How When");
//        getSupportActionBar().hide();
//        getSupportActionBar().setTitle("Test");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void openLeadRiskSurvey(View view){
        Intent intent=new Intent(this, SubSuveyScreen.class);
        startActivity(intent);
    }

}
