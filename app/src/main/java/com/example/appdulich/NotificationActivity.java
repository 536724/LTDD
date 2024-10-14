package com.example.appdulich;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongbao);

        Button backIcon = findViewById(R.id.orderUpdateButton);

        // Sự kiện nhấn icon quay lại
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang CartActivity (Giỏ hàng)
                Intent intent = new Intent(NotificationActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });
    }
}