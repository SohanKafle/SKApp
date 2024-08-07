package com.example.skapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PopupMenu extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupmenu);
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
