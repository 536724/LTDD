package com.example.appdulich.UuDai;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class UuDaiViewPagerAdapter extends FragmentStatePagerAdapter {
    public UuDaiViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PQ_Fragment();
            case 1:
                return new HCM_Fragment();
            case 2:
                return new NT_Fragment();
            default:
                return new PQ_Fragment();
        }
    }

    @Override
    public int getCount() {

        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Phú Quốc";
            case 1:
                return "TP Hồ Chí Minh ";
            case 2:
                return "Nha Trang";
            default:
                return "Phú Quốc";
        }
    }
}
