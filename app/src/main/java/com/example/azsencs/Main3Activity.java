package com.example.azsencs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity implements selectedevent {
    RecyclerView recyclerView;
    eventAdapter adapter;
    BottomNavigationView navigationView;
    selectedevent selectedevent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerView = findViewById(R.id.evrec);
        navigationView = findViewById(R.id.nav);
        navigationView.setSelectedItemId(R.id.events);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.committe:
                        startActivity(new Intent(getApplicationContext(), startactivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.events:
                        return true;
                    case R.id.archievefeed:
                        startActivity(new Intent(getApplicationContext(), archieveandfeed.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.suppliers:
                        startActivity(new Intent(getApplicationContext(), Sponsers.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
        ArrayList<event> eventArrayList = new ArrayList<>();
        eventArrayList.add(new event("",R.drawable.ev1,""));
        eventArrayList.add(new event("", R.drawable.ev2, ""));
        eventArrayList.add(new event(" ", R.drawable.ev3, ""));
        eventArrayList.add(new event("",R.drawable.ev4,""));
        eventArrayList.add(new event("",R.drawable.ev5,""));
        eventArrayList.add(new event("",R.drawable.ev6,""));
        eventArrayList.add(new event("",R.drawable.ev7,""));
        eventArrayList.add(new event("",R.drawable.ev8,""));
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        adapter = new eventAdapter(eventArrayList, this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void oneventclick(int positon) {
        switch (positon) {
            case 0:
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://fb.me/e/20CLY9FBq"));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
            case 1:
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://fb.me/e/3QxKjTiVw"));
                if (intent1.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent1);
                }
            case 2:
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://fb.me/e/1HtWdoMA8"));
                if (intent2.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent2);
                }
            case 3:
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("https://fb.me/e/20OQnB3rm"));
                if (intent3.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent3);
                }
            case 4:
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                intent4.setData(Uri.parse("https://fb.me/e/1Rr9O1dJP"));
                if (intent4.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent4);
                }
            case 5:
                Intent intent5 = new Intent(Intent.ACTION_VIEW);
                intent5.setData(Uri.parse("https://fb.me/e/1KhVyqA9u"));
                if (intent5.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent5);
                }
            case 6:
                Intent intent7 = new Intent(Intent.ACTION_VIEW);
                intent7.setData(Uri.parse("https://fb.me/e/374g8EZTh"));
                if (intent7.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent7);
                }
            case 7:
                Intent intent8 = new Intent(Intent.ACTION_VIEW);
                intent8.setData(Uri.parse("https://fb.me/e/3BoKoaoRf"));
                if (intent8.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent8);
                }

        }
    }
}

