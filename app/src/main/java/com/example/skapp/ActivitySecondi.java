package com.example.skapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySecondi extends Activity {
    Button btn;
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activitysecondi);
        btn=findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.putExtra("message","Hello First Activity!");
                setResult(2,i);
                finish();//finishing activity
            }
        });
    }
}
