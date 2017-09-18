package com.example.xumeng.leadscreen;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoreApps extends Fragment implements View.OnClickListener {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_more_apps, container, false);

        Button topList = (Button) v.findViewById(R.id.gotoPlayStore);
        topList.setOnClickListener(this);
        Button doclist = (Button) v.findViewById(R.id.gotoApplist);
        doclist.setOnClickListener(this);
        return v;
    }

    @Override
     public void onClick(View v){
       Intent intent = null;
       switch(v.getId()) {
           case R.id.gotoPlayStore:
               intent = new Intent(Intent.ACTION_VIEW);
               intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Joshua+Steinberg+MD"));
               break;
           case R.id.gotoApplist:
               intent = new Intent(Intent.ACTION_VIEW);
               intent.setData(Uri.parse("https://docs.wixstatic.com/ugd/cd92db_a2edb67225874be49f37954b7df7a373.doc?dn=Apps%20list%206-17.doc"));
               break;
           default:break;
       }
       startActivity(intent);
   }


}
