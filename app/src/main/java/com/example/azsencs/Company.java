package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Company extends AppCompatActivity {
ImageView compimg;
ImageView comppage;
TextView textname;
TextView infotext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
        compimg=findViewById(R.id.compimg);
        comppage=findViewById(R.id.comppage);
        textname=findViewById(R.id.comptext);
        infotext=findViewById(R.id.compinfo);
        Intent intent=getIntent();
        String text=intent.getExtras().getString("text");
        int img=intent.getExtras().getInt("image");
        final String page=intent.getExtras().getString("page");
        textname.setText(text);
        compimg.setImageResource(img);
        comppage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse(page));
                if (intent1.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent1);
                }
            }
        });
}
}