package com.example.skapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class simpleinterest extends Activity {

    Button btn;
    EditText Principal, Time, Rate;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simpleinterest);

        Principal = (EditText) findViewById(R.id.principal);
        Time = (EditText) findViewById(R.id.time);
        Rate = (EditText) findViewById(R.id.rate);
        btn = (Button) findViewById(R.id.calculate);
        result = (TextView) findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateSimpleInterest();
            }
        });
    }

    private void calculateSimpleInterest() {
        String principalStr = Principal.getText().toString();
        String timeStr = Time.getText().toString();
        String rateStr = Rate.getText().toString();

        if (principalStr.isEmpty() || timeStr.isEmpty() || rateStr.isEmpty()) {
            result.setText("Please enter all the fields");
            return;
        }

        double principal = Double.parseDouble(principalStr);
        double time = Double.parseDouble(timeStr);
        double rate = Double.parseDouble(rateStr);

        double simpleInterest = (principal * time * rate) / 100;
        result.setText("Simple Interest: " + simpleInterest);
    }
}