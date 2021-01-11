package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class control extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        ImageView imageView4=findViewById(R.id.image4);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        final TextView websites=findViewById(R.id.websitename);
        TextView textView=findViewById(R.id.rm);
        TextView textView1=findViewById(R.id.intro);
        TextView textView2=findViewById(R.id.rf);
        textView.setText("محتوى الكورس:\n" +
                "1.\tمقدمه عن الـ (Classic Control)\n" +
                "2.\tمصادر إنتاج الكهرباء.\uD83D\uDD0B\n" +
                "3.\tأنواع الـ (Switches)⏲️\n" +
                "4.\tأدوات التحكم \n" +
                "5.\tأجهزة الحماية circuit breaker & overload & Fuse\n" +
                "6.\tالمؤقتات الزمنيهTimers. ⏱️\n" +
                "7.\t الحساساتSensors.\n" +
                "8.\t الموتورMotors.\n" +
                "9.\tتطبيق دوائر التحكم على برنامجى EKTS & Automation Studio.\n");
        textView2.setText("ثم حدث ما هو غير متوقع آنذاك ظهور النظرية المغناطيسية علي يد العالم مايكل فارادي \uD83E\uDDED\n" +
                "ومن هنا ظهر تحكم جديد عن طريق المجال المغناطيسي واستخدام بعض الـcomponent القائم عملها علي المجال المغناطيسي مثل الـ (contactors  -relays  ) وأطلق علي هذا النوع من التحكم الـ Classic control - Relay control)) وهذا النوع من التحكم يعتبر Semi-Automatic \n" +
                "ثم ظهر نوع آخر من التحكم يسمي بالـ  (Programmable Logic Control) أو (PLC) وهو نوع من المتحكمات التي يتم برمجتها لأداء وظيفة معينة دون الحاجة لعامل بشري، ثم ظهر نوع آخر يسمي توصيل الأشياء بالإنترنت ✨ (IOT) وذلك بدخول الانترنت في الصناعة.\n" +
                "ومع تقدم العالم السريع والملحوظ حاليًا سيصبح تدخل الإنسان في الصناعة منعدمًا إلي حد كبير \n" +
                "وبناءًا علي ذلك نقدم تراك (Classic Control) كأحد أنواع التحكم الآلي من بين كوكبة من الورش والكورسات داخل لجنة الدعم الفني بالفريق:\n");
        textView1.setText("\n" +
                "الكهرباء سر الحياة !\n" +
                "ألم يكن الماء سر الحياة ؟! \uD83E\uDD14\n" +
                "حاليًا فيما نعيشه ونعاصره أصبحت الكهرباء حجرا أساسيا في عملية التقدم التكنولوجي، بدونها يتوقف كل شئ، بدونها لا وجود للعالم، بدونها لا وجود لعديد من الدول الكبري التي تعتمد علي الكهرباء بشكل أساسي، بدونها لا وجود لنحن؛ كل مجموعة تصبح مستقلة بذاتها تكفل نفسها بنفسها وتعيل ما بداخلها.\n" +
                "بدأ الأمر بطفل غبي وانتهي بأول مصباح كهربائي في تاريخ البشرية\uD83D\uDCA1\uD83D\uDD26إنه توماس أديسون مخترع المصباح الكهربائي \uD83D\uDD25\uD83D\uDE0E\n" +
                "ويُعد المصباح الكهربائي  manual control وهذا يعني أن المتحكم الوحيد في غلق الدائرة وفتحها هو العامل البشري \uD83D\uDC4C\n");
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("Classical Control systems, Classic control(arabic)");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("Ahmed Radwan, Go AHEAD");
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                websites.setText("udemy classic control");
            }
        });

    }
}
