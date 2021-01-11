package com.example.azsencs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class startactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startactivity);
        CardView cardView=findViewById(R.id.card1);
        CardView cardView1=findViewById(R.id.card2);
        BottomNavigationView navigationView=findViewById(R.id.nav);
        navigationView.setSelectedItemId(R.id.committe);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.archievefeed:
                        startActivity(new Intent(getApplicationContext(),archieveandfeed.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.committe:
                        return true;
                    case R.id.suppliers:
                        startActivity(new Intent(getApplicationContext(),Sponsers.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.events:
                        startActivity(new Intent(getApplicationContext(),Main3Activity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),commites.class);
                startActivity(intent);
            }
        });



        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),whoarewe.class);
                startActivity(intent);
            }
        });
    }


}
