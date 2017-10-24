package com.medical.xumeng.leadscreen.LeadScreen.Levels.Venous;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
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
public class VLevelFiveFragment extends Fragment {

    private String filename="Vfive";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout l=(LinearLayout) inflater.inflate(R.layout.fragment_vlevel_five, container, false);
        ScrollView scrollView=new ScrollView(container.getContext());
        TextView textView=new TextView(container.getContext());
        textView.setText(getClickableSpan());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        scrollView.addView(textView);
        l.addView(scrollView);
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

    private SpannableStringBuilder getClickableSpan() {
        StringBuilder text = new StringBuilder();
        readFile(text);
        String s1=text.toString();
        final String link1=getResources().getString(R.string.c1);
        String content=s1+link1;

        int start1=s1.length(),end1=start1+link1.length();
        SpannableStringBuilder spanStr = new SpannableStringBuilder();
        spanStr.append(content);
        //set underline
        spanStr.setSpan(new UnderlineSpan(),start1,end1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //set link to web
        spanStr.setSpan(new URLSpan(link1),start1,end1,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spanStr;
    }

}
