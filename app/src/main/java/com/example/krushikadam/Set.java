package com.example.krushikadam;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Set extends AppCompatActivity {

    private TextView textContactInfo, textPhone, textEmail;
    private EditText editName, editMobile, editMessage;
    private Button sendButton;
    private ImageView imageView;

    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green)));

        // Initialize the views
        textContactInfo = findViewById(R.id.text_contact_info);
        textPhone = findViewById(R.id.text_phone);
        textEmail = findViewById(R.id.text_email);
        editName = findViewById(R.id.nm);
        editMobile = findViewById(R.id.mb);
        editMessage = findViewById(R.id.msg);
        sendButton = findViewById(R.id.snd);
        imageView = findViewById(R.id.imgv);

        // Set up the send button click listener
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });
    }

    private void sendEmail() {
        String name = editName.getText().toString();
        String mobile = editMobile.getText().toString();
        String message = editMessage.getText().toString();

        String subject = "New Contact from " + name;
        String body = "Name: " + name + "\nMobile Number : " + mobile + "\nMessage : " + message;

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("message/rfc822");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"pruthvirajpatil1434@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body);

        try {
            startActivity(Intent.createChooser(emailIntent, "Send email..."));
            flag = 1;
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Set.this, "No email client installed.", Toast.LENGTH_SHORT).show();
        }

        if (flag == 1) {
            Toast.makeText(Set.this, "Mail Client Selected Sucessfully", Toast.LENGTH_SHORT).show();
        }
    }
}
