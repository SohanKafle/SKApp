package com.example.skapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCustomGrid_Adapter extends ArrayAdapter<String> {

    Activity context;
    String[] title;
    String[] description;
    int[] image;
    public MyCustomGrid_Adapter(Activity context, String[] title, String[]

            description, int[] image) {

//ArrayAdapter needs String so we are supplying title
        super(context, R.layout.custom_grid_list_items,title);
        this.context=context;
        this.title=title;
        this.description=description;
        this.image=image;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.custom_grid_list_items,

                null,true);

//wiring widgets
        TextView txtTitle = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById

                (R.id.image);

        TextView txtDescription = (TextView) rowView.findViewById
                (R.id.description);

        txtTitle.setText(title[position]);
        imageView.setImageResource(image[position]);
        txtDescription.setText(description[position]);
        return rowView;
    };
}

