package com.example.azsencs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class archieveandfeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archieveandfeed);
              BottomNavigationView navigationView=findViewById(R.id.nav);
        CardView cardView=findViewById(R.id.card3);
        CardView cardView1=findViewById(R.id.card4);
        navigationView.setSelectedItemId(R.id.archievefeed);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.committe:
                        startActivity(new Intent(getApplicationContext(),startactivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.archievefeed:
                        return true;
                    case R.id.events:
                        startActivity(new Intent(getApplicationContext(),Main3Activity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.suppliers:
                        startActivity(new Intent(getApplicationContext(),Sponsers.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(getApplicationContext(),Archieve.class);
                startActivity(intent1);
            }
        });
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(getApplicationContext(),Feedback.class);
                startActivity(intent2);
            }
        });
    }
}
