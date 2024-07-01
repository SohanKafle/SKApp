package com.example.skapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OddEven extends  {
    Button b;
    EditText e;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=(EditText)findViewById(R.id.num1);
        b=(Button)findViewById(R.id.calculate);
        t=(TextView)findViewById(R.id.textView);

        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                int n1 = Integer.parseInt(e.getText().toString());
                if (n1%2==0){
                    t.setText("Even");
                }
                else {
                    t.setText("Odd");
                }
            }
        });
}
