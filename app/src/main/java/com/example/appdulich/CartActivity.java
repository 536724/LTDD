package com.example.appdulich;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import android.widget.Toast;

public class CartActivity extends AppCompatActivity {

    private RecyclerView cartRecyclerView;
    private CartAdapter cartAdapter;
    private List<CartItem> cartItemList;
    private TextView totalPriceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        cartRecyclerView = findViewById(R.id.cartRecyclerView);
        totalPriceTextView = findViewById(R.id.totalPriceTextView); // TextView để hiển thị tổng tiền

        cartRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        cartItemList = new ArrayList<>();
        loadCartItems();
        cartAdapter = new CartAdapter(cartItemList);
        cartRecyclerView.setAdapter(cartAdapter);

        ImageButton quayLai = findViewById(R.id.backButton);
        quayLai.setOnClickListener(v -> finish());

        // Xử lý nút thanh toán
        Button payButton = findViewById(R.id.paySelectedButton);
        payButton.setOnClickListener(v -> {
            paySelectedItems();
        });
    }

    private void loadCartItems() {
        cartItemList.add(new CartItem(R.drawable.goitambun, "Trải Nghiệm Tắm Bùn Khoáng", "Combo Vé Vào Cổng", "1,351,850 đ", "Giảm 5%", "Giảm 71,150 đ"));
        cartItemList.add(new CartItem(R.drawable.xebuyt2tang, "Vé Xe Buýt 2 Tầng", "Tuyến Tour Thành Phố", "1,351,850 đ", "Giảm 5%", "Giảm 71,150 đ"));
    }

    private void paySelectedItems() {
        // Xóa tất cả các mục được chọn
        for (int i = cartItemList.size() - 1; i >= 0; i--) {
            if (cartItemList.get(i).isSelected()) {
                cartItemList.remove(i);
            }
        }

        cartAdapter.notifyDataSetChanged(); // Cập nhật lại RecyclerView

        // Hiển thị thông báo thanh toán thành công
        Toast.makeText(this, "Thanh toán thành công!", Toast.LENGTH_SHORT).show();

        // Cập nhật tổng tiền
        updateTotalPrice();
    }

    private void updateTotalPrice() {
        double total = 0;
        for (CartItem item : cartItemList) {
            if (item.isSelected()) {
                String priceString = item.getPrice().replaceAll("[^\\d]", "");  // Chỉ lấy số từ chuỗi giá
                if (!priceString.isEmpty()) {
                    double price = Double.parseDouble(priceString);
                    total += price;
                }
            }
        }
        totalPriceTextView.setText("Tổng tiền: " + total + " đ");
    }
}
