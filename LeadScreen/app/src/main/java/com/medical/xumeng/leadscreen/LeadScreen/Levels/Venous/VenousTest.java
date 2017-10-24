package com.medical.xumeng.leadscreen.LeadScreen.Levels.Venous;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.medical.xumeng.leadscreen.BaseActivity;
import com.medical.xumeng.leadscreen.R;

public class VenousTest extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venous_test);
        initViews(new VenousFragment());
        initEvents();
        setTitle("Venous Sample");

    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.fiveug:
                intent = new Intent(this, VLevelFive.class);
                break;
            case R.id.nineug:
                intent = new Intent(this, VLevelNine.class);
                break;
            case R.id.onefourug:
                intent = new Intent(this, VLevelOneFour.class);
                break;
            case R.id.twofourug:
                intent=new Intent(this,VLevelTwoFour.class);
                break;
            case R.id.fourfourug:
                intent=new Intent(this,VLevelFourFour.class);
                break;
            case R.id.fivenineug:
                intent =new Intent(this,VLevelFiveNine.class);
                break;
            case R.id.sixnineug:
                intent=new Intent(this,VLevelSixNine.class);
                break;
            default:
                intent=new Intent(this,VLevelSeventy.class);
        }
        startActivity(intent);
    }

}
