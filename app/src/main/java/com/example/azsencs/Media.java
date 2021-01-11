package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Media extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        ImageView imageView4=findViewById(R.id.image4);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        final TextView websites=findViewById(R.id.websitename);
        TextView textView=findViewById(R.id.intro);
        TextView textView1=findViewById(R.id.textskills);
        textView.setText("تحسين وتطوير المظهر العام للفريق على صفحات التواصل الإجتماعي وتطوير عوامل الجذب المرئية.");
        textView1.setText(" -اهم شئ يكون عندك  شغف\n" +
                " - صبور\n" +
                " - ليك النظرة الفنية في اختيار الألوان وتناسقها \n" +
                "- بتتقبل النقض\n" +
                "- بتقدر تتكيف على ضغط الشغل \n" +
                "- بتعرف تنظم وقتك \n" +
                "- بتستفاد من كل اللي بتتعلمه وتوظفه مع بعض بحيث تطلع شغل عظيم في النهاية \n");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("كتاب سلسلة تعليم الجرافيك ,كتاب شرح برنامج أدوبي اليستريتور بالصور,كتاب نظرية الألوان  ");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("نور ديزاين, عمرو عطا الله,محمد الخيال,مصطفي مكرم");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                websites.setText("colorhunt,flaticon,freepik,coloradope");
            }
        });
    }
}
