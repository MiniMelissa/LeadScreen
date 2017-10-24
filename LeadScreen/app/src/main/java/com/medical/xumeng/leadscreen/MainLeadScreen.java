package com.medical.xumeng.leadscreen;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainLeadScreen extends Fragment {

    private AlertDialog.Builder builder;
    public static final String PREFS_NAME = "MyPrefsFile";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Context context=getActivity();
//        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        boolean dialogShown = settings.getBoolean("dialogShown", false);
//        String username = settings.getString("username", null);
        if (!dialogShown) {
            // AlertDialog code here
            showSimpleDialog();
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("dialogShown", true);
            editor.commit();
        }
        return inflater.inflate(R.layout.fragment_main_lead_screen,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void showSimpleDialog() {
        builder=new AlertDialog.Builder(this.getActivity());
        builder.setIcon(R.mipmap.ic_launcher);
//        builder.setTitle(R.string.simple_dialog);
        builder.setMessage(R.string.start);

        //监听下方button点击事件
        builder.setPositiveButton(R.string.getStated, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(getApplicationContext(),R.string.toast_postive,Toast.LENGTH_SHORT).show();
            }
        });

        //设置对话框是可取消的
        builder.setCancelable(true);
        AlertDialog dialog=builder.create();
        dialog.show();
    }
}
