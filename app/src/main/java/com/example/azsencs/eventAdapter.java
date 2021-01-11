package com.example.azsencs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

class eventAdapter extends RecyclerView.Adapter<eventAdapter.vholder> {
  ArrayList<event> events=new ArrayList<>();
event e;
selectedevent selectedevent;

    public eventAdapter(ArrayList<event> events, selectedevent selectedevent) {
        this.events = events;
        this.selectedevent = selectedevent;
    }

    @NonNull
    @Override
    public vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.eventitem,null,false);
        vholder hold=new vholder(v);
        return hold;
    }

    @Override
    public void onBindViewHolder(@NonNull vholder holder, int position) {
e=events.get(position);
holder.name.setText(e.getName());
holder.date.setText(e.getDate());
holder.imageView.setImageResource(e.getImg());
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public  class vholder extends RecyclerView.ViewHolder{
TextView name;
TextView date;
ImageView imageView;
CardView cardView;
        public vholder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.eventname);
            imageView=itemView.findViewById(R.id.eventimg);
            date=itemView.findViewById(R.id.datetext);
            cardView=itemView.findViewById(R.id.eventcard);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    selectedevent.oneventclick(getAdapterPosition());
                }
            });
        }
    }
}
