package com.example.krushikadam;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class lst extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green)));
        Intent it = getIntent();
        int flag = 0;
        ImageSlider img;
        img = findViewById(R.id.sld);
        TextView ttl, dt, prf, ifd, fd;

        ttl = findViewById(R.id.ttl);
        dt = findViewById(R.id.dt);
        prf = findViewById(R.id.prf);
        ifd = findViewById(R.id.ifd);
        fd = findViewById(R.id.fd);
        List<SlideModel> sld = new ArrayList<>();


        flag = it.getIntExtra("flag", 0);

        if (flag == 1) {
            sld.add(new SlideModel(R.drawable.d1));
            sld.add(new SlideModel(R.drawable.d2));
            sld.add(new SlideModel(R.drawable.d3));
        }

        if (flag == 4) {
            ttl.setText("तुषार-सिंचन ");
            dt.setText("तुषार सिंचन पद्धत म्हणजे काय\n");
            prf.setText("तुषार सिंचनाचे मुख्य फायदे :");
            ifd.setText("अल्युमिनीअम अगर पीव्हीसी पाईपला जोडलेल्या स्प्रिंकलर नोझलद्वारे पाण्याच्या दाबाचा वापर करून पाणी पावसाप्रमाणे पिकावर सर्व ठिकाणी सारखे फवारले जाते. त्यास तुषार सिंचन पद्धत असे म्हटले जाते. यात जास्तीत जास्त नोझल ठराविक वेगाने कायम वर्तुळाकाररीत्या फिरवण्याची सोय असते.");
            fd.setText("१. पाणी हे जमिनीला न देता पिकास दिले जाते.\n" +
                    "\n" +
                    "२. वाफसा स्थिती कायम राहत असल्याने पिकाची वाढ जोमदार आणि सतत होते.\n" +
                    "\n" +
                    "३. पिकाला रोजच अगर दिवसाआड अथवा गरजेनुसार पाणी दिले जाते.\n" +
                    "\n" +
                    "४. मुळाच्या कार्यक्षेत्रात पाणी, माती, हवा यांचा नेहमी समन्वय साधला जातो.\n");
            sld.add(new SlideModel(R.drawable.sp1));
            sld.add(new SlideModel(R.drawable.sp2));
            sld.add(new SlideModel(R.drawable.sp3));
        }
        img.setImageList(sld, true);
    }
}