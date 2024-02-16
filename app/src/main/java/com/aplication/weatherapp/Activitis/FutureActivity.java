package com.aplication.weatherapp.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.aplication.weatherapp.Adapter.FutureAdapters;
import com.aplication.weatherapp.Domains.FutureDomain;
import com.aplication.weatherapp.R;

import java.util.ArrayList;

public class FutureActivity extends AppCompatActivity {
    
    private RecyclerView.Adapter adapterTommorow;
    public RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);
        
        initRecyclerView();
        setVariable();
    }

    private void setVariable() {
        View backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FutureActivity.this, MainActivity.class));
            }
        });
    }

    private void initRecyclerView() {
        ArrayList<FutureDomain> items = new ArrayList<>();

        items.add(new FutureDomain("Sat", "storm","storm",20,10));
        items.add(new FutureDomain("Sun", "cloudy","cloudy",25,16));
        items.add(new FutureDomain("Mon", "windy","windy",29,14));
        items.add(new FutureDomain("Tue", "cloudy_sunny","Cloudy_Sunny",21,19));
        items.add(new FutureDomain("Wen", "sun","Sunny",28,10));
        items.add(new FutureDomain("Thu", "rainy","Rainy",23,1));

        recyclerView = findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));

        adapterTommorow = new FutureAdapters(items);
        recyclerView.setAdapter(adapterTommorow);
    }
}