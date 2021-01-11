package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class Technical extends AppCompatActivity implements selectedcommite  {
    technicalAdapter adapter;
    RecyclerView recyclerView;
    selectedcommite selectedcommite;
    ArrayList<technicalclass> techArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical);
        recyclerView = findViewById(R.id.techrec);
        techArrayList = new ArrayList<>();
        techArrayList.add(new technicalclass("Android", R.drawable.and));
        techArrayList.add(new technicalclass("Java", R.drawable.jav));
        techArrayList.add(new technicalclass("Web", R.drawable.web));
        techArrayList.add(new technicalclass("Network", R.drawable.network));
        techArrayList.add(new technicalclass("Classic control", R.drawable.control));
        techArrayList.add(new technicalclass("Embedded system", R.drawable.bic));
        techArrayList.add(new technicalclass("Security", R.drawable.security));
        techArrayList.add(new technicalclass("Machine learning", R.drawable.maclearn));
        adapter = new technicalAdapter(techArrayList, this);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);


    }


    @Override
    public void onitemclick(int postion) {
        switch (postion){
            case 0:
                Intent intent=new Intent(Technical.this,Android.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1=new Intent(Technical.this,javaa.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2=new Intent(Technical.this,web.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3=new Intent(Technical.this,network.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4=new Intent(Technical.this,control.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5=new Intent(Technical.this,embded.class);
                startActivity(intent5);
                break;
            case 6:
                Intent intent6=new Intent(Technical.this,security.class);
                startActivity(intent6);
                break;
            case 7:
                Intent intent7=new Intent(Technical.this,machinelearning.class);
                startActivity(intent7);
                break;
        }
    }

    public static class sponserAdapter {
    }
}

