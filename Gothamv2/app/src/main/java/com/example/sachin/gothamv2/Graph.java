package com.example.sachin.gothamv2;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Graph extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
    }
    Intent intent = getIntent();
    public void Compare(View view) {
        Intent intent = new Intent(this, Record.class);
        startActivity(intent);
    }
    public void Start_button(View view){

    }

}
