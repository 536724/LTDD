package com.example.appdulich;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {

    private RecyclerView cartRecyclerView;
    private CartAdapter cartAdapter;
    private List<CartItem> cartItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        cartRecyclerView = findViewById(R.id.cartRecyclerView);

        cartRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        cartItemList = new ArrayList<>();
        loadCartItems();
        cartAdapter = new CartAdapter(cartItemList);
        cartRecyclerView.setAdapter(cartAdapter);

        ImageButton quayLai = findViewById(R.id.backButton);
        quayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void loadCartItems() {
        cartItemList.add(new CartItem(R.drawable.goitambun, "Trải Nghiệm Tắm Bùn Khoáng Tại Khu Nghỉ Dưỡng Hòn Tằm Nha Trang", "Combo Vé Vào Cổng \nKhu B Hòn Tằm \n4/10/2024 \n1 x Trẻ em (100-139cm) \n2 x Người lớn, 1 x Người lớn tuổi(60+)", "1,351,850 đ", "Giảm 5%", "Giảm 71,150 đ"));
        cartItemList.add(new CartItem(R.drawable.xebuyt2tang, "Vé Xe Buýt 2 Tầng Ngắm Cảnh Ở Thành Phố Hồ Chí Minh từ City Sightseeing", "Tuyến Tour Thành Phố \nBuổi tối (:16:00-21:00) 1 vòng (Không Hop-on Hop-off) \n5/10/2024 \n1 x người lớn, 1 x trẻ em(1-12)", "1,351,850 đ", "Giảm 5%", "Giảm 71,150 đ"));

    }
}

