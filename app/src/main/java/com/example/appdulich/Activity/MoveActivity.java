package com.example.appdulich.Activity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdulich.Adapter.BusAdapter;
import com.example.appdulich.Adapter.SearchAdapter;
import com.example.appdulich.Model.Bus;
import com.example.appdulich.Model.Search;
import com.example.appdulich.R;

import java.util.ArrayList;

public class MoveActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Bus> list;
    ImageButton btnClose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_move);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initData();
        recyclerView = findViewById(R.id.rcv_bus);
        BusAdapter busAdapter = new BusAdapter(list, this);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(busAdapter);

        btnClose = findViewById(R.id.imageButton3);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                // Tạo hiệu ứng chuyển cảnh
                finish();
            }
        });
    }

    private void initData() {
        list = new ArrayList<>();

        list.add(new Bus("Hà Nội", "Beautiful city with old quarters", 5, 150, 200, R.drawable.th1));
        list.add(new Bus("Hồ Chí Minh", "Bustling city with vibrant nightlife", 4, 300, 250, R.drawable.th2));
        list.add(new Bus("Đà Nẵng", "Coastal city with amazing beaches", 5, 200, 150, R.drawable.th3));
        list.add(new Bus("Huế", "Ancient city with historical sites", 4, 100, 100, R.drawable.th4));
        list.add(new Bus("Nha Trang", "Popular tourist city with beautiful resorts", 4, 250, 180, R.drawable.th5));
        list.add(new Bus("Phú Quốc", "Island city with amazing seafood", 5, 180, 220, R.drawable.th6));
    }
}