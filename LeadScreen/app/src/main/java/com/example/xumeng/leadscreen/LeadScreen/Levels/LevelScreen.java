package com.example.xumeng.leadscreen.LeadScreen.Levels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.xumeng.leadscreen.BaseActivity;
import com.example.xumeng.leadscreen.LeadScreen.Levels.Cappilary.CappilaryTest;
import com.example.xumeng.leadscreen.LeadScreen.Levels.Venous.VenousTest;
import com.example.xumeng.leadscreen.R;

public class LevelScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_screen);
        initViews(new CVTestFragment());
        initEvents();
        setTitle("Capillary & Venous");
    }

    public void openCappilary(View view){
        Intent intent=new Intent(this, CappilaryTest.class);
        startActivity(intent);
    }

    public void openVenous(View view){
        Intent intent=new Intent(this, VenousTest.class);
        startActivity(intent);
    }
}
