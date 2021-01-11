package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class security extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        ImageView imageView4=findViewById(R.id.image4);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        final TextView websites=findViewById(R.id.websitename);
        TextView textView=findViewById(R.id.rm);
        TextView textView1=findViewById(R.id.intro);
        TextView textView2=findViewById(R.id.rf);
        textView.setText("\n" +
                "من خلال وجود حضرتك معانا لجنة أمن المعلومات (Security) بتبدأ في تعلم الآتي:\n" +
                "1.\tلغات البرمجة مثل: الجافا – البايثون – لغات الويب والأندوريد، فمعرفة لغة التحدث مع الأنظمة هام جدا حتى تستطيع تأمين معلوماتك، ومعرفة التهديدات الواقعة عليها.\n" +
                "2.\tدراسة جزء من مجال الشبكات (Network) ، حيث نتطرق إلى كيفية سير الشبكة نفسها، والفاير (جدار الحماية) الخاص بها، وكمعرفة كيفية تأمينها، لأنها تعتبر المفتاح الأول لأي هاكر لتتمكن من الدخول لمعلومات الضحية.\n" +
                "3.\tتطبيق المجالين السابقين في معرفة كيفية تأمين التطبيقات المعلوماتية، والحفاظ عليها، ومعرفة التهديدات الواقعة عليها، وسد الثغرات المتوقعة منه\n");
        textView2.setText("إن حماية المعلومات هو أمر قديم ولكن بدأ استخدامه بشكل فعلي منذ بدايات التطور التكنولوجيا ويرتكز أمن المعلومات إلى:\n" +
                "•\tأنظمة حماية نظم التشغيل\n" +
                "•\tأنظمة حماية البرامج والتطبيقات.\n" +
                "•\tأنظمة حماية قواعد البيانات.\n" +
                "•\tأنظمة حماية الولوج أو الدخول إلى الأنظمة.\n");
        textView1.setText("هوعلم مختص بتأمين المعلومات المتداولة عبر شبكة الانترنت من المخاطر التي تهددها. فمع تطور التكنولوجيا ووسائل تخزين المعلومات وتبادلها بطرق مختلفة أو ما يسمى نقل البيانات عبر الشبكة من موقع لاخر أصبح أمر أمن تلك البيانات والمعلومات يشكل هاجسًا وموضوعًا حيويًا مهمًا للغاية. \n" +
                "يمكن تعريف أمن المعلومات بأنه العلم الذي يعمل على توفير الحماية للمعلومات من المخاطر التي تهددها، أو الحاجز الذي يمنع الاعتداء عليها، وذلك من خلال توفير الأدوات والوسائل اللازمة لحماية المعلومات من المخاطر الداخلية أو الخارجية. أو هي: المعايير والإجراءات المتخذة لمنع وصول المعلومات إلى أيدي أشخاص غير مخوّلين عبر الاتصالات ولضمان أصالة وصحة هذه الاتصالات.\n");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("Cyber Security for begginers");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("Certified ethical Hacker(CEH)by yasser ramzy, LENUX, widows server2016 adminstration full course");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                websites.setText("security feedspot, simens cybersecurity");
            }
        });
    }
}
