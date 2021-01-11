package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        ImageView imageView1=findViewById(R.id.image1);
        ImageView imageView2=findViewById(R.id.image2);
        final TextView book=findViewById(R.id.bokname);
        final TextView chnel=findViewById(R.id.channelname);
        TextView textView=findViewById(R.id.rm);
        TextView textView1=findViewById(R.id.intro);
        TextView textView2=findViewById(R.id.rf);
        textView.setText("العائد عليك لما تدخل تراك الويب:\n" +
                "1- بتتعلم في البداية بعض الأساسيات واللغات المؤهلة لتكونمشابه تمامًا لما نراه علي جميع المواقع مثل: سوق دوت كوم، موقع جامعتنا جامعه الازهر \n" +
                "2. هتتعلم كيفية عمل أي موقع لأي غرض آخر سواء فندق كبير أو موقع لمستشفى وهكذا");
        textView2.setText("للويب ثلاثة أقسام:\n" +
                "أولا: Web design\n" +
                "•Front-end\n" +
                "وصاحب هذا القسم يكون مختص بتصميم واجهة الموقع\n" +
                "ثانيا: Web developer  \n" +
                "وبيطلق عليه Back-end\n" +
                "وده مسئول عن التفاصيل التي لا يراها المستخدم (User) مثل: البيانات التي يتم إرسالها إلى الموقع (اسمك أو كلمة السر) لهذا فإن الديفيلوبر يتعامل مع البيانات بشكل برمجي  حتى يستطيعا الكمبيوتر فهمها وتخزينها.\n" +
                "\n" +
                "ثالثا: Full stack developer\n" +
                "نقدر نلقب صاحب القسم ده بالتنين المجنح \uD83D\uDE02 لأنه بيكون دارس القسمين السابقين، وقادر على تصميم الموقع كامل بنفسه\uD83D\uDC4F\uD83D\uDD25\n");
        textView1.setText("\n" +
                "عبارة عن كريزة تراكات البرمجة، له مكانته الرفيعة في مجتمع البرمجة، واثق من نفسه لدرجة كبيرة جدًا، ولا يستطيع أحد أن يقرب منه بسهولة إلا بتوافر مواصفات معينه مثل:\n" +
                "1.أن تكون شخص مبدع، وخيالك واسع.\n" +
                "2. غير روتيني، ودقيق وتحب الإضافات ودايمًا بتفكر للأحسن.\n" +
                "3. متقن للعديد من لغات البرمجة مثل:\n" +
                "HTML,HTML5, CSS, CSS3, JavaScript.....\n" +
                "4. أهم بند فيهم تكون بتحب البيت أو القهوة، وبتحب تقعد على اللاب وتشتغل وتجيب فلوس \uD83D\uDE02\n");



        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book.setText("HTML&CSS, NEURO WEB DESIGN");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chnel.setText("elzero web school, The new Baghdad, php Anonymous");
            }
        });
    }
}
