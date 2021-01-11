package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        ImageView imageView4=findViewById(R.id.image4);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        final TextView websites=findViewById(R.id.websitename);
        TextView textView=findViewById(R.id.intro);
        TextView textView1=findViewById(R.id.textskills);
        textView.setText("وهي اللجنه المسئوله عن إيصال رسالة وهدف الفريق إلى الشركات، ورواد الأعمال الداعمين للأنشطة التطوعية، والمهتمين بالمجالات الهندسية وتحسين علاقات الفريق داخليا وخارجيا. ");
        textView1.setText("• اسلوب الاقناع والتفاوض عندك يبقي عالي \n" +
                "• بتعرف تتعامل مع المشاكل بصبر وذكاء وتلاقي لها حل ف وقت قصير \n" +
                "• تكون شخص اجتماعي لبق ف الكلام..مش بتتكسف\n" +
                "• يكون عندك مرونه ف التعامل (flexible) تعرف طريقه العرض والاقناع اللي تناسب كل شخصيه \n" +
                "•   حب الاستطلاع والموضوعية والاصرار \n" +
                "•  الخيال والابداع والشجاعه والتنظيم \n");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("العلاقات العامة و استراتيجيات الاتصال-مقدمة في العلاقات العامة");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("Marwa Elbadawy, Safwa of law, Media Maven");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                websites.setText("Cutt.us ,مهارات من google");
            }
        });
    }
}
