package com.example.azsencs;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class technicalAdapter extends RecyclerView.Adapter<technicalAdapter.technicalHolder> {
ArrayList<technicalclass> techArrayList;
    technicalclass obj;
    Context context;
    private  selectedcommite selectedcommite;
    public technicalAdapter(ArrayList<technicalclass> techArrayList,selectedcommite selectedcommite) {
        this.techArrayList = techArrayList;
        this.selectedcommite=selectedcommite;
    }


    @NonNull
    @Override
    public technicalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.technicalitem,null,false);
technicalHolder holder=new technicalHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull technicalHolder holder, int position) {
technicalclass obj=techArrayList.get(position);
holder.title.setText(obj.getCommitename());
holder.imageView.setImageResource(obj.getCommitephoto());
    }

    @Override
    public int getItemCount() {
        return techArrayList.size();
    }

    class technicalHolder extends RecyclerView.ViewHolder {
TextView title;
ImageView imageView;
        public technicalHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.tx);
            imageView=itemView.findViewById(R.id.im);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    selectedcommite.onitemclick(getAdapterPosition());
                }
            });
        }
    }
}

