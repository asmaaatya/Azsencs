package com.example.azsencs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class operationAdapter extends RecyclerView.Adapter<operationAdapter.operationHolder>{
     ArrayList<operationclass> oparrayList;
     selectedcommite2 selectedcommite2;
operationclass operationclass;

    public operationAdapter(ArrayList<com.example.azsencs.operationclass> oparrayList, com.example.azsencs.selectedcommite2 selectedcommite2) {
        this.oparrayList = oparrayList;
        this.selectedcommite2 = selectedcommite2;
    }

    @NonNull
    @Override
    public operationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.operitem,null,false);
        operationHolder holder=new operationHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull operationHolder holder, int position) {
operationclass=oparrayList.get(position);
holder.nametext.setText(operationclass.getOpername());
holder.imgeop.setImageResource(operationclass.getOperimg());
    }

    @Override
    public int getItemCount() {
        return oparrayList.size();
    }

    public  class  operationHolder extends RecyclerView.ViewHolder{
TextView nametext;
ImageView imgeop;
        public operationHolder(@NonNull View itemView) {
            super(itemView);
            nametext=itemView.findViewById(R.id.optext);
            imgeop=itemView.findViewById(R.id.opimg);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    selectedcommite2.onoplistner(getAdapterPosition());
                }
            });
        }
    }
}
