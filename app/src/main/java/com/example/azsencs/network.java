package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class network extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        ImageView imageView4=findViewById(R.id.image4);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        final TextView websites=findViewById(R.id.websitename);
        TextView textView=findViewById(R.id.rm);
        TextView textView1=findViewById(R.id.intro);
        TextView textView2=findViewById(R.id.rf);
        textView.setText("ماذا ستتعلم في تراك الشبكات؟\n" +
                "سنبدأ من الصفر في تعلم البرمجة؛ لأن أول بند في المجال هو معرفة كيفية التحدث مع الكمبيوتر بلغته التي يفهمها، ولكي تدافع عن الشبكة الخاصة بك؛ يجب أن تكون متقنًا لتلك اللغات الأساسية كالجافا والبايثون ولغات الويب والأندرويد.\n" +
                "ثم ننطلق مع ثاني بند في المجال:\n" +
                "وكما علمنا أن بداية الاختراق حدثت عن طريق Wi-Fi  فلا بد من دراسة الشبكات لفهم سير الشبكة نفسها والجدار الناري (Fire wall) الخاص بها، ومعرفة كيفية تأمينها لأنها نقطة البداية لأي مخترق. الأمر لا يقتصر فقط علي ما ذكر بل سنتعلم كيفية تأمين المواقع التي يمكن أن تُخترق وكيفية إيجاد الثغرات للمواقع وتأمينها.\n");
        textView2.setText("");
        textView1.setText("تراك ال Network هو عبارة عن الأمن القومي العام لأي مؤسسه علي الإنترنت \uD83E\uDDBE\n" +
                "تخيل كده معايا لثواني ...\n" +
                "حضرتك لسه شاحن باقة الراوتر والنت بدأ يشتغل كويس وفجأة النت بيخلص بسرعة\uD83E\uDD14\n" +
                "فتعتقد إن الموضوع بسيط ومع مرور الوقت تلاحظ وجود أمر تاني غريب ...\n" +
                "الجهازك بدأ يهنج، ويدي أوامر بدون تدخل منك، وتلاحظ أشياء لا علم لك بها اشترتها عن طريق البنك \uD83E\uDD26\uD83C\uDFFC\u200D♂️\n" +
                "كل ما في الأمر وببساطة شديدة حضرتك اتهكرت ! \uD83D\uDC4C\uD83C\uDFFB\n" +
                "وكما يظهر جانب الإختراق يقابله جانب الأمن والحماية جانب حماية يقدر يحمي الناس ومن هنا كانت انطلاقة ال security engineers أو مهندسي أمن المعلومات \uD83D\uDE01✌\uD83C\uDFFB\n");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("CISCO Networks, CCNA Routing &Switching ");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("Ahmed Abdallah");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                websites.setText("Network and system adminstration");
            }
        });
    }
}
