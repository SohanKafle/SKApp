package com.example.skapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class FirstMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstmenu);
    }

    //adding options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    //handling clicks
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection

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
