package com.example.skapp;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle Test","Activity Created");
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("Lifecycle Test","Activity Strated");
    }
    protected void onResume()
    {
        super.onStart();
        Log.d("Lifecycle Test","Activity Resumed");
    }
    protected void onRestart()
    {
        super.onStart();
        Log.d("Lifecycle Test","Activity Restarted");
    }
    protected void onPause()
    {
        super.onStart();
        Log.d("Lifecycle Test","Activity Paused");
    }
    protected void onStop()
    {
        super.onStart();
        Log.d("Lifecycle Test","Activity Stopped");
    }
    protected void onDestroy()
    {
        super.onStart();
        Log.d("Lifecycle Test","Activity Destroyed");
    }
}
