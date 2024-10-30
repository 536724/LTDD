package com.example.appdulich.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.appdulich.Activity.EntertainmentActivity;
import com.example.appdulich.Activity.HotelActivity;
import com.example.appdulich.Activity.MoveActivity;
import com.example.appdulich.Activity.SearchActivity;
import com.example.appdulich.Adapter.CityAdapter;
import com.example.appdulich.Adapter.TicketAdapter;
import com.example.appdulich.Model.City;
import com.example.appdulich.Model.Ticket;
import com.example.appdulich.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    ArrayList<City> list;
    ArrayList<Ticket> ticketArrayList;
    RecyclerView rvTicket;
    RecyclerView rvCity;
    LinearLayout khuvc, ksan, tk, dichuyen;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        rvCity = v.findViewById(R.id.rcv_city);
        rvTicket = v.findViewById(R.id.rcv_list_ticket);
        initDataRvCity();
        initDataRvTicket();
        CityAdapter cityAdapter = new CityAdapter(list);
        TicketAdapter ticketAdapter = new TicketAdapter(ticketArrayList, getActivity());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        GridLayoutManager gridManager = new GridLayoutManager(getActivity(), 2);
        rvTicket.setLayoutManager(gridManager);
        rvTicket.setAdapter(ticketAdapter);
        rvCity.setLayoutManager(linearLayoutManager);
        rvCity.setAdapter(cityAdapter);

        khuvc = v.findViewById(R.id.linearLayout2);

        khuvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EntertainmentActivity.class);
                startActivity(intent);
            }
        });

        ksan = v.findViewById(R.id.linearLayout3);
        ksan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HotelActivity.class);
                startActivity(intent);
            }
        });

        tk = v.findViewById(R.id.linearLayout);
        tk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
            }
        });

        dichuyen = v.findViewById(R.id.linearLayout4);
        dichuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MoveActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }

    public void initDataRvCity(){
        list = new ArrayList<>();
        City city1 = new City(R.drawable.notifications, "Ha Noi"); list.add(city1);
        City city2 = new City(R.drawable.notifications, "Hoo Chi Minh"); list.add(city2);
        City city3 = new City(R.drawable.notifications, "Da Nang"); list.add(city3);
        City city4 = new City(R.drawable.notifications, "Da Lat"); list.add(city4);
    }

    public void initDataRvTicket(){
        ticketArrayList = new ArrayList<>();
        Ticket ticket1 = new Ticket(R.drawable.img_chitiet_xebuyt, "Vé cáp treo Bà Nà\n Hill_ Đà ...",4.7, 10000, 800);ticketArrayList.add(ticket1);
        Ticket ticket2 = new Ticket(R.drawable.img_chitiet_xebuyt, "Vé Dà Nẵng\nDowntown.....",4.7, 870, 564);ticketArrayList.add(ticket2);
        Ticket ticket3 = new Ticket(R.drawable.img_chitiet_xebuyt, "Vé xe lửa Hà\nNội - Lào Cai",4.7, 126, 309);ticketArrayList.add(ticket3);
        Ticket ticket4 = new Ticket(R.drawable.img_chitiet_xebuyt, "Vé À Ố Show Ở\nNhà Hát Thàn...",4.7, 368, 599);ticketArrayList.add(ticket4);
        Ticket ticket5 = new Ticket(R.drawable.img_chitiet_xebuyt, "Vé cáp treo Bà Nà\n Hill_ Đà ...",4.7, 1287, 760);ticketArrayList.add(ticket5);
        Ticket ticket6 = new Ticket(R.drawable.img_chitiet_xebuyt, "Vé cáp treo Bà Nà\n Hill_ Đà ...",4.7, 1923, 900);ticketArrayList.add(ticket6);
    }
}