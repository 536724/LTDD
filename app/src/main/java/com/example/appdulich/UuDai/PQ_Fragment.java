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


public class PQ_Fragment extends Fragment {
        private RecyclerView recyclerView;
        private OffersAdapter offersAdapter;
        private List<Offer> offerList;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_pq, container, false);

            recyclerView = view.findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            offerList = new ArrayList<>();
            offerList.add(new Offer("Vé Show Kiss of the Sea", "492,000", R.drawable.kiss_of_the_sea));
            offerList.add(new Offer("Vé VinWonders Phú Quốc", "710,000", R.drawable.vinwonders_pq));
            offerList.add(new Offer("Vé Vinpearl Safari Phú Quốc", "600,000", R.drawable.safari));
            offerList.add(new Offer("Vé Sun World Hòn Thơm", "640,000", R.drawable.hon_thom));

            offersAdapter = new OffersAdapter(getContext(), offerList);
            recyclerView.setAdapter(offersAdapter);

            return view;
        }

}