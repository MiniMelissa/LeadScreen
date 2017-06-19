package com.example.xumeng.leadscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Disclaimer extends Fragment {
//    private OnFragmentInteractionListener mListener;

    private String filename="Disclaimer";


   @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//       View v = inflater.inflate(R.layout.fragment_disclaimer, container, false);
       LinearLayout l = (LinearLayout)inflater.inflate(R.layout.fragment_disclaimer, container, false);
//       ScrollView s= new ScrollView(container.getContext());
//       l.addView(s);
       TextView tv = new TextView(container.getContext());
       StringBuilder text = new StringBuilder();
       readFile(text);
       tv.setText(text.toString());
       tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
       l.addView(tv);
//       tv = new TextView(container.getContext());
//       tv.setText("Testing1...");
//       l.addView(tv);
       return l;

//        return inflater.inflate(R.layout.fragment_disclaimer,container,false);
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
/*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mListener != null) {
            mListener.onFragmentInteraction("Custom Title");
        }
        return inflater.inflate(R.layout.fragment_disclaimer, container, false);
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

    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(String title);
    }
*/
  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_disclaimer);
    }

    public void openLeadScreen(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openAppScreen(View view){
        Intent intent = new Intent(this, AboutApp.class);
        startActivity(intent);
    }
    public void openReferenceScreen(View view){
        Intent intent = new Intent(this, Reference.class);
        startActivity(intent);
    }*/
}
