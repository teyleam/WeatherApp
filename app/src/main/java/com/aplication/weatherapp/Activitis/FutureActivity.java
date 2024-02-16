package com.aplication.weatherapp.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aplication.weatherapp.R;

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
    }
}