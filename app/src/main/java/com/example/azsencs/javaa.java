package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class javaa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javaa);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        ImageView imageView4=findViewById(R.id.image4);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        final TextView websites=findViewById(R.id.websitename);
        TextView textView=findViewById(R.id.rm);
        TextView textView1=findViewById(R.id.intro);
        TextView textView2=findViewById(R.id.rf);
        textView.setText("طبيعة عمل مبرمجين الجافا : \n" +
                "مبرمجين الجافا أكثر المبرمجين طلبا لسوق العمل بمصر و دول الخليج و دول أوروبا للأسباب التالية :\n" +
                "1. الجافا هى لغة البرمجة الأقوى على مستوى العالم..\n" +
                "2. هى أداه التطوير الأساسية لقواعد بيانات أوركل باستخدام ADF ..\n" +
                "3. تقدر تستفيد من تعلمك لغة الجافا فرصة العمل فى أكثر من مجال \n" +
                "4. برامج الجافا أكثر البرامج حماية\n" +
                "5. مبرمجين الجافا يمكنهم العمل في كبري الشركات مثل  oracle – IBM-HP,وغيرها من الشركات حاليا.\n" +
                "6. لغة الجافا تمكنك من العمل ليس فقط في الشركات البرمجية، بل أيضا في الشركات الصناعية والتجارية والبنوك فى مجال تطوير الأنظمة وقواعد البيانات.\n");
        textView2.setText(" تأتي أهمية لغة جافا:\n" +
                "1.\tكونها من بين اللغات البرمجية الأخرى المجانية ومفتوحة المصدر.\n" +
                "2.\tكما أنها لغة منتشرة بشكل واسع، فهناك العديد من الموارد والأكواد المتاحة عبر الإنترنت والتي يمكن أن تكون بمثابة الرفيق المثالي في عملية التعلم. \n" +
                "3.\tمن خلالها يتم تطوير المواقع بدءا بالواجهات الأمامية وكذلك الواجهات الخلفية، بالإضافة إلى أنه يتم توظيفها في تصميم تطبيقات الأندرويد وتطبيقات سطح المكتب .\n" +
                "\n" +
                "أنا شخص لازلت مبتدئا في موضوع لغات البرمجة فهل من المفترض أن أتعلم الجافا بشكل مبدأي، أم لغات أخرى؟\n" +
                " لغة جافا من اللغات سهلة التعلم للمبتدئين حديثا في تعلم لغات البرمجة\uD83E\uDD17 وتعتبر بمثابة الإنطلاقة المثالية لتعلم اللغات الأكثر تعقيدا كما أنها ممتعة وتفاعلية ومن السهل التوصل إلى الأخطاء وتتبعها وإمكانية إصلاحها بشكل سريع، فمن خلال واجهة المتصفح تستطيع الحصول على النتائج بشكل فوري \uD83E\uDD1D\n");
        textView1.setText("قصتها: هي لغة برمجة كائنية التوجه، ابتكرها جيمس غوسلينغ في عام 1992م -أثناء عمله في مختبرات شركة صن ميكروسيستمز- وذلك لاستخدامها بمثابة العقل المفكر المستخدم لتشغيل أجهزة التطبيقات الذكية مثل التليفزيون التفاعلي، وقد كانت لغة الجافا تطويرًا للغة سي ++ ، وعند ولادتها أطلق عليها مبتكرها \"أواك\" بمعنى شجرة السنديان؛ وهي الشجرة التي كان يراها من نافذة مكتبه وهو يعمل في مختبرات صن ميكروسيستمز، ثم تغير الاسم إلى جافا، وهذا الاسم (على غير العادة في تسمية لغات البرمجة) ليس الحروف الأولى من كلمات جملة معينة أو تعبيرًا بمعنى معين، ولكنه مجرد اسم وضعه مطورو هذه اللغة لينافس الأسماء الأخرى.");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("Java for Absolute Beginners, Java How to program-9th edition, Introduction to Java programming comprehensive version,Object-oriented Analysis,Design and implementation, Algorithm Unplugged ");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("Code Masry, Hassouna Academy, The new Baghdad,عبد الله عيد,جعفر الاغا");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                websites.setText("for learning: harmash, javapoint, W3school ,for problem solving:codeforces, codingbat, projecteuler " );
            }
        });
    }
}
