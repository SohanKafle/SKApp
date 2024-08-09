package com.example.skapp;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class CustomGridExample extends AppCompatActivity {

    GridView gridView;
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.custom_grid_list);
        gridView =findViewById(R.id.mygrid);
// creating arrays
        String[] title={
                "Title 1", "Title 2",
                "Title 3", "Title 4"};
        String[] description={
                "This is description 1",
                "This is description 2",
                "This is description 3",
                "This is description 4"
        };

        int[] image={
//Replace with different images
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background
        };
//passing arrays to constructor of MyListAdapter
        MyCustomGrid_Adapter adapter=new MyCustomGrid_Adapter

                (this,title,description,image);

        gridView.setAdapter(adapter);
    }
}
