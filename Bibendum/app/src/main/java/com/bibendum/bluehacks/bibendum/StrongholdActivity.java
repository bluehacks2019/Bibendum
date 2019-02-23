package com.bibendum.bluehacks.bibendum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StrongholdActivity extends AppCompatActivity {
    private ArrayList<Item> items = new ArrayList<Item>();
    private RecyclerView itemsRView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stronghold);

        //setTitle("Adventure Summary");
        itemsRView = (RecyclerView) findViewById(R.id.itemsRView);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        itemsRView.setLayoutManager(mLayoutManager);
        itemsRView.setItemAnimator(new DefaultItemAnimator());

        //getGroups gg = new getGroups();
        //gg.execute();

    }

}
