package com.example.appdulich;

import android.os.Bundle;
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
        setContentView(R.layout.activity_cart); // Đảm bảo layout khớp với file XML

        // Tìm RecyclerView
        cartRecyclerView = findViewById(R.id.cartRecyclerView);

        // Thiết lập LinearLayoutManager cho RecyclerView
        cartRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Tạo danh sách các items (cart items)
        cartItemList = new ArrayList<>();
        loadCartItems(); // Hàm này sẽ thêm dữ liệu vào danh sách

        // Thiết lập Adapter và kết nối với RecyclerView
        cartAdapter = new CartAdapter(cartItemList);
        cartRecyclerView.setAdapter(cartAdapter);
    }

    // Hàm mẫu để thêm dữ liệu vào danh sách giỏ hàng
    private void loadCartItems() {
        cartItemList.add(new CartItem(R.drawable.goitambun, "Trải Nghiệm Tắm Bùn Khoáng Tại Khu Nghỉ Dưỡng Hòn Tằm Nha Trang", "Combo Vé Vào Cổng \nKhu B Hòn Tằm \n4/10/2024 \n1 x Trẻ em (100-139cm) \n2 x Người lớn, 1 x Người lớn tuổi(60+)", "1,351,850 đ", "Giảm 5%", "Giảm 71,150 đ"));
        cartItemList.add(new CartItem(R.drawable.xebuyt2tang, "Vé Xe Buýt 2 Tầng Ngắm Cảnh Ở Thành Phố Hồ Chí Minh từ City Sightseeing", "Tuyến Tour Thành Phố \nBuổi tối (:16:00-21:00) 1 vòng (Không Hop-on Hop-off) \n5/10/2024 \n1 x người lớn, 1 x trẻ em(1-12)", "1,351,850 đ", "Giảm 5%", "Giảm 71,150 đ"));

    }
}

