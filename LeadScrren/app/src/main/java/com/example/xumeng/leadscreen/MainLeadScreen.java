package com.example.xumeng.leadscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainLeadScreen extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main_lead_screen,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

 /*  public void openWHWScreen(View view){
        Intent intent = new Intent();
        intent.setClass(getActivity(), WHWScreen.class);
        getActivity().startActivity(intent);
    }
*/


}
