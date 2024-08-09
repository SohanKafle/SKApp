package com.example.skapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewExample extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.recycleview_example);
        recyclerView=findViewById(R.id.recyclerview);
//creating array
        String[] name={"Sohan","Subash","Aakash","Bibek","Surendra"};
        String[] address={
                "Gaindakot","Arunkhola","Daldaley",
                "Dumkibash","Tanahun"
        };
        int[] image={
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background
        };
//setting layout manager
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
//passing array to Adapter class
        adapter=new RecyclerViewAdapter(this,name,address,image);
        recyclerView.setAdapter(adapter);
    }
}
