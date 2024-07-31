package com.example.skapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class fragmentadd extends Fragment {
    EditText edtFirst,edtSecond;
    Button btnCalculate;
    TextView txtResult;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragmentadd, container,false);
        //wiring up widgets
        edtFirst=view.findViewById(R.id.edtFirst);
        edtSecond=view.findViewById(R.id.edtSecond);
        btnCalculate=view.findViewById(R.id.btnCalculate);
        txtResult=view.findViewById(R.id.txtResult);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first,second, result;
                first=Integer.parseInt(edtFirst.getText().toString());
                second=Integer.parseInt(edtSecond.getText().toString());
                result=first+second;
                txtResult.setText("Result="+result);
            }
        });
        return view;
    }
}