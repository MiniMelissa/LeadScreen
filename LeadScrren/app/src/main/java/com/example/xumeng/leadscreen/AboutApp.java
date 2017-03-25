package com.example.xumeng.leadscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
    }

    public void openDisclaimerScreen(View view){
        Intent intent = new Intent(this, Disclaimer.class);
        startActivity(intent);
    }
    public void openLeadScreen(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openReferenceScreen(View view){
        Intent intent = new Intent(this, Reference.class);
        startActivity(intent);
    }
}
