package com.example.xumeng.leadscreen.LeadScreen.Levels;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xumeng.leadscreen.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * A simple {@link Fragment} subclass.
 */
public class CVTestFragment extends Fragment {

    private String filename1="Question";
    private String filename2="Mark";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_cvtest, container, false);
        TextView textView1,textView2;
        textView1=(TextView) v.findViewById(R.id.question);
        textView2=(TextView)v.findViewById(R.id.levelmark);
        StringBuilder s1 =new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        readFile(s1,filename1);
        readFile(s2,filename2);
        textView1.setText(s1.toString());
        textView2.setText(s2.toString());
        textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        return v;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void readFile(StringBuilder text,String filename){
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
