package com.example.appdulich;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    private List<CartItem> cartItemList;

    public CartAdapter(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item, parent, false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        CartItem cartItem = cartItemList.get(position);

        // Set dữ liệu vào các View
        holder.itemImage.setImageResource(cartItem.getImageResId());
        holder.itemTitle.setText(cartItem.getTitle());
        holder.itemDetails.setText(cartItem.getDetails());
        holder.itemPrice.setText(cartItem.getPrice());
        holder.itemVoucher.setText(cartItem.getVoucher());
        holder.itemDiscount.setText(cartItem.getDiscount());

        holder.itemCheckbox.setChecked(cartItem.isSelected());

        holder.itemCheckbox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            cartItem.setSelected(isChecked);
            updateTotalPrice();
        });

        holder.itemDelete.setOnClickListener(v -> {
            cartItemList.remove(position);
            notifyItemRemoved(position);
            updateTotalPrice();
        });
    }


    private void updateTotalPrice() {
    }


    @Override
    public int getItemCount() {
        return cartItemList.size();
    }

    public static class CartViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemTitle, itemDetails, itemPrice, itemVoucher, itemDiscount;
        ImageButton itemDelete;
        CheckBox itemCheckbox;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage);
            itemTitle = itemView.findViewById(R.id.itemTitle);
            itemDetails = itemView.findViewById(R.id.itemDetails);
            itemPrice = itemView.findViewById(R.id.itemPrice);
            itemVoucher = itemView.findViewById(R.id.itemVoucher);
            itemDiscount = itemView.findViewById(R.id.itemDiscount);
            itemDelete = itemView.findViewById(R.id.itemDelete);
            itemCheckbox = itemView.findViewById(R.id.itemCheckbox);
        }
    }

}

