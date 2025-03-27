package com.example.krushikadam;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class rb extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;


    public rb() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Intent it;
        CardView c1, c2, c3, c4;
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rb, container, false);
        it = new Intent(getContext(), tmp.class);

        c1 = view.findViewById(R.id.c1);
        c2 = view.findViewById(R.id.c2);
        c3 = view.findViewById(R.id.c3);
        c4 = view.findViewById(R.id.c4);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f = 5;
                it.putExtra("flag", f);
                startActivity(it);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f = 6;
                it.putExtra("flag", f);
                startActivity(it);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f = 7;
                it.putExtra("flag", f);
                startActivity(it);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f = 8;
                it.putExtra("flag", f);
                startActivity(it);
            }
        });
        // Similar onClickListener for c2, c3, c4...
        return view;
    }
}
