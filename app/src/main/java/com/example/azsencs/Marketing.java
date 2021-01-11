package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Marketing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        TextView textView=findViewById(R.id.intro);
        TextView textView1=findViewById(R.id.textskills);
        textView.setText("الرؤية :\n" +
                "إيصال جميع فعاليات االفريق إلى أكبر عدد من عدد من الطلاب والمهتمين.\n" +
                "الرسالة :\n" +
                "تحقيق الغرض الأساسي من إنشاء الفريق وهو إفادة الطلاب بشكل عام وطلاب قسم هندسة النظم والحاسبات بشكل خاص من خلال توصيل كل ما يقدمه الفريق لهم بأي طريقة سواء أنلاين أو أفلاين.  \n");
        textView1.setText("\n" +
                "-القدره على الإبداع وخلق أفكار جديدة.\n" +
                "-القدره على الاقناع الشفهي واللباقه.\n" +
                "-ملكة الكتابة بالإضافة إلى اهتمامة بالقراءة \n" +
                "-على دراية بالتسويق عموماً.\n" +
                "-شغف تعلم المجال والتطوير\n" +
                "-الانضباط والالتزام وتحمل المسئولية.\n");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("التسويق للجميع.\n" +
                        "-فيليب كوتلر يتحدث عن التسويق.\n" +
                        "-بياع الدقيقة الواحدة.\n" +
                        "-كيف تبيع أي شئ لأي إنسان.\n  ");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("Mostafa Othman,Midiastaa,ايهاب مسلم,سهل مهدي,ثابت حجازي");
            }
        });


    }
}
