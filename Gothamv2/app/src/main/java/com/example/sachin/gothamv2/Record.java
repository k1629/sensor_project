package com.example.sachin.gothamv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Record extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
    }

    Intent intent = getIntent();

    public void Analyse(View view) {

        Intent intent = new Intent(this, com.example.sachin.gothamv2.Plots.class);
        startActivity(intent);

    }
}
