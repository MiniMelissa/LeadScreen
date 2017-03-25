package com.example.xumeng.leadscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.xumeng.leadscreen.LeadScreen.EvaluationScreen;
import com.example.xumeng.leadscreen.LeadScreen.GuideLineScreen;
import com.example.xumeng.leadscreen.LeadScreen.LevelScreen;
import com.example.xumeng.leadscreen.LeadScreen.SurveyScreen;
import com.example.xumeng.leadscreen.LeadScreen.Symptoms;
import com.example.xumeng.leadscreen.LeadScreen.WHWScreen;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    private TabLayout.Tab one;
    private TabLayout.Tab two;
    private TabLayout.Tab three;
    private TabLayout.Tab four;

    private Button whw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initEvents();
//        pressButton();
    }

    private void initViews(){
        mViewPager=(ViewPager) findViewById(R.id.viewPager);
        mTabLayout=(TabLayout) findViewById(R.id.tabLayout);

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            private String[] mTitles = new String[]{"Lead Screen", "Disclaimer", "About App","References"};

            @Override
            public Fragment getItem(int position) {
                if (position == 1) {
                    return new Disclaimer();
                } else if (position == 2) {
                    return new AboutApp();
                }else if (position==3){
                    return new Reference();
                }
                return new MainLeadScreen();
            }

            @Override
            public int getCount() {
                return mTitles.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitles[position];
            }
        });

        mTabLayout.setupWithViewPager(mViewPager);

        one = mTabLayout.getTabAt(0);
        two = mTabLayout.getTabAt(1);
        three = mTabLayout.getTabAt(2);
        four = mTabLayout.getTabAt(3);

        //get icon from ios version

        one.setIcon(getResources().getDrawable(R.mipmap.ic_launcher,null));
        two.setIcon(getResources().getDrawable(R.mipmap.ic_launcher,null));
        three.setIcon(getResources().getDrawable(R.mipmap.ic_launcher,null));
        four.setIcon(getResources().getDrawable(R.mipmap.ic_launcher,null));

    }

    private void initEvents(){
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab == mTabLayout.getTabAt(0)) {
//                    one.setIcon(getResources().getDrawable(R.drawable.ic_favorite_black_18dp));
                    mViewPager.setCurrentItem(0);
                } else if (tab == mTabLayout.getTabAt(1)) {
//                    two.setIcon(getResources().getDrawable(R.drawable.ic_favorite_black_18dp));
                    mViewPager.setCurrentItem(1);
                } else if (tab == mTabLayout.getTabAt(2)) {
//                    three.setIcon(getResources().getDrawable(R.drawable.ic_favorite_black_18dp));
                    mViewPager.setCurrentItem(2);
                }else if (tab == mTabLayout.getTabAt(3)){
//                    four.setIcon(getResources().getDrawable(R.drawable.ic_favorite_black_18dp));
                    mViewPager.setCurrentItem(3);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                if (tab == mTabLayout.getTabAt(0)) {
                    one.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
                } else if (tab == mTabLayout.getTabAt(1)) {
                    two.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
                } else if (tab == mTabLayout.getTabAt(2)) {
                    three.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
                }else if (tab == mTabLayout.getTabAt(3)){
                    four.setIcon(getResources().getDrawable(R.mipmap.ic_launcher));
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

 /*   private void pressButton(){
        whw=(Button) findViewById(R.id.www);
        whw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Fragment fragment = new WHWScreen();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.whwfragment, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
*/
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
