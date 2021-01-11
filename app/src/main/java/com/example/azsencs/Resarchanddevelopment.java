package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Resarchanddevelopment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resarchanddevelopment);
        ImageView imageView1=findViewById(R.id.image1);
        final TextView book=findViewById(R.id.bokname);
        TextView textView=findViewById(R.id.intro);
        TextView textView1=findViewById(R.id.textskills);
        textView.setText("الرؤية:\n" +
                "الرقي بالفريق إداريا وتنظيميا وأخلاقيا وعلميا وعمليا. \n" +
                "الرسالة:\n" +
                "١- تميز الفريق على ساحة جامعة الأزهر وذلك عن طريق:\n" +
                "- البحث عن الثغرات الإدارية بالفريق وتقديم الدراسات الكاملة لتجنبها وإصلاحها.\n" +
                "- إحصاء معدل التقييم العام للفريق ومتابعة تطور كل جانب من جوانبه. \n" +
                "- استخدام الأساليب الحديثة في الإحصاء، والتقييم بما يعطي مدىً يقارب الواقع أو يماثله.\n" +
                "- رفع كفاءة المحتوى العلمي والأداء العملي في كافة اللجان وتطويره.\n" +
                "- مراقبة سلوك أعضاء الفريق واقتراح آليات التواصل، الإدارة، التنظيم المناسبة لحفظ المناخ العام للفريق.\n" +
                "٢- تقديم نموذج راقي لكلية الهندسة جامعة الأزهر على صعيد جمهورية مصر وذلك عن طريق:\n" +
                "- تميز الفريق على ساحة جامعة الأزهر\n");
        textView1.setText("- شخص بيميل للتحليل، وبيخرج بأفكار عظيمة لحل المشكلات أو العقبات. \n" +
                "- عندك رؤية استراتيجية لتطوير المؤسسات، أو عندك القدرة على تخطيطها. \n" +
                "- تمتلك شغف كبير، وإرادة فولاذية للتعلم والتطوير، وصبر عظيم للبحث مرارا وتكرارا ثم التقييم ثم التعلُّم. \n" +
                "- لبق في الحديث واجتماعي ولديك مهارات تواصل وعرض مميزة وتأثير عميق. \n" +
                "- شخصية قيادية وإيجابية ذات تأثير.\n");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText(" الموهبة وحدها لا تكفي\n" +
                        " العادات السبع للناس الأكثر فاعلية\n" +
                        " التواصل الفعال لإبراهيم الفقي\n");
            }
        });

    }
}
