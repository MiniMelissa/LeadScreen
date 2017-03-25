package com.example.xumeng.leadscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Disclaimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);
    }

    public void openLeadScreen(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openAppScreen(View view){
        Intent intent = new Intent(this, AboutApp.class);
        startActivity(intent);
    }
    public void openReferenceScreen(View view){
        Intent intent = new Intent(this, Reference.class);
        startActivity(intent);
    }
}
