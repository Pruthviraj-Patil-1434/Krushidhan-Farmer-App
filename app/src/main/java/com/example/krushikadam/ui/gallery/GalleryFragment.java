package com.example.krushikadam.ui.gallery;

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

import com.example.krushikadam.databinding.FragmentGalleryBinding;
import com.example.krushikadam.lst;

public class GalleryFragment extends Fragment {
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Intent it=new Intent(getContext(), lst.class);
        CardView c1,c4;

        String t,s,o;
        c1=binding.ol;
        c4=binding.tb;


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f=1;
                it.putExtra("flag",f);
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