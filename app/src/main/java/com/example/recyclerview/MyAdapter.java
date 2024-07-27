package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<Myviewholder> {
    Context context;
    List<item> items;

    public MyAdapter(Context context , List<item> items ) {
        this.context = context;
        this.items= items;
    }


    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return  new Myviewholder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
holder.name_view.setText(items.get(position).getName());
holder.email_view.setText(items.get(position).getEmail());
holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
