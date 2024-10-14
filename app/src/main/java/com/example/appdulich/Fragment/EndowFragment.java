package com.example.appdulich.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appdulich.R;
import com.example.appdulich.UuDai.UuDaiViewPagerAdapter;
import com.example.appdulich.widget.CustomViewPager;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EndowFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EndowFragment extends Fragment {
    private TabLayout tabLayout;
    private CustomViewPager viewPager;
    private  View mView;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EndowFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EndowFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EndowFragment newInstance(String param1, String param2) {
        EndowFragment fragment = new EndowFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_endow, container, false);
        tabLayout = mView.findViewById(R.id.tad_layout);
        viewPager = mView.findViewById(R.id.contraint_uudai);
        UuDaiViewPagerAdapter adapter = new UuDaiViewPagerAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        viewPager.setPagingEnabled(false);

        tabLayout.setupWithViewPager(viewPager);

        return  mView;
    }
}