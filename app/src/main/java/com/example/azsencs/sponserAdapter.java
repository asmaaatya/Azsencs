package com.example.azsencs;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class sponserAdapter extends RecyclerView.Adapter<sponserAdapter.sponsersHolder> {
    ArrayList<sponserclass> list;
    sponserclass sponserclass;
    selectedcompany selectedcompany;

    public sponserAdapter(ArrayList<com.example.azsencs.sponserclass> list, com.example.azsencs.selectedcompany selectedcompany) {
        this.list = list;
        this.selectedcompany = selectedcompany;
    }

    @NonNull
    @Override
    public sponsersHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.sponsersitem,null,false);
        sponsersHolder holder=new sponsersHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull sponsersHolder holder, final int position) {
      sponserclass=list.get(position);
      holder.imageView.setImageResource(sponserclass.getCompanyimg());
      holder.textView.setText(sponserclass.getCompanyname());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class sponsersHolder extends RecyclerView.ViewHolder{
       ImageView imageView;
       TextView textView;
       CardView cardView;
        public sponsersHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.sponstext);
            imageView=itemView.findViewById(R.id.sponsimg);
            cardView=itemView.findViewById(R.id.crd);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    selectedcompany.oncardlis(getAdapterPosition());
                }
            });
        }
    }
}
