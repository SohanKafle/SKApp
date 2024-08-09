package com.example.skapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListViewExample extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.listview_example);
        listView=findViewById(R.id.mylist);
//creating string array
        String names[]=

                {"Sohan","Subash","Aakash","Bibek","Surendra"};

//displaying list using ArrayAdapter
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (this,R.layout.listview_items,R.id.text,names);

        listView.setAdapter(adapter);
    }
}
