package com.example.appdulich.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdulich.Adapter.DescriptionAdapter;
import com.example.appdulich.R;

import java.util.ArrayList;
import java.util.List;

public class TicketDetailsActivity extends AppCompatActivity {
    ArrayList<String> list;
    RecyclerView rcvDesc;
    ImageButton btnClose;
    Button btnDatHang;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ticket_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnClose = findViewById(R.id.imageButton3);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnDatHang = findViewById(R.id.btnDatHang);
        btnDatHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TicketDetailsActivity.this, OrderDetailsActivity.class);
                startActivity(intent);
            }
        });

        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                // Tạo hiệu ứng chuyển cảnh
                finish();
            }
        });
        initData();

        rcvDesc = findViewById(R.id.rcv_listInfo);
        rcvDesc.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        rcvDesc.setAdapter(new DescriptionAdapter(list));
    }

    private void initData() {
        list = new ArrayList<>(List.of("Đà Nẵng nằm ở trung tâm dải đất hình chữ S của Việt Nam, cách Hà Nội khoảng 760 km về phía Bắc và cách Thành phố Hồ Chí Minh khoảng 960 km về phía Nam.",
                "Đây là cửa ngõ giao thương quan trọng giữa miền Trung với cả nước, nằm gần nhiều di sản văn hóa thế giới như Hội An, Mỹ Sơn và Huế.",
                "Đà Nẵng có nét văn hóa giao thoa giữa các vùng miền Bắc - Trung - Nam, đồng thời chịu ảnh hưởng từ các cộng đồng người Chăm và người Hoa."));
    }


}