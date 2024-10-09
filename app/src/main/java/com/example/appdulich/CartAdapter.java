package com.example.appdulich;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    private List<CartItem> cartItemList;

    // Constructor để truyền danh sách các item
    public CartAdapter(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Gán layout item (cart_item.xml)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item, parent, false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        // Lấy item từ danh sách và gán dữ liệu vào view
        CartItem item = cartItemList.get(position);
        holder.itemTitle.setText(item.getTitle());
        holder.itemDetails.setText(item.getDetails());
        holder.itemPrice.setText(item.getPrice());
        holder.itemDiscount.setText(item.getDiscount());
        holder.itemVoucher.setText(item.getVoucher());
        holder.itemImage.setImageResource(item.getImageResId());
    }

    @Override
    public int getItemCount() {
        return cartItemList.size();
    }

    // ViewHolder cho các item trong RecyclerView
    static class CartViewHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView itemTitle, itemDetails, itemPrice, itemDiscount, itemVoucher;
        ImageButton itemDelete;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage);
            itemTitle = itemView.findViewById(R.id.itemTitle);
            itemDetails = itemView.findViewById(R.id.itemDetails);
            itemPrice = itemView.findViewById(R.id.itemPrice);
            itemDiscount = itemView.findViewById(R.id.itemDiscount);
            itemVoucher = itemView.findViewById(R.id.itemVoucher);
            itemDelete = itemView.findViewById(R.id.itemDelete);
        }
    }
}

