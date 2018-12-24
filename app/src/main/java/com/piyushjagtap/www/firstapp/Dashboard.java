package com.piyushjagtap.www.firstapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {
    private final String TAG = "Dashboard";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Button fragmentBtn1 = findViewById(R.id.fragmentbtn1);
        Button fragmentBtn2 = findViewById(R.id.fragmentbtn2);
        Button fragmentBtn3 = findViewById(R.id.fragmentbtn3);
        fragmentBtn1.setOnClickListener(this);
        fragmentBtn2.setOnClickListener(this);
        fragmentBtn3.setOnClickListener(this);

        //Different method to create different onClick methods to call buttons
//        fragmentBtn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG,"button1");
//            }
//        });
//        fragmentBtn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG,"button2");
//            }
//        });
    }

    @Override
    public void onClick(View v) {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Log.d(TAG, "frag" + v.getId());
        switch (v.getId()) {
            case R.id.fragmentbtn1:
                Log.d(TAG, "button1");
                ft.replace(R.id.fragmentContainer,new Fragment1());
                ft.addToBackStack("Fragment_1");
                ft.commit();
                break;
            case R.id.fragmentbtn2:
                Log.d(TAG, "button2");
                ft.replace(R.id.fragmentContainer,new Fragment2());
                ft.addToBackStack("Fragment_2");
                ft.commit();
                break;
            case R.id.fragmentbtn3:
                Log.d(TAG, "button3");
                ft.replace(R.id.fragmentContainer,new Fragment3());
                ft.addToBackStack("Fragment_3");
                ft.commit();
            default:
                break;
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG,"Dashboard back pressed");
    }
}
//    @Override
//    public void onClick(View v) {
//        Log.d(TAG,"frag"+v.getId());
//        switch (v.getId()){
//            case R.id.fragmentbtn1:
//                Log.d(TAG,"button1");
//                break;
//            case R.id.fragmentbtn2:
//                Log.d(TAG,"button2");
//                break;
//                default:
//                    break;
//

