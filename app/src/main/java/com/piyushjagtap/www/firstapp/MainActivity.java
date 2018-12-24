package com.piyushjagtap.www.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.piyushjagtap.www.firstapp.Navigation.NavigationActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private  final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Do onCreate");
        TextView txtView = findViewById(R.id.textNameID);
        EditText editTextUsrNm = findViewById(R.id.usernameID);
        EditText editTextPass = findViewById(R.id.passwordID);
        Log.d(TAG,"Do password value" + getResources().getString(R.string.hint_for_pass));
        Button bt1 = findViewById(R.id.button1);
        bt1.setOnClickListener(this);
        Log.d(TAG,"check"+ getResources().getDisplayMetrics().density);
        int dp = 1;
        double dpi =  getResources().getDisplayMetrics().density;
        double px = dp * (dpi/160);
        Log.d(TAG,"pixel " + px);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Do onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Do onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Do onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Do onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Do onDestroy");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG,"Login Back Pressed");
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG,"Submit");
//        Intent i1 = new Intent(this,Dashboard.class);
//        startActivity(i1);
        Intent i2 = new Intent(this,NavigationActivity.class);
        startActivity(i2);


    }
}
