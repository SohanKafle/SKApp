package com.example.skapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class GridViewExample extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.grid_view);
        gridView =findViewById(R.id.mygrid);
//creating string array
        String names[]=  {"Sohan","Subash","Aakash","Bibek","Surendra"};
//displaying list using ArrayAdapter
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (this,R.layout.grid_view_items,R.id.text,names);

        gridView.setAdapter(adapter);
    }

}
