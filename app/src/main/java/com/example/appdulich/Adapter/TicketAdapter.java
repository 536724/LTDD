package com.example.appdulich.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdulich.Model.Ticket;
import com.example.appdulich.R;

import java.util.ArrayList;

public class TicketAdapter extends RecyclerView.Adapter<TicketAdapter.ViewHolder> {
    ArrayList<Ticket> list;

    public TicketAdapter(ArrayList<Ticket> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public TicketAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ticket_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TicketAdapter.ViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.price.setText("Tu d "+list.get(position).getPrice()+"");
        holder.rate.setText(list.get(position).getRate()+"");
        holder.view.setText(list.get(position).getView()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name, price, rate, view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_ticket);
            name = itemView.findViewById(R.id.name_ticktet);
            price = itemView.findViewById(R.id.price_ticket);
            rate = itemView.findViewById(R.id.rate_ticket);
            view = itemView.findViewById(R.id.count_ticket);
        }
    }
}
