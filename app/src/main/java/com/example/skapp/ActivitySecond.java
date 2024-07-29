package com.example.skapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivitySecond extends Activity {
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activitysecond);

        //receiving data
        Intent i=getIntent();
        int id=i.getIntExtra("id",0);
        //second argument is default value
        String name=i.getStringExtra("name");
        String address=i.getStringExtra("address");

        //Displaying received data in TextView
        TextView txt=findViewById(R.id.text2);
        txt.setText("Id"+id+"\n"+"Name="+name+"\n"+"Address="+address);


    }
}
