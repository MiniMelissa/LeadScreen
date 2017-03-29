package com.example.xumeng.leadscreen.LeadScreen.GuideLine;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.xumeng.leadscreen.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * A simple {@link Fragment} subclass.
 */
public class GuideFragment extends Fragment {

    private String filename="Guidelines";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout l = (LinearLayout) inflater.inflate(R.layout.fragment_guide, container, false);
        ScrollView s = new ScrollView(container.getContext());
        TextView tv = new TextView(container.getContext());
        StringBuilder text = new StringBuilder();
        readFile(text);
        tv.setText(text.toString());
        s.addView(tv);
        l.addView(s);
        return l;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


    private void readFile(StringBuilder text){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(getActivity().getAssets().open(filename)));

            String mLine;
            while ((mLine = reader.readLine()) != null) {
                text.append(mLine);
                text.append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
