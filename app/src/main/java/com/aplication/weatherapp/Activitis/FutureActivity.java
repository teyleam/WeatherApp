package com.aplication.weatherapp.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aplication.weatherapp.Domains.FutureDomain;
import com.aplication.weatherapp.R;

import java.util.ArrayList;

public class FutureActivity extends AppCompatActivity {
    
    private RecyclerView adapterTommorow;
    public RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);
        
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<FutureDomain> items = new ArrayList<>();

        items.add(new FutureDomain("Sat", "storm","storm",20,10));
        items.add(new FutureDomain("Sun", "cloudy","cloudy",25,16));
        items.add(new FutureDomain("Mon", "windy","windy",29,14));
        items.add(new FutureDomain("Tue", "cloudy_sunny","Cloudy_Sunny",21,19));
        items.add(new FutureDomain("Wen", "sun","Sunny",28,10));
        items.add(new FutureDomain("Thu", "rainy","Rainy",23,1));

    }
}