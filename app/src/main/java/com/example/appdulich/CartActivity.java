package com.example.appdulich;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CartAdapter cartAdapter;
    private List<CartItem> cartItemList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo danh sách các item
        cartItemList = new ArrayList<>();
        cartItemList.add(new CartItem("Trải Nghiệm Tắm Bùn...", "Combo Vé Vào Cổng...", "1,351,850 đ", "Giảm 71,150 đ", "Giảm 5%", R.drawable.goitambun));
        // Add thêm các item khác...

        // Khởi tạo RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        cartAdapter = new CartAdapter(cartItemList);
        recyclerView.setAdapter(cartAdapter);
    }
}
