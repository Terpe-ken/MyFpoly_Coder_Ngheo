package com.example.myfpoly_coder_ngheo.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myfpoly_coder_ngheo.R;

import org.w3c.dom.Text;


public class LichthiFragment extends Fragment {
    TextView txtText1;


    public LichthiFragment() {

    }


    public static LichthiFragment newInstance() {
        LichthiFragment fragment = new LichthiFragment();

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtText1 = view.findViewById(R.id.txtText1);
        txtText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txtText1.getText().toString();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

            }
        });

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}