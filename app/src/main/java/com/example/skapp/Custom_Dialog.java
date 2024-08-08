package com.example.skapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Custom_Dialog extends Activity {

    EditText edtFirst, edtSecond;
    Button btnClick, btnCalculate;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);

        // Initialize the button for the main activity
        btnClick = findViewById(R.id.btnClick);

        // Set an onClick listener for the button
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    public void showDialog() {
        // Create an AlertDialog Builder
        AlertDialog.Builder builder = new AlertDialog.Builder(Custom_Dialog.this);
        builder.setTitle("Calculate Sum");
        builder.setCancelable(true);

        // Inflate the custom dialog layout
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_dialog, null);
        builder.setView(view);

        // Wiring up the widgets
        edtFirst = view.findViewById(R.id.edtFirst);
        edtSecond = view.findViewById(R.id.edtSecond);
        btnCalculate = view.findViewById(R.id.btnCalculate);
        txtResult = view.findViewById(R.id.txtResult);

        // Set an onClick listener for the calculate button
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int first = Integer.parseInt(edtFirst.getText().toString());
                    int second = Integer.parseInt(edtSecond.getText().toString());
                    int result = first + second;
                    txtResult.setText("Result=" + result);
                } catch (NumberFormatException e) {
                    txtResult.setText("Please enter valid numbers");
                }
            }
        });

        // Create and show the alert dialog
        AlertDialog alert = builder.create();
        alert.show();
    }
}
