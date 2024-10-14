package com.example.appdulich.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.appdulich.Fragment.EndowFragment;
import com.example.appdulich.Fragment.HomeFragment;
import com.example.appdulich.Fragment.LoveFragment;
import com.example.appdulich.Fragment.ProfileFragment;
import com.example.appdulich.Fragment.TripFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new EndowFragment();
            case 2:
                return new LoveFragment();
            case 3:
                return new TripFragment();
            case 4:
                return new ProfileFragment();
            default: return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
