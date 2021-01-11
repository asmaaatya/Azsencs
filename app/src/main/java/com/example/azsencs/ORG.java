package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ORG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        ImageView imageView4=findViewById(R.id.image4);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        TextView textView=findViewById(R.id.intro);
        TextView textView1=findViewById(R.id.textskills);
        textView.setText("واجهة الفريق✌️\n" +
                "ﻣﺴﺆﻟﻴة لجنة التنظيم:\n" +
                "1- ﺍﻟﺘﻨﻈﻴﻢ :\n" +
                "- ﺗﻨﻈﻴﻢ ﺍﻟﻘﺎﻋﺎﺕ ﺩﺍﺧﻠﻴﺎ ﻭ ﺧﺎﺭﺟﻴﺎ ، ﻭ ﺍﺳﺘﻘﺒﺎﻝ ﺍﻟـ audience ﻭ ﺍﺭﺷﺎﺩﻫﻢ.\n" +
                "- ﺗﻮﻓﻴﺮ ﺍﻟﻘﺎﻋﺎﺕ ﺍﻟﻤﻄﻠﻮﺑﺔ ﻟﻠـ Workshops ﻭﺍﻟـ Events.\n" +
                "\n" +
                "2- ﺍﻟﻠﻮﺟﺴﺘﻚ :\n" +
                "- ﺗﻮﻓﻴﺮ ﻭ ﺍﻣﺪﺍﺩ ﺍﻟﻔﺮﻳﻖ ﺑﻜﻞ ﺍﺣﺘﻴﺎﺟﺎﺗﻪ ﻣﻦ ﺃﺩﻭﺍﺕ ﺧﺎﺻﻪ ﺑﺎﻟـ Events ﻭ ﺍﻟـ Workshops\n" +
                "- ﺗﻮﻓﻴﺮ ﺍﺣﺘﻴﺎﺟﺎﺕ ﺍﻟﻄﺒﺎﻋﺔ ﻣﻦ ﻃﺒﺎﻋﺔ ﺍﻟﺒﺎﻧﺮﺍﺕ ﻭﺍﻟﺒﻮﺳﺘﺮﺍﺕ ﻭﺫﻟﻚ ﺑﺎﻟﺘﻨﺴﻴﻖ ﻣﻊ ﻟﺠﻨﺔ ﺍﻟﻤﻴﺪﻳﺎ.\n" +
                "- ﺷﺮﺍﺀ ﺍﻟﻠﺰﻡ ﻟﻠﻔﺮﻳﻖ ﻣﻦ ﺗٌﻲ ﺷٌﺮﺗﺎﺕ ﻭﻣﻮﺍﺩ ﺧﺎﻡ ﻭﻛﺮﻭﺕ ﺗﻌﺮﻳﻒ ﻭﻏٌﻴﺮﻩ ﻣﻦ ﺍﺣﺘﻴﺎﺟﺎﺕ ﻟﻠﻔﺮﻳﻖ.\u2066\n" +
                "\n" +
                "3 - ﺍﻻﺭﺷﻴﻒ :\n" +
                "-ﺗﺠﻤﻴﻊ ﺳﺠﻼﺕ ﺍﻟﻤﺸﺎﺭﻛﻴﻦ ﻓﻰ ﺍﻟـ Events ﻭﺍﻟـ Workshops\n");
        textView1.setText("1-منظم وبيحترم الوقت جداً.\n" +
                "\n" +
                "2-التفكير الابداعى \n" +
                "لانه هيطلب منه gifts صغيرة للمشاركين ف الايفنت.\n" +
                "\n" +
                "3-العمل كلاعب فريق\n" +
                "ودا مش معناه انك تكون متعاون بس ولكن مطلوب اظهار مهارات قيادية قوية عند الضرورة.\n" +
                "\n" +
                "4-المرونة\n" +
                "ودا عامل مهم جداً للتكيف مع اى موقف وتكون شخص يعتمد عليه.\n" +
                "\n" +
                "5-التواصل الفعال\n" +
                "مهارة مهمة جداً زى (التعبير عن الذات بشكل كويس،واستخدام لغة الجسد المناسبة..) .\n" +
                "\n" +
                "6-حل المشاكل\n" +
                "عند ظهور مشاكل غير متوقعه..\n" +
                "7-تقبل الملاحظات والتعليقات\n" +
                "مش بس قبول التعليقات بلباقة ولكن تطبيق التعليقات والاهتمام بها واخذها ف الاعتبار.\n" +
                "\n" +
                "8-الثقة هى المفتااح\n" +
                "مهم تكون واثق ف نفسك عشان يقتنع كل الزملاء بكل حاجه بتقولها وبتعملها.\n");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("بروتوكول تنظيم الفعاليات والمؤتمرات والمعارض.ل(منى زايد),فن الاوريجامى");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("1-Being artistic\n" +
                        "2-Basteln\n" +
                        "3-paper crafts1101-orgami tutorials\n");
            }
        });


    }
}
