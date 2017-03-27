package com.example.xumeng.leadscreen;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BaseActivity extends AppCompatActivity {

    protected ViewPager mViewPager;
    protected TabLayout mTabLayout;

    protected TabLayout.Tab one;
    protected TabLayout.Tab two;
    protected TabLayout.Tab three;
    protected TabLayout.Tab four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        initViews(new MainLeadScreen());
        initEvents();
    }

    protected void initViews(final Fragment fragment){
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
                return fragment;
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

    protected void initEvents(){
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


}
