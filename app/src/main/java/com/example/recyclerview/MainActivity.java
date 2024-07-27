package com.example.recyclerview;

import android.content.ClipData;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        List<item>
                items= new ArrayList<item>();
        items.add(new item("mounika","mounika@gmail.com",R.drawable.f));
        items.add(new item("mounika","mounika@gmail.com",R.drawable.f));
        items.add(new item("mounika","mounika@gmail.com",R.drawable.f));
        items.add(new item("mounika","mounika@gmail.com",R.drawable.f));
        items.add(new item("mounika","mounika@gmail.com",R.drawable.f));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}