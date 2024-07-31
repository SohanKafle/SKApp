package com.example.skapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fragmentmanager extends Activity {
    Button btnFirst,btnSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentmanager);
        btnFirst=findViewById(R.id.btnFirst);
        btnSecond=findViewById(R.id.btnSecond);
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=new fragmentmanager1();
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction =

                        manager.beginTransaction();
                transaction.replace(R.id.myfragment, fragment);
                transaction.commit();
            }
        });
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=new fragmentmanager2();
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction =

                        manager.beginTransaction();
                transaction.replace(R.id.myfragment, fragment);
                transaction.commit();
            }
        });
    }
}