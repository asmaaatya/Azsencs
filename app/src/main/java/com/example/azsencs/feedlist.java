package com.example.azsencs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class feedlist extends AppCompatActivity {
RecyclerView recyclerView;
SharedPreferences preferences;
JSONObject saved;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedlist);
        recyclerView=findViewById(R.id.fedrecycle);
        preferences=getSharedPreferences("text", Context.MODE_PRIVATE);
        Log.d("Testing",preferences.getString("saved",""));
        try{
            saved=new JSONObject(preferences.getString("saved",""));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new feedadapter());
    }

    private class feedadapter extends RecyclerView.Adapter<feedadapter.Holder> {


        @NonNull
        @Override
        public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view=LayoutInflater.from(feedlist.this).inflate(R.layout.feedbackitem,null,false);
            Holder holder=new Holder(view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position=recyclerView.getChildPosition(view);
                    Intent intent=new Intent(feedlist.this,Feedback.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
            });
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull Holder holder, int position) {
try{
    holder.textView.setText(saved.getString("saved"+position));

} catch (JSONException e) {
    e.printStackTrace();
}
        }

        @Override
        public int getItemCount() {
            return saved.length();
        }

        class Holder extends RecyclerView.ViewHolder{
TextView textView;
            public Holder(@NonNull View itemView) {
                super(itemView);
                textView=itemView.findViewById(R.id.feditem);
            }
        }
    }
}
