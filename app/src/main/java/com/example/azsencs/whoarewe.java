package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class whoarewe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whoarewe);
        ScrollView scrollView=findViewById(R.id.scroll);
        TextView textView=findViewById(R.id.hist);
        ImageView img1,img2,img3,img4,img5;
        img1=findViewById(R.id.face);
        img2=findViewById(R.id.youtube);
        img3=findViewById(R.id.instgram);
        img4=findViewById(R.id.twiter);
        img5=findViewById(R.id.gmail);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
openfacebook(view);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
openyoutube(view);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
openinstgram(view); }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
opentwitter(view);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
opengmail(view);
            }
        });
textView.setText("We started in 2010 with a competition in\n" +
        "software and algorithms at AlA_zhar university, through out the years the participation in the competition has yeilded and our team\n" +
        "has participation in more than 100 projects at 10 different universities.\n" +
        "• 9 Opening (2010 – 2011 – 2012 -2013 – 2014 – 2015 – 2016 – 2017 – 2018).\n" +
        "• 70 Workshops in(Embedded system – Robotics – Android – Java – Network – Control – Web).\n" +
        "• 40 Seminars in ( Iot – Network – Security – Robotics – Cloud computing ).\n" +
        "• 8 Exhibitions ( 2011 – 2012 – 2013 – 2014 – 2015 – 2016 – 2017 – 2018 ).\n" +
        "• 530 Projects (Under graduate - Student).\n" +
        "8 Closing ( 2011 – 2012 – 2013 – 2014 – 2015 – 2016 – 2017 – 2018).\n" +
        "• 8 Summer school in (Embedded system – Robotics – Android – Java – Network – Web – Marketing – Soft skills – English – Arduino).\n");

    }
    public  void openfacebook(View view) {
        Intent intent1 = new Intent(Intent.ACTION_VIEW);
        intent1.setData(Uri.parse("https://www.facebook.com/AZSENCS"));
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }

    }
    public  void  openyoutube(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/c/nozomex"));
        if(intent.resolveActivity(getPackageManager()) !=null){
            startActivity(intent);
        }
    }
    public  void  openinstgram(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://instagram.com/az_sencs?igshid=1jlcjrpryset2"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
        public  void  opentwitter(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://twitter.com/Az_SENCS?s=09"));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
            public  void  opengmail(View view){
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://az.sencs10@gmail.com"));
                if(intent.resolveActivity(getPackageManager()) !=null){
                    startActivity(intent);
                }


    }
}
