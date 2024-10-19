package com.example.appdulich.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.appdulich.Fragment.NewSearchFragment;
import com.example.appdulich.Fragment.TopSearchFragment;
import com.example.appdulich.Fragment.TrendSearchFragment;

public class ViewPagerSearchAdapter extends FragmentStateAdapter {
    public ViewPagerSearchAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new TopSearchFragment();
            case 1: return new NewSearchFragment();
            case 2: return new TrendSearchFragment();
            default: return new TopSearchFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
