package com.example.skapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OddEven extends AppCompatActivity {

    Button b;
    EditText e;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oddeven);
        e=(EditText)findViewById(R.id.num1);
        b=(Button)findViewById(R.id.calculate);
        t=(TextView)findViewById(R.id.textview);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int n1= Integer.parseInt(e.getText().toString());
                if (n1%2==0){
                    t.setText("Even");
                }
                else{
                    t.setText("Odd");
                }
            }
        });
    }
}
