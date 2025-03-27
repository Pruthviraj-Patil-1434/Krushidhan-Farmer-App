package com.example.krushikadam;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class gov extends AppCompatActivity {

    private int flag;
    private ImageView imageView;
    private TextView titleTextView, spdTextView, tpd1TextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gov);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green)));

        Intent intent = getIntent();
        flag = intent.getIntExtra("flag", 0);

        imageView = findViewById(R.id.igm);
        titleTextView = findViewById(R.id.ttl);
        spdTextView = findViewById(R.id.spd);
        tpd1TextView = findViewById(R.id.tpd1);
        button = findViewById(R.id.lk);

        switch (flag) {
            case 1:
                configureView("कृषी पंप जोडणी करीता योजना (उच्चदाब वितरण प्रणाली व कृषी धोरण २०२०)",
                        "१) प्राप्त अर्ज\n२) ७/१२ उतारा\n३) आधार कार्ड\n४) मागासवर्गिय जाती / मागासवर्गिय ज मातीचे प्रमाणपत्र\n५) सामायिक शेती असल्यास इतर",
                        R.drawable.pump, "https://wardha.gov.in/%E0%A4%95%E0%A5%83%E0%A4%B7%E0%A5%80-%E0%A4%AA%E0%A4%82%E0%A4%AA-%E0%A4%9C%E0%A5%8B%E0%A4%A3%E0%A5%80-%E0%A4%95%E0%A4%B0%E0%A5%80%E0%A4%A4%E0%A4%BE-%E0%A4%AF%E0%A5%8B%E0%A4%9C%E0%A4%A8/");
                break;
            case 2:
                configureView("नमो शेतकरी महा सन्मान योजना",
                        "१) प्राप्त अर्ज\n२) ७/१२ उतारा\n३) आधार कार्ड\n४) मागासवर्गिय जाती / मागासवर्गिय ज मातीचे प्रमाणपत्र\n५) सामायिक शेती असल्यास इतर",
                        "संबंधित शासन संदर्भ, शासन निर्णय, इतर आ देश, परिपत्रक इ. (कोणत्या अधिनियमाचे / नियमाचे सदर कामकाज पूर्ण केले जाणार आ हे)",
                        R.drawable.nmo, "https://namoshetkariyojana.in/");
                break;
            case 3:
                configureView("विहीर योजना", "", R.drawable.well, "https://egs.mahaonline.gov.in/Site/VihirScheme");
                break;
            case 4:
                configureView("शेतमाल तारण योजना", "", R.drawable.tr, "https://www-msamb-com.translate.goog/schemes/pledgefinance?_x_tr_sl=en&_x_tr_tl=mr&_x_tr_hl=mr&_x_tr_pto=tc");
                break;
            case 5:
                configureView("सौर कृषि सिंचन योजना", "", R.drawable.sr, "https://www.mahadiscom.in/solar-mskvy/index_mr.php");
                break;
        }
    }

    private void configureView(String title, String spd, int imageResource, String url) {
        titleTextView.setText(title);
        spdTextView.setText(spd);
        imageView.setImageResource(imageResource);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }

    private void configureView(String title, String spd, String tpd1, int imageResource, String url) {
        titleTextView.setText(title);
        spdTextView.setText(spd);
        tpd1TextView.setText(tpd1);
        imageView.setImageResource(imageResource);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}