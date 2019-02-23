package com.bibendum.bluehacks.bibendum;


import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

//import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.MyViewHolder> {

    private List<Habit> habitsList;
    Context c;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView text, time, date, groupName ;

        public MyViewHolder(View view) {
            super(view);
            text = (TextView) view.findViewById(R.id.text);
            time = (TextView) view.findViewById(R.id.time);
            //date = (TextView) view.findViewById(R.id.date);
            //groupName = (TextView) view.findViewById(R.id.groupName);
        }
    }


    public MainActivityAdapter(Context c) {
        //this.announcementList = announcementList;
        this.c = c;
    }

    @Override
    public int getItemViewType(int position) {
        return (position == habitsList.size()) ? R.layout.addhabit_recview_row_layout : R.layout.main_recview_row_layout;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(c)
                .inflate(R.layout.main_recview_row_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Habit h = habitsList.get(position);
        holder.text.setText(h.getName());
        //holder.date.setText(h.getDate());
        holder.time.setText(h.getFrequency());
        //holder.groupName.setText(h.getGroupName());
    }

    @Override
    public int getItemCount() {
        return habitsList.size();
    }


}

