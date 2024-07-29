package com.example.skapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityFirsti extends Activity {
    TextView txt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityfirsti);

        txt=findViewById(R.id.text1);
        btn=findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ActivityFirsti.this,
                        ActivitySecondi.class);
//starting activity with result code 2
                startActivityForResult(i,2);
            }
        });
    }
    // Call Back method to get the Message form other Activity
    @Override
    protected void onActivityResult(int requestCode, int
            resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
// check if the request code is same as what is passed here it is 2
        if(requestCode==2)
        {
            String message=data.getStringExtra("message");
            txt.setText(message);
        }
    }
}
