package com.example.xumeng.leadscreen.LeadScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.xumeng.leadscreen.LeadScreen.WHW.LeadRiskSurvey;
import com.example.xumeng.leadscreen.R;

public class WHWScreen extends AppCompatActivity {

 /*   @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_whwscreen,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whwscreen);
    }

    public void openLeadRiskSurvey(View view){
        Intent intent=new Intent(this, LeadRiskSurvey.class);
        startActivity(intent);
    }
}