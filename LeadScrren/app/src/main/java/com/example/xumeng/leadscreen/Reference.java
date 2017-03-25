package com.example.xumeng.leadscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Reference extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference);
    }

    public void openDisclaimerScreen(View view){
        Intent intent = new Intent(this, Disclaimer.class);
        startActivity(intent);
    }
    public void openAppScreen(View view){
        Intent intent = new Intent(this, AboutApp.class);
        startActivity(intent);
    }

    public void openLeadScreen(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
