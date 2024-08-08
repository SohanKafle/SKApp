package com.example.skapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class CustomListExample extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.custom_list);
        listView=findViewById(R.id.mylist);
// creating arrays
        String[] title={
                "Facebook", "Instagram",
                "Twitter", "Whatsapp"};
        String[] description={
                "A social media platform.",
                "A photo and video-sharing app.",
                "A microblogging platform.",
                "A messaging app."
        };
        int[] image={
//Replace with different images
                R.drawable.ic_launcher,
                R.drawable.ic_launcher,
                R.drawable.ic_launcher,
                R.drawable.ic_launcher
        };
//passing arrays to constructor of MyListAdapter
        MyListAdapter adapter=new MyListAdapter

                (this,title,description,image);

        listView.setAdapter(adapter);
    }
}
