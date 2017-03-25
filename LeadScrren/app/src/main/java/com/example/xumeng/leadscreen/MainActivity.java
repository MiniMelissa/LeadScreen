package com.example.xumeng.leadscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.xumeng.leadscreen.LeadScreen.EvaluationScreen;
import com.example.xumeng.leadscreen.LeadScreen.GuideLineScreen;
import com.example.xumeng.leadscreen.LeadScreen.SurveyScreen;
import com.example.xumeng.leadscreen.LeadScreen.Symptoms;
import com.example.xumeng.leadscreen.LeadScreen.WHWScreen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWHWScreen(View view){
        Intent intent = new Intent(this, WHWScreen.class);
        startActivity(intent);
    }

    public void openLevelScreen(View view){
        Intent intent = new Intent(this, LevelScreen.class);
        startActivity(intent);
    }

    public void openSymptomsScreen(View view){
        Intent intent = new Intent(this, Symptoms.class);
        startActivity(intent);
    }

    public void openSurveyScreen(View view){
        Intent intent = new Intent(this, SurveyScreen.class);
        startActivity(intent);
    }

    public void openEvaluationScreen(View view){
        Intent intent = new Intent(this, EvaluationScreen.class);
        startActivity(intent);
    }
    public void openGuideLineScreen(View view){
        Intent intent = new Intent(this, GuideLineScreen.class);
        startActivity(intent);
    }

    public void openDisclaimerScreen(View view){
        Intent intent = new Intent(this, Disclaimer.class);
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
