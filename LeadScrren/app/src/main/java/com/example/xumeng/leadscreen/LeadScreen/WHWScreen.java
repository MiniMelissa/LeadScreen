package com.example.xumeng.leadscreen.LeadScreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.xumeng.leadscreen.BaseActivity;
import com.example.xumeng.leadscreen.LeadScreen.WHW.LeadRiskSurvey;
import com.example.xumeng.leadscreen.R;
import com.example.xumeng.leadscreen.WHWFragment;

public class WHWScreen extends BaseActivity {

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

        initViews(new WHWFragment());
        initEvents();
    }

    public void openLeadRiskSurvey(View view){
        Intent intent=new Intent(this, LeadRiskSurvey.class);
        startActivity(intent);
    }

}
