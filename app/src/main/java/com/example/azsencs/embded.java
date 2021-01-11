package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class embded extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embded);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        ImageView imageView4=findViewById(R.id.image4);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        final TextView websites=findViewById(R.id.websitename);
        TextView textView=findViewById(R.id.rm);
        TextView textView1=findViewById(R.id.intro);
        TextView textView2=findViewById(R.id.rf);
        textView.setText("بعض من المشاريع التي ستقدر على تنفيذها خلال برنامج التأهيل:\n" +
                "1-\tRadar System\n" +
                "1.\tRobotic Arm\n" +
                "2.\tRemote Controller Car\n" +
                "3.\tLine following Robot\n" +
                "4.\tSecurity System\n" +
                "5.\tSmart Home" );
        textView2.setText("المحتوى الخاص ببرنامج التأهيل لدينا ينقسم إلى جزئين: \n" +
                "1-Introduction to Embedded Systems with AVR Microcontroller.\n" +
                "2-Arduino.\n" +
                "في الجزء الأول نعرِّفُك عن المجال وكيف تبدأ فيه؟ وما هي احتياجاتك حتى تستطيع نقل الجانب النظري البحت، إلى واقع عملي مرئي. \n" +
                "كذلك بندرس برمجة بلغة الـC  لأنها عصب المجال، ثم بعد ذلك نبدأ في استخدام Microcontroller ونعرف الـ architecture الخاصة به، وننتقل تدريجيا.. بداية من كيفية إنارة LED، وصولا لعمل مشروع كامل.\n" +
                "-الجزء الثاني بنشرح الأردوينو وبنطبق بمشاريع عملي كتير نظرا لسهولة استخدامه.\n");
        textView1.setText("مجال الـ Embedded Systems من أقوى المجالات وأسرعها تطورًا في الفترة الأخيرة وممكن نقول أنه أساس الصناعات التكنولوجية في العالم.");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("Making embded system, Embded system Architecture");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("Infinity Tech, Youssef Elgareeb,كورس الاردوينو");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                websites.setText("indiabix");
            }
        });
    }
    }

