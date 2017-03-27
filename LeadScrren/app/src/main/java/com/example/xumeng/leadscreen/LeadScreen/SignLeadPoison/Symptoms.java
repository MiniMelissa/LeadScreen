package com.example.xumeng.leadscreen.LeadScreen.SignLeadPoison;

import android.os.Bundle;

import com.example.xumeng.leadscreen.BaseActivity;
import com.example.xumeng.leadscreen.R;

public class Symptoms extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        initViews(new SymptonFragment());
        initEvents();
        setTitle("Signs & Symptoms");

    }
}
