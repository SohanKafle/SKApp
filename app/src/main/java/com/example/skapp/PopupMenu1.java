package com.example.skapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

public class PopupMenu1 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupmenu);
        Button b= findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu(v);
            }
        });
    }

    // Showing popup menu
    public void showMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.mymenu);
        popup.show();
    }

    // Handling clicks
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        if(item.getItemId() == R.id.item1){
            return true;
        }
        else if (item.getItemId() == R.id.item2)
        {
            return true;
        }

        else {
            return super.onOptionsItemSelected(item);
        }
    }
}
