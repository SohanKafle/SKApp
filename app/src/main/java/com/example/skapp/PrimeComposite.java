package com.example.skapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeComposite extends Activity {

    Button b;
    EditText e;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primecomposite);
        e=(EditText)findViewById(R.id.num1);
        b=(Button)findViewById(R.id.calculate);
        t=(TextView)findViewById(R.id.textview);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e.getText().toString());
                if (isPrime(n1)) {
                    t.setText("Prime");
                } else {
                    t.setText("Composite");
                }
            }
        });
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // number is divisible by i, so it's not prime
            }
        }
        return true; // number is prime
    }
}
