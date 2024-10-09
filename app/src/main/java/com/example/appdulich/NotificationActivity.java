package com.example.appdulich;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongbao);

        // Xử lý sự kiện khi nhấn nút quay lại
        ImageView backImageView = findViewById(R.id.backImageView);
        backImageView.setOnClickListener(v -> {
            // Kết thúc activity và quay lại màn hình trước đó
            finish();
        });

        findViewById(R.id.orderUpdateButton).setOnClickListener(v -> {
            // Xử lý nút Cập nhật đơn hàng
        });

        findViewById(R.id.promotionButton).setOnClickListener(v -> {
            // Xử lý nút Ưu đãi
        });

        findViewById(R.id.reminderButton).setOnClickListener(v -> {
            // Xử lý nút Lời nhắc
        });
    }
}