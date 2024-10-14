package com.example.appdulich;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.example.appdulich.Adapter.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ViewPagerAdapter viewPagerAdapter;
    ViewPager2 viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.view_pager);
        bottomNavigationView = findViewById(R.id.bottom_navigate);
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(R.id.home == item.getItemId()){
                    viewPager.setCurrentItem(0);
                    return true;
                } else if (R.id.gift == item.getItemId()) {
                    viewPager.setCurrentItem(1);
                    return true;
                }
                else if (R.id.favourite == item.getItemId()) {
                    viewPager.setCurrentItem(2);
                    return true;
                }
                else if (R.id.travel == item.getItemId()) {
                    viewPager.setCurrentItem(3);
                    return true;
                }
                else if (R.id.account == item.getItemId()){
                    viewPager.setCurrentItem(4);
                    return true;
                }
                return false;
            }
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                if (position >= 0 && position < bottomNavigationView.getMenu().size()) {
                    switch (position) {
                        case 0: bottomNavigationView.getMenu().getItem(0).setChecked(true); break; // home
                        case 1: bottomNavigationView.getMenu().getItem(1).setChecked(true); break; // gift
                        case 2: bottomNavigationView.getMenu().getItem(2).setChecked(true); break; // favourite
                        case 3: bottomNavigationView.getMenu().getItem(3).setChecked(true); break; // travel
                        case 4: bottomNavigationView.getMenu().getItem(4).setChecked(true); break; // account
                    }
                } else {
                    Log.e("ERROR", "Invalid position: " + position);
                }
            }
        });
    }
}