package com.example.xumeng.leadscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Disclaimer extends Fragment {
//    private OnFragmentInteractionListener mListener;

   @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        getActivity().setTitle("Disclaimer");
        return inflater.inflate(R.layout.fragment_disclaimer,container,false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
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
