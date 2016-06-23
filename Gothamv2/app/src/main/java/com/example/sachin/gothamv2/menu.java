package com.example.sachin.gothamv2;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by sachin on 6/17/2016.
 */
public class menu extends ListActivity {
    String classes[]={"MainActivity", "Graph","Record","Plots"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(menu.this, android.R.layout.simple_list_item_1, classes ));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);
        String cheese = classes[position];
        try{
            Class ourClass = Class.forName("com.example.sachin.gothamv2."+cheese);
            Intent ourIntent = new Intent(menu.this, ourClass);
            startActivity(ourIntent);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
