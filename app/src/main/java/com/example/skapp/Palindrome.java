//WAP to check the string is palindrome is not.

package com.example.skapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Palindrome extends Activity {

    Button checkbutton;
    EditText string;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palindrome);

        checkbutton = findViewById(R.id.checkButton);
        string = findViewById(R.id.string);
        result = findViewById(R.id.result);

        checkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatePalindrome();
            }
        });
    }

    private void calculatePalindrome() {
        String numberStr = string.getText().toString();

        if (numberStr.isEmpty()) {
            result.setText("Please enter the String");
        }

        String reversedStr = new StringBuilder(numberStr).reverse().toString();
        if (numberStr.equalsIgnoreCase(reversedStr)) {
            result.setText("The string is a palindrome");
        } else {
            result.setText("The string is not a palindrome");
        }
    }
}