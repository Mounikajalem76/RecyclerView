package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myviewholder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView name_view,email_view;
    public Myviewholder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image_view);
        name_view=itemView.findViewById(R.id.name);
        email_view=itemView.findViewById(R.id.email);
    }
}
