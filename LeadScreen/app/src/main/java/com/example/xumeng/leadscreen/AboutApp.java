package com.example.xumeng.leadscreen;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AboutApp extends Fragment {

    private OnFragmentInteractionListener mListener;
    private String filename1="AboutApp",filename2="AboutApp2";
    private String feedback="Feedback: ",address="jds.pocapps@gmail.com";

  /*  @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ActionBar actionBar=((AppCompatActivity)getActivity()).getSupportActionBar();
           actionBar.hide();
        return inflater.inflate(R.layout.fragment_about_app,container,false);
    }
*/

    @Override
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                               Bundle savedInstanceState) {
          if (mListener != null) {
              mListener.removeAppBar();
          }

          LinearLayout l = (LinearLayout)inflater.inflate(R.layout.fragment_about_app, container, false);
          TextView tv = new TextView(container.getContext());
          tv.setText(getClickableSpan());
          tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);

          l.addView(tv);
          return l;
      }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


    private SpannableStringBuilder getClickableSpan() {
        StringBuilder text = new StringBuilder();
        readFile(text,filename1);
        String s1=text.toString();
        text=new StringBuilder();
        readFile(text,filename2);
        String s2=text.toString();
        final String link1=getResources().getString(R.string.ref1);

        String content=s1+feedback+address+'\n'+s2;

        int start1=s1.length()+feedback.length(),end1=start1+address.length();

        SpannableStringBuilder spanStr = new SpannableStringBuilder();
        spanStr.append(content);

        //set underline
        spanStr.setSpan(new UnderlineSpan(),start1,end1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //set link to web
//        spanStr.setSpan(new URLSpan(link1),start1,end1,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //open gmail
        Intent intent=new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"+address));
        if (intent.resolveActivity(getActivity().getPackageManager())!= null) {
            startActivity(intent);
        }
        return spanStr;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    private void readFile(StringBuilder text, String filename){
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

    public interface OnFragmentInteractionListener {
        public void removeAppBar();
    }

}
