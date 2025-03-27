package com.example.krushikadam.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.krushikadam.databinding.FragmentHomeBinding;
import com.example.krushikadam.lst;
import com.example.krushikadam.tmp;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FloatingActionButton fb;
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Intent it=new Intent(getContext(), tmp.class);
        Intent im=new Intent(getContext(), lst.class);
        CardView c1,c2,c3,c4,c5,c6;

        TextView gh,bj,mka,jr;
        String b,m,j;
        c1=binding.c1;
        c4=binding.c4;
        c5=binding.c5;
        c6=binding.c6;
        bj=binding.bjt;
        mka=binding.mkt;
        jr=binding.jht;

        b= String.valueOf(bj.getText());
        j=String.valueOf(jr.getText());


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f=1;
                it.putExtra("flag",f);
                startActivity(it);
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f=2;
                it.putExtra("flag",f);
                it.putExtra("bjr",b);
                startActivity(it);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f=3;
                it.putExtra("flag",f);
                it.putExtra("jr",j);
                startActivity(it);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f=4;
                it.putExtra("flag",f);
                startActivity(it);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}