package com.example.skapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Factorial extends Activity {

    EditText number;

    Button btn;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstateState){
        super.onCreate(savedInstateState);
        setContentView(R.layout.factorial);

        number = findViewById(R.id.inputNumber);
        btn = findViewById(R.id.calculateButton);
        result = findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calculateFactorial();
            }
        });
    }
    private void calculateFactorial() {
        String numberStr = number.getText().toString().trim();
        if (numberStr.isEmpty()) {
            result.setText("Please enter a number");
            return;
        }

        try {
            int number = Integer.parseInt(numberStr);
            if (number < 0) {
                result.setText("Please enter a non-negative number");
                return;
            }

            long factorial = factorial(number);
            result.setText("Factorial: " + factorial);
        } catch (NumberFormatException e) {
            result.setText("Please enter a valid number");
        }
    }

    private long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


}
