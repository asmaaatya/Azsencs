package com.example.azsencs;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Android extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        ImageView imageView4=findViewById(R.id.image4);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        final TextView websites=findViewById(R.id.websitename);
        TextView textView=findViewById(R.id.rm);
        TextView textView1=findViewById(R.id.intro);
        TextView textView2=findViewById(R.id.rf);
        textView.setText("طبيعه الشغل :\n" +
                "-تصميم وبرمجة تطبيقات الاندرويد دلوقتى بقا رقم 1 فى الشغل الحر الـ Freelancing \uD83E\uDD1D\uD83D\uDE0E... وكمان يعتبر الاندرويد فى حد ذاته بداية قوية لمشروعك الخاص كا Start up ليك \uD83E\uDD20.... .سواء كمشروع خدمى زي كريم و اوبر \uD83D\uDE98.. او كمشروع اعلانى زى كل التطبيقات اللى بتنزل على موبيلك وعليها اعلانات\uD83D\uDDA5️. \n" +
                "\n" +
                "-طبيعه العمل كاندرويد ديڤلوبر انت تعمل الابلكيشن اللي عاوزه وممكن تبيعه لأي مكان يعني زي انك تنزله على جوجل بلاي وأي حد يستخدم الابليكشن يكون ليك عائد مادي منه زي أوبر وكريم كدا \uD83E\uDD11،او تشتغل ف شركه وتاخذ مرتب حلو الاندرويد مطلوب اوي حاليا  كفري لانسر ..\n");
        textView2.setText("\n" +
                "شغل الاندرويد بينقسم لشقين:\n" +
                "1-شق XML وده الديزاين والاشكال والالوان والمقاسات وكل حاجة بتظهر على الشاشة بتاعتك.\n" +
                " 2-شق برمجة بلغة ال JAVA غالباً وده لكل شغل البرمجة والحرات وتنفيذ اى عمليات.\n");
        textView1.setText("-الأندرويد ( Android) هو نظام تشغيل مجاني ومفتوح المصدر مبني على نواة لينكس  اتصمم أساسًا للأجهزة ذات شاشات اللمس كالهواتف الذكية والحواسيب اللوحية\uD83D\uDCF1\uD83D\uDE00                         \n" +
                "\n" +
                "-الاندرويد ده هو اللي بيعلمنا ازاي نعمل أي application زي Facebook & Watts app واي تطبيق تلاقيه على Google play.. يعني هو الزتونه بتاعت الموبيل من الاخر ، ايوه ماهو الموبايل ايه غير شوية ابلكيشنز\uD83D\uDE0A\uD83D\uDE01.....ومن أول سنه2008  اللي هي أول سنه نزل فيها نظام تشغيل الاندرويد ل 2020 عمالين يعملو إصدارات كل واحد أحلي من اللي قبله لحد ما وصلو لحلاوة الأوريو اللي أنت ماسكه دلوقتي لو موبيلك أندرويد \uD83D\uDE0E\uD83D\uDE00\n");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("head first android ");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("Android coding, codingwithmitch,firebase,جعفر الاغا");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                websites.setText("android developers,androdyaraby");
            }
        });
    }
}
