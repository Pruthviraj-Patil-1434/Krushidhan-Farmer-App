package com.example.krushikadam.ui.slideshow;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.krushikadam.R;
import com.example.krushikadam.databinding.FragmentSlideshowBinding;
import com.example.krushikadam.gov;
import com.example.krushikadam.my;

public class SlideshowFragment extends Fragment {

    public FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
            SlideshowViewModel slideshowViewModel =
                    new ViewModelProvider(this).get(SlideshowViewModel.class);

            binding = FragmentSlideshowBinding.inflate(inflater, container, false);
            View root = binding.getRoot();
        Intent it=new Intent(requireContext(), gov.class);
        int flag=0;
        ListView ls = binding.ls;

        String[] lar = {"कृषी पंप जोडणी करीता योजना (उच्चदाब वितरण प्रणाली व कृषी धोरण २०२०)" +
                "योजना", "नमो शेतकरी महा सन्मान योजना", "विहीर योजना", "शेतमाल तारण योजना", "सौर कृषि सिंचन योजना", "रसत्याद्वारे मालवाहतूक योजना", "फळे आणि धान्य अनुदान योजना"};
        ArrayAdapter adp = new ArrayAdapter<String>(requireContext(), R.layout.activity_my,R.id.ltxt, lar);
        ls.setAdapter(adp);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    it.putExtra("flag",1);
                    startActivity(it);
                }

                if(position==1)
                {
                    it.putExtra("flag",2);
                    startActivity(it);
                }

                if(position==2)
                {
                    it.putExtra("flag",3);
                    startActivity(it);
                }

                if(position==3)
                {
                    it.putExtra("flag",4);
                    startActivity(it);
                }

                if(position==4)
                {
                    it.putExtra("flag",5);
                    startActivity(it);
                }

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