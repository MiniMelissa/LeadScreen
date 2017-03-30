package com.example.xumeng.leadscreen.LeadScreen.Survey;


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

import com.example.xumeng.leadscreen.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * A simple {@link Fragment} subclass.
 */
public class RiskSurveyFragment extends Fragment {

    private String filename1="RiskSurvey",filename2="RiskSurvey2",filename3="RiskSurvey3";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        LinearLayout l = (LinearLayout) inflater.inflate(R.layout.fragment_risk_survey, container, false);
        ScrollView s = new ScrollView(container.getContext());
        TextView tv1 = new TextView(container.getContext());
/*       readFile(text,"RiskSurvey");
        String content = text.toString()+link1;
        content+="\n";
        text = new StringBuilder();
        readFile(text,"RiskSurvey2");
        content+=text.toString();
        content+=link2;
        content+="\n";
        text = new StringBuilder();
        readFile(text,"RiskSurvey3");
        content+=text.toString();
        */
        tv1.setText(getClickableSpan());
        tv1.setMovementMethod(LinkMovementMethod.getInstance());
        tv1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);

        s.addView(tv1);
        l.addView(s);
        return l;
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

    private SpannableStringBuilder getClickableSpan() {
        StringBuilder text = new StringBuilder();
        readFile(text,filename1);
        String s1=text.toString();
        text=new StringBuilder();
        readFile(text,filename2);
        String s2=text.toString();
        text = new StringBuilder();
        readFile(text,filename3);
        String s3=text.toString();
        final String link1=getResources().getString(R.string.RSlinkI);
        final String link2=getResources().getString(R.string.RSlinkII);
        String content=s1+link1+s2+link2+'\n'+s3;

        int start1=s1.length(),end1=start1+link1.length();
        int start2=content.indexOf(link2),end2=start2+link2.length();

        SpannableStringBuilder spanStr = new SpannableStringBuilder();
        spanStr.append(content);
        //set underline
        spanStr.setSpan(new UnderlineSpan(),start1,end1,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //set link to web
        spanStr.setSpan(new URLSpan(link1),start1,end1,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spanStr.setSpan(new UnderlineSpan(),start2,end2+1,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spanStr.setSpan(new URLSpan(link2),start2,end2,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spanStr;
    }
}
