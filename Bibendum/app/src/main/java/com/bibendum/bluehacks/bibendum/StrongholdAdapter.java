package com.bibendum.bluehacks.bibendum;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class StrongholdAdapter extends RecyclerView.Adapter<StrongholdAdapter.MyViewHolder> {
    private ArrayList<Item> itemList;
    Context c;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
        }
    }


    public StrongholdAdapter(ArrayList<Item> itemList, Context c) {
        this.itemList = itemList;
        this.c = c;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recview_row_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.name.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
