package com.example.appdulich.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdulich.Adapter.SearchAdapter;
import com.example.appdulich.Model.Search;
import com.example.appdulich.R;

import java.util.ArrayList;

public class TrendSearchFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Search> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_top_search, container, false);

        recyclerView = v.findViewById(R.id.rcv_all);
        initData();
        SearchAdapter searchAdapter = new SearchAdapter(list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(searchAdapter);


        return v;
    }

    private void initData() {
        list = new ArrayList<>();
        Search search1 = new Search(R.drawable.img_trend1, "Vé Biểu Diễn Nghệ Thuật Đường Phố", "Hà Nội", 600000); list.add(search1);
        Search search2 = new Search(R.drawable.img_trend2, "Vé Liên Hoan Phim Quốc Tế 2024", "Đà Nẵng", 450000);list.add(search2);
        Search search3 = new Search(R.drawable.img_trend3, "Vé Tour Văn Hóa Bản Địa", "Sapa", 250000);list.add(search3);
        Search search4 = new Search(R.drawable.img_trend4, "Vé Tour Phiêu Lưu Núi Bà Nà", "Đà Nẵng", 700000);list.add(search4);
        Search search5 = new Search(R.drawable.img_trend5, "Vé Workshop Nhiếp Ảnh Cảnh Quan", "Đà Lạt", 550000);list.add(search5);
        Search search6 = new Search(R.drawable.img_trend6, "Vé Show Thời Trang Mùa Hè 2024", "TP. Hồ Chí Minh", 1500000);list.add(search6);

    }
}
