package com.example.xumeng.leadscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.xumeng.leadscreen.LeadScreen.Evaluation.EvaluationScreen;
import com.example.xumeng.leadscreen.LeadScreen.GuideLine.GuideLineScreen;
import com.example.xumeng.leadscreen.LeadScreen.Levels.LevelScreen;
import com.example.xumeng.leadscreen.LeadScreen.SignLeadPoison.Symptoms;
import com.example.xumeng.leadscreen.LeadScreen.Survey.SurveyScreen;
import com.example.xumeng.leadscreen.LeadScreen.WHW.WHWScreen;

public class MainActivity extends BaseActivity{

//    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews(new MainLeadScreen());
        initEvents();
        setTitle("Lead Screen");
//        fragmentManager = getSupportFragmentManager();

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


}
