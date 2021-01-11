package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class machinelearning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machinelearning);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        ImageView imageView4=findViewById(R.id.image4);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        final TextView websites=findViewById(R.id.websitename);
        TextView textView=findViewById(R.id.rm);
        TextView textView1=findViewById(R.id.intro);
        TextView textView2=findViewById(R.id.rf);
        textView.setText("الأهمية:\n" +
                "▪ ضخامة حجم البيانات وتنوعها، وزيادة قوة الحوسبة ومعالجة البيانات وزيادة القدرةالتخزينية للبيانات.\n" +
                "هذه العوامل تهدف أتوماتيكياً لتحليل بيانات أكبر حجمًا وأكثر تعقيداً وتوصل نتائج أسرع وأكثردقة مما يعمل على إنتاج تنبؤات ذات قيمة عالية ترشد إلي قرارات جعل تعلم الآلة محوراهتمام هام جداً حديثاً.\n" +
                " ▪ تعلم الآلة، يستطيع إنتاج آلاف النماذج في الأسبوع الواحد.\n" +
                "▪ تعلم الآلة، يستطيع التنبؤ بالسلوك والتعرف علي الأنماط بكفاءة أعلى من البشر.. لنأخذ فيالاعتبار الموقع الشهير آمازون، الذي يستخدم تعلم الآلة في التنبؤ بما يريده العملاء ويقدمه لهم، مما يساعده عليى توليد أرباح طائلةI  من وراء هذا الأمر.\n" +
                "أمثلة تعلم الآلة:\n" +
                "▪ الفيسبوك، يستخدم تقنيات تعلم الآلة في ميزة التعرف على الوجوه (Face Recognition)،في الصور.\n" +
                "▪ سيارة جوجل، ذاتية القيادة.\n");
        textView2.setText("أنواع المشكلات والمهام لتعلم الآلة:\n" +
                "▪ التعلم المراقب Supervised learning: هو إعطاء أمثلة المدخلات input والمخرجاتoutput المرغوبة للآلة من قبل المعلم. الهدف، هو ربط المدخلات بالمخرجات.\n" +
                "▪ التعلم غير المراقب Unsupervised learning: هو ترك خوارزمية التعلم للاعتماد علىنفسها في استكشاف هيكل مدخلاتها. الهدف، هو اكتشاف الأنماط الخفية في البيانات.\n" +
                "▪ التعلم التعزيزي أو التقوية Reinforcement learning: هو تفاعل البرنامج مع بيئةديناميكية. الهدف، هو تحقيق غاية معينة دون معلم ينبئه حتى باقترابه من غايته تلك.\n");
        textView1.setText("تعلم الآلة machine learning)) .. \n" +
                "هو أحد فروع الذكاء الاصطناعي Artificial Intelligence (AI) التي توفر القدرة على التعلم لأجهزة الحاسوب. تهتم بتصميم وتطويرالخوارزميات والتقنيات التي تسمح للحاسوب بامتلاك خاصية “التعلم”. هناك مستويين من التعلم: الاستقرائي والاستنتاجي. يقوم التعلم الاستقرائي باستنتاج قواعد وأحكام عامة من البيانات الضخمة. \n" +
                "يتداخل “علم الآلة” مع علم إحصاء الحوسبة Computational Statistics. ويهتم بصنع التنبؤات من خلال استخدام الحاسب ضمن نطاقٍ مقبولٍ، كما يرتبط علم التحسين الرياضي Mathematical Optimization، الذي يركز على اختيار البديل الأفضل من بين العديد من البدائل المتاحة، كما يوفر الكثير من الوسائل والنظريات والتطبيقات لتعلم الآلة.\n" +
                "هناك العديد من الناس على علمٍ بالتعلم الآلي من التسوق عبر شبكة الإنترنت، إذ تُعرَض عليهم إعلانات مُتعلّقة بمشترياتهم، ويحدث ذلك لأن مُحرّكات التوصية تستخدم التعلم الآلي لتخصيص الإعلانات المُعرَضة عبر الإنترنت بشكلٍ لحظيّ تقريبًا.\n");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("Machine learning for begginers");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("هشام عاصم ,حسام الحوراني");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                websites.setText("Made with ML");
            }
        });

    }
}
