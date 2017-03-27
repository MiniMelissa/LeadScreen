package com.example.xumeng.leadscreen.LeadScreen.Levels.Cappilary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.xumeng.leadscreen.BaseActivity;
import com.example.xumeng.leadscreen.R;

public class CappilaryTest extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cappilary_test);
        initViews(new CappilaryFragment());
        initEvents();
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.fiveug:
                intent = new Intent(this, CLevelFine.class);
                break;
            case R.id.nineug:
                intent = new Intent(this, CLevelNine.class);
                break;
            case R.id.onefourug:
                intent = new Intent(this, CLevelOneFour.class);
                break;
            case R.id.twofourug:
                intent=new Intent(this,CLevelTwoFour.class);
                break;
            case R.id.fourfourug:
                intent=new Intent(this,CLevelFourFour.class);
                break;
            case R.id.fivenineug:
                intent =new Intent(this,CLevelFiveNine.class);
                break;
            case R.id.sixnineug:
                intent=new Intent(this,CLevelSixNine.class);
                break;
            default:
                intent=new Intent(this,CLevelSeventy.class);
        }
        startActivity(intent);
    }
}
