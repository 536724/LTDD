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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NT_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NT_Fragment extends Fragment {

    private RecyclerView recyclerView;
    private OffersAdapter offersAdapter;
    private List<Offer> offerList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nt, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        offerList = new ArrayList<>();
        offerList.add(new Offer("Vé VinWonders Nha Trang", "từ đ 660,000", R.drawable.vinwonder_nhatrang));
        offerList.add(new Offer("Nha Trang Floating Bar Boat Party Trip", "562,500", R.drawable.boattrip));
        offerList.add(new Offer("Cáp Treo Vinpearl Harbour", "từ đ 100,000", R.drawable.captreo_nhatrang));
        offerList.add(new Offer("Gói Tắm Bùn | Resort Nha Trang", "từ đ 170,000", R.drawable.goitambun));

        offersAdapter = new OffersAdapter(getContext(), offerList);
        recyclerView.setAdapter(offersAdapter);

        return view;
    }
}