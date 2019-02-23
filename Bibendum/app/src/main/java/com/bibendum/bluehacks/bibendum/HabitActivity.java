package com.bibendum.bluehacks.bibendum;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HabitActivity extends AppCompatActivity {

    TextInputEditText habitView;
    EditText duration, frequency;
    Button btnMinusD, btnAddD, btnMinusF, btnAddF, addHabitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habit);

        setTitle("YAY NEW HABIT!");

        habitView = (TextInputEditText) findViewById(R.id.habitText);
        duration = (EditText) findViewById(R.id.durationText);
        frequency = (EditText) findViewById(R.id.frequencyText);

        duration.setText("66");
        frequency.setText("1");

        btnMinusD=(Button)findViewById(R.id.buttonMinusD);
        btnAddD=(Button)findViewById(R.id.buttonAddD);
        btnMinusF=(Button)findViewById(R.id.buttonMinusF);
        btnAddF=(Button)findViewById(R.id.buttonAddF);
        addHabitBtn=(Button)findViewById(R.id.addHabitBtn);

        //Button Listeners
        btnMinusD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                int curr = Integer.parseInt(duration.getText().toString());
                if(curr >= 67) duration.setText((Integer.parseInt(duration.getText().toString())-1)+"");
            }
        });
        btnAddD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                duration.setText((Integer.parseInt(duration.getText().toString())+1)+"");
            }
        });
        btnMinusF.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                int curr = Integer.parseInt(frequency.getText().toString());
                if(curr >= 1) frequency.setText((Integer.parseInt(frequency.getText().toString())-1)+"");
            }
        });
        btnAddF.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                frequency.setText((Integer.parseInt(frequency.getText().toString())+1)+"");
            }
        });
        addHabitBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

            }
        });



    }
}