package com.bibendum.bluehacks.bibendum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> habitDetail;
    private ArrayList<Integer> durationList;
    private ArrayList<Integer> frequencyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To make the back button at the tab
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent ag = new Intent(getApplicationContext(), HabitActivity.class);
                startActivity(ag);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
