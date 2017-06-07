package com.example.xumeng.leadscreen;

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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reference extends Fragment {
    private String filename1="Reference",filename2="Reference2",filename3="Reference3",filename4="Reference4",filename5="Reference5";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        LinearLayout l = (LinearLayout) inflater.inflate(R.layout.fragment_reference, container, false);
        ScrollView s = new ScrollView(container.getContext());
        TextView tv = new TextView(container.getContext());
        tv.setText(getClickableSpan());
        tv.setMovementMethod(LinkMovementMethod.getInstance());
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        s.addView(tv);
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
        text = new StringBuilder();
        readFile(text,filename4);
        String s4=text.toString();
        text = new StringBuilder();
        readFile(text,filename5);
        String s5=text.toString();
        final String link1=getResources().getString(R.string.ref1);
        final String link2=getResources().getString(R.string.ref2);
        final String link3=getResources().getString(R.string.ref3);
        final String link4=getResources().getString(R.string.ref4);
        final String link5=getResources().getString(R.string.ref5);
        String content=s1+link1+'\n'+s2+link2+'\n'+s3+link3+'\n'+s4+link4+'\n'+s5+link5;

        int start1=s1.length(),end1=start1+link1.length();
        int start2=content.indexOf(link2),end2=start2+link2.length();
        int start3=content.indexOf(link3),end3=start3+link3.length();
        int start4=content.indexOf(link4),end4=start4+link4.length();
        int start5=content.indexOf(link5),end5=start5+link5.length();
        SpannableStringBuilder spanStr = new SpannableStringBuilder();
        spanStr.append(content);

        //set underline
        spanStr.setSpan(new UnderlineSpan(),start1,end1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //set link to web
        spanStr.setSpan(new URLSpan(link1),start1,end1,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        spanStr.setSpan(new UnderlineSpan(),start2,end2,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spanStr.setSpan(new URLSpan(link2),start2,end2,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        spanStr.setSpan(new UnderlineSpan(),start3,end3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spanStr.setSpan(new URLSpan(link3),start3,end3,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        spanStr.setSpan(new UnderlineSpan(),start4,end4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spanStr.setSpan(new URLSpan(link4),start4,end4,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        spanStr.setSpan(new UnderlineSpan(),start5,end5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spanStr.setSpan(new URLSpan(link5),start5,end5,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spanStr;
    }
}
