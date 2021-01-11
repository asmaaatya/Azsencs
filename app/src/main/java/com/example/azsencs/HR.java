package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hr);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        ImageView imageView4=findViewById(R.id.image4);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        final TextView websites=findViewById(R.id.websitename);
        TextView textView=findViewById(R.id.intro);
        TextView textView1=findViewById(R.id.textskills);
        textView.setText("\n" +
                "لجنة الموارد البشرية (Human Resources):-\n" +
                "مهام اللجنة الإشراف، والتقييم، والمتابعة بدقة لجميع أفراد الجان، فض المنازعات وإجتناب وقوعها،الإرتقاء بنفسية الأفراد وتحفيزهم والأخذ بيد المقصرين، والإشراف على إعداد أفراد على قدر عالي من التأهيل، والإلتزام، والمسؤلية.\n");
        textView1.setText(" مهارات التواصل الفعال\n" +
                " مهارات اتخاذ القرارات\n" +
                " مهارات النقد\n" +
                " مهارات التفاوض والإقناع\n" +
                " مهارات التفكير الإيجابي\n" +
                "(Word-Excel-Power point)مهارة استخدام برامج مايكروسوفت الأساسية \n");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("Human Resources Managment, HR from the outside in,اداره الموارد البشريه");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("Hassan Youssef, Mahmoud Mokhtar, Ahmed Gamal");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                websites.setText("Arab HRM, HR leaders, School for HR,Build Up your HR Career, HCC-Egypt ");
            }
        });

    }
}
