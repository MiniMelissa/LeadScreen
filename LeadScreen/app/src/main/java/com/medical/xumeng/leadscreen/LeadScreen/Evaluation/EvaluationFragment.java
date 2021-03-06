package com.medical.xumeng.leadscreen.LeadScreen.Evaluation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.medical.xumeng.leadscreen.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * A simple {@link Fragment} subclass.
 */
public class EvaluationFragment extends Fragment {
    private String filename="Evaluation";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout l = (LinearLayout) inflater.inflate(R.layout.fragment_evaluation, container, false);
        ScrollView s = new ScrollView(container.getContext());
        TextView tv = new TextView(container.getContext());
        StringBuilder text = new StringBuilder();
        readFile(text);
        tv.setText(text.toString());
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        s.addView(tv);
        l.addView(s);
        return l;
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
