package com.example.skapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityFirst extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityfirst);

        Button btn = findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(ActivityFirst.this,ActivitySecond.class);

                //passing data using putExtra
                i.putExtra("id", 001);
                i.putExtra("name", "Sohan");
                i.putExtra("address", "Gaindakot");
                startActivity(i);
            }
        });
    }
}