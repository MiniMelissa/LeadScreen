package com.medical.xumeng.leadscreen.LeadScreen.WHW;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class WHWScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whwscreen);
        initViews(new WHWFragment());
        initEvents();
        setTitle("Who How When");

//        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
//        toolbar.setTitle("");
//        TextView toolbarTitle =(TextView) toolbar.findViewById(R.id.toolbar_title);
//        toolbarTitle.setText("Who How When");
//        toolbarTitle.setGravity(Gravity.CENTER_HORIZONTAL);
//        toolbar.setTitle("Who How When");
//        toolbar.setForegroundGravity(Gravity.CENTER_HORIZONTAL);
//        toolbarTitle.setForegroundGravity(Gravity.CENTER_HORIZONTAL);
//        setSupportActionBar(toolbar);

//        getSupportActionBar().hide();
//        getSupportActionBar().setTitle("Test");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void openLeadRiskSurvey(View view){
        Intent intent=new Intent(this, SubSuveyScreen.class);
        startActivity(intent);
    }

}
