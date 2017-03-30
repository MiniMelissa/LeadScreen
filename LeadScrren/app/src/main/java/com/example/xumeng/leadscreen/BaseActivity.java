package com.example.xumeng.leadscreen;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity implements AboutApp.OnFragmentInteractionListener{

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

        one.setIcon(getResources().getDrawable(R.drawable.ic_action_leadscreen,null));
        two.setIcon(getResources().getDrawable(R.drawable.ic_action_disclaimer,null));
        three.setIcon(getResources().getDrawable(R.drawable.ic_action_aboutapp,null));
        four.setIcon(getResources().getDrawable(R.drawable.ic_action_reference,null));

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
                    one.setIcon(getResources().getDrawable(R.drawable.ic_action_leadscreen,null));
                } else if (tab == mTabLayout.getTabAt(1)) {
                    two.setIcon(getResources().getDrawable(R.drawable.ic_action_disclaimer,null));
                } else if (tab == mTabLayout.getTabAt(2)) {
                    three.setIcon(getResources().getDrawable(R.drawable.ic_action_aboutapp,null));
                }else if (tab == mTabLayout.getTabAt(3)){
                    four.setIcon(getResources().getDrawable(R.drawable.ic_action_reference,null));
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void removeAppBar() {
       /* FragmentManager fragmentManager = getSupportFragmentManager();
        List<Fragment> fragments = fragmentManager.getFragments();
        if(fragments != null){
            for(Fragment fragment : fragments){
                int id=fragment.getId();
                System.out.print(id);
                System.out.print(R.id.reference);
                if(id==R.id.reference){
                    System.out.print(id);
                    System.out.print(R.id.reference);

                    getSupportActionBar().hide();

                }
            }
        }
//        Fragment current = getSupportFragmentManager().findFragmentById(R.id.reference);
*/
    }


}
