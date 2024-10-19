package com.example.appdulich.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appdulich.Adapter.SearchAdapter;
import com.example.appdulich.Model.Search;
import com.example.appdulich.R;

import java.util.ArrayList;

public class TopSearchFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Search> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_top_search, container, false);
        initData();
        recyclerView = v.findViewById(R.id.rcv_all);
        SearchAdapter searchAdapter = new SearchAdapter(list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(searchAdapter);


        return v;
    }

    private void initData() {
        list = new ArrayList<>();
        Search search1 = new Search(R.drawable.img_top1, "Vé À Ố Show Ở Nhà Hát Thành Phố", "Đà Nẵng", 389895); list.add(search1);
        Search search2 = new Search(R.drawable.img_top2, "Vé VinWonders Nha Trang", "Nha Trang", 932500);list.add(search2);
        Search search3 = new Search(R.drawable.img_top3, "Nha Trang Floating Bar Boat \n" + "Party Trip", "Nha Trang", 562500);list.add(search3);
        Search search4 = new Search(R.drawable.img_top4, "Cáp Treo Vinpearl Harbour", "Đà Nẵng", 100000);list.add(search4);
        Search search5 = new Search(R.drawable.img_top5, "Gói Tắm Bùn | Resort NT", "Nha Trang", 170000);list.add(search5);
        Search search6 = new Search(R.drawable.img_top6, "Đài Quan Sát Landmark 81", "Hồ Chí Minh", 924629);list.add(search6);
        Search search7 = new Search(R.drawable.img_top7, "Vé xe Nha Trang-Đà Lạt và ngược\n" + "lại ", "Nha Trang", 263000);list.add(search7);
        Search search8 = new Search(R.drawable.img_top8, "Buffet Hải Sản La VeLa", "Đà Nẵng", 351540);list.add(search8);
        Search search9 = new Search(R.drawable.img_top9, "Vé Công Viên suối Tiên", "Đà Nẵng", 150000);list.add(search9);
        Log.v("size", list.size()+"");
    }
}