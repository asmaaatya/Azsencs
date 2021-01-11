package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class Operation extends AppCompatActivity implements selectedcommite2 {
    RecyclerView recyclerView;
    operationAdapter operationAdapter;
    ArrayList<operationclass> operationlist;
    selectedcommite2 selectedcommite2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);
        recyclerView = findViewById(R.id.rec2);
        operationlist = new ArrayList<>();
        operationlist.add(new operationclass("Human Resources", R.drawable.hr));
        operationlist.add(new operationclass("Public Relations", R.drawable.pr));
        operationlist.add(new operationclass("Organization", R.drawable.org));
        operationlist.add(new operationclass("Research&Development",R.drawable.randd));
        operationlist.add(new operationclass("Media", R.drawable.media));
        operationlist.add(new operationclass("Marketing", R.drawable.market));
        operationAdapter = new operationAdapter(operationlist, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(operationAdapter);

    }

    @Override
    public void onoplistner(int postion) {
        switch ((postion)) {
            case 0:
                Intent intent = new Intent(Operation.this, HR.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(Operation.this, PR.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(Operation.this, ORG.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(Operation.this, Resarchanddevelopment.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(Operation.this, Media.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(Operation.this, Marketing.class);
                startActivity(intent5);
                break;
        }
    }
}