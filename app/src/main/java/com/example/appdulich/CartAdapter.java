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
        // Liên kết layout của từng mục (cart_item.xml) vào adapter
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

        // Sự kiện khi CheckBox thay đổi
        holder.itemCheckbox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            cartItem.setSelected(isChecked);  // Cập nhật trạng thái chọn
            updateTotalPrice(); // Cập nhật tổng tiền khi trạng thái checkbox thay đổi
        });

        // Sự kiện khi nhấn nút xóa
        holder.itemDelete.setOnClickListener(v -> {
            cartItemList.remove(position); // Xóa item khỏi danh sách
            notifyItemRemoved(position); // Cập nhật RecyclerView
            updateTotalPrice(); // Cập nhật lại tổng tiền khi xóa mục
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
        CheckBox itemCheckbox; // Thêm CheckBox

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

