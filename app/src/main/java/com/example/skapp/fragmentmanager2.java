package com.example.skapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragmentmanager2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup
            container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragmentmanager2, container,
                false);
        return view;
    }
}