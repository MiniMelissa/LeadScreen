package com.example.xumeng.leadscreen;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.xumeng.leadscreen.LeadScreen.Evaluation.EvaluationScreen;
import com.example.xumeng.leadscreen.LeadScreen.GuideLine.GuideLineScreen;
import com.example.xumeng.leadscreen.LeadScreen.Levels.LevelScreen;
import com.example.xumeng.leadscreen.LeadScreen.SignLeadPoison.Symptoms;
import com.example.xumeng.leadscreen.LeadScreen.Survey.SurveyScreen;
import com.example.xumeng.leadscreen.LeadScreen.WHW.WHWScreen;

public class MainActivity extends BaseActivity {

    private AlertDialog.Builder builder;
    public static final String PREFS_NAME = "MyPrefsFile";
//    private boolean flag=true;

//    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews(new MainLeadScreen());
        initEvents();
        setTitle("Lead Screen");

        //apear only when first run app
      /*  SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        boolean dialogShown = settings.getBoolean("dialogShown", false);
        String username = settings.getString("username", null);


        if (dialogShown) {
            // AlertDialog code here
            showSimpleDialog();
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("dialogShown", true);
            editor.commit();
        }*/
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

    private void showSimpleDialog() {
        builder=new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher);
//        builder.setTitle(R.string.simple_dialog);
        builder.setMessage(R.string.start);

        //监听下方button点击事件
        builder.setPositiveButton(R.string.getStated, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(getApplicationContext(),R.string.toast_postive,Toast.LENGTH_SHORT).show();
            }
        });

        //设置对话框是可取消的
        builder.setCancelable(true);
        AlertDialog dialog=builder.create();
        dialog.show();
    }

}
