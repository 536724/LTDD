package com.example.appdulich;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
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
    }
}
