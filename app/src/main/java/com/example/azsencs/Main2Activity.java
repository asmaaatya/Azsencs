package com.example.azsencs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BottomNavigationView navigationView=findViewById(R.id.nav);
        navigationView.setSelectedItemId(R.id.events);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.archievefeed:
                        startActivity(new Intent(getApplicationContext(),archieveandfeed.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.events:
                        return true;
                    case R.id.suppliers:
                        startActivity(new Intent(getApplicationContext(),Sponsers.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.committe:
                        startActivity(new Intent(getApplicationContext(),startactivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
