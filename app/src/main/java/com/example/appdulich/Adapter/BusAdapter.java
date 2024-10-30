package com.example.appdulich.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdulich.Model.Bus;
import com.example.appdulich.R;

import java.util.ArrayList;

public class BusAdapter extends RecyclerView.Adapter<BusAdapter.ViewHolder> {
    ArrayList<Bus> list;
    Context context;
    public BusAdapter(ArrayList<Bus> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bus_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.city.setText(list.get(position).getCity());
        holder.desc.setText(list.get(position).getDesc());
        holder.star.setText(list.get(position).getStar()+"");
        holder.order.setText("("+list.get(position).getCity()+"k+Đã được đặt)");
        holder.img.setBackground(ContextCompat.getDrawable(context, list.get(position).getImage()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView city, desc, price, star, order;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            city = itemView.findViewById(R.id.tv_title);
            desc = itemView.findViewById(R.id.tv_desc);
            price = itemView.findViewById(R.id.tv_price);
            star = itemView.findViewById(R.id.tv_star);
            order = itemView.findViewById(R.id.tv_order);
            img = itemView.findViewById(R.id.imageView5);
        }
    }
}
