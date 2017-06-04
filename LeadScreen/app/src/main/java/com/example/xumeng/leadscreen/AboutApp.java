package com.example.xumeng.leadscreen;


import android.app.Activity;
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

public class AboutApp extends Fragment {

    private OnFragmentInteractionListener mListener;
    private String filename="AboutApp";

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
          StringBuilder text = new StringBuilder();
          readFile(text);
          tv.setText(text.toString());
          tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);

          l.addView(tv);
          return l;
//          return inflater.inflate(R.layout.fragment_about_app, container, false);
      }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
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

    public interface OnFragmentInteractionListener {
        public void removeAppBar();
    }

}
