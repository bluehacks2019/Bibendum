package com.bibendum.bluehacks.bibendum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> habitDetail;
    private ArrayList<Integer> durationList;
    private ArrayList<Integer> frequencyList;
    private Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup realm
        Realm.init(this);
        RealmConfiguration realmConfig = new RealmConfiguration.Builder()
                .name("habits.realm")
                .schemaVersion(0)
                .build();
        Realm.setDefaultConfiguration(realmConfig);

        realm = Realm.getDefaultInstance();
        //RETRIEVE
        RealmHelper helper = new RealmHelper(realm);


//        //To make the back button at the tab
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Date date = new Date();
        TextView tv = (TextView) findViewById(R.id.textView3);
        ProgressBar pb = (ProgressBar) findViewById(R.id.progressBar);
        Habit newHabit = new Habit("COOKING",2,3,new Date());
        helper.saveHabits(newHabit);
        ArrayList<Habit> habits = helper.retrieveHabits();
        for(Habit h: habits){
            tv.setText(h.getName());
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.addHabit:
                Intent ag = new Intent(getApplicationContext(), StrongholdActivity.class);
                startActivity(ag);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
}
