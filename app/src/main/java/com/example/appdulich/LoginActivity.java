package com.example.appdulich;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView registerSwitchTextView = findViewById(R.id.registerButton1);
        registerSwitchTextView.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
        Button btnLogin = findViewById(R.id.loginButton);

        // Sự kiện nhấn nút "Đăng nhập"
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang NotificationActivity
                Intent intent = new Intent(LoginActivity.this, NotificationActivity.class);
                startActivity(intent);
            }
        });
    }

}
