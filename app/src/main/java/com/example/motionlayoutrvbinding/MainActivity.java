package com.example.motionlayoutrvbinding;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRV();
    }

    private void initRV() {
        RecyclerView rvItems = findViewById(R.id.rv_items);

        rvItems.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rvItems.setLayoutManager(new LinearLayoutManager(this));
        rvItems.setAdapter(new SimpleAdapter(this));
    }
}
