package com.example.myfpoly_coder_ngheo.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfpoly_coder_ngheo.MainActivity;
import com.example.myfpoly_coder_ngheo.R;
//import com.example.myfpoly_coder_ngheo.adapters.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;


public class HomeFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    TabLayout tabLichhoc, tabMode;
    ViewPager Viewtab;

    public HomeFragment() {

    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tabMode = view.findViewById(R.id.tabMode);
        tabLichhoc = view.findViewById(R.id.tabLichhoc);

        tabLichhoc.addTab(tabLichhoc.newTab().setText("Lịch học"));
        tabLichhoc.addTab(tabLichhoc.newTab().setText("Lịch thi"));
        tabLichhoc.setTabGravity(TabLayout.GRAVITY_FILL);

//        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager(), 2, (MainActivity) getActivity());
//        //tabLichthi.setAdapter(adapter);

        Viewtab.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLichhoc));
        tabLichhoc.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Viewtab.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    tabLichhoc.setSelectedTabIndicator(R.drawable.underdog);
                } else {
                    tabLichhoc.setSelectedTabIndicator(R.drawable.underdog);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}