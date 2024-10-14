package com.example.appdulich.UuDai;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdulich.R;

import java.util.ArrayList;
import java.util.List;


public class HCM_Fragment extends Fragment {

    private RecyclerView recyclerView;
    private OffersAdapter offersAdapter;
    private List<Offer> offerList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hcm, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        offerList = new ArrayList<>();
        offerList.add(new Offer("Vé À Ố Show Ở Nhà Hát thành phố", "từ đ 800,000", R.drawable.aoshow));
        offerList.add(new Offer("Đài Quan Sát Landmark 81", "từ đ 420,000", R.drawable.landmark));
        offerList.add(new Offer("Buffet Hải Sản La VeLa", "từ đ 600,000", R.drawable.hai_san));
        offerList.add(new Offer("Vé Công Viên Suối Tiên", "từ đ 150,000", R.drawable.suoitien));

        offersAdapter = new OffersAdapter(getContext(), offerList);
        recyclerView.setAdapter(offersAdapter);

        return view;
    }
}