package com.example.azsencs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Sponsers extends AppCompatActivity implements  selectedcompany {
    RecyclerView recyclerView;
    ArrayList<sponserclass> arrayList;
    sponserAdapter adapter;
    selectedcompany selectedcompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsers);
        recyclerView = findViewById(R.id.sponsersrec);
        BottomNavigationView navigationView=findViewById(R.id.nav);
        navigationView.setSelectedItemId(R.id.suppliers);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.archievefeed:
                        startActivity(new Intent(getApplicationContext(),archieveandfeed.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.suppliers:
                        return true;
                    case R.id.events:
                        startActivity(new Intent(getApplicationContext(),Main3Activity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.committe:
                        startActivity(new Intent(getApplicationContext(),startactivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
        arrayList = new ArrayList<>();

        arrayList.add(new sponserclass("", R.drawable.comp4));
        arrayList.add(new sponserclass("", R.drawable.comp14));
        arrayList.add(new sponserclass("", R.drawable.comp5));
        arrayList.add(new sponserclass("", R.drawable.comp11));
        arrayList.add(new sponserclass("", R.drawable.comp13));
        arrayList.add(new sponserclass("", R.drawable.comp3));
        arrayList.add(new sponserclass("", R.drawable.comp10));
        arrayList.add(new sponserclass("", R.drawable.comp6));
        arrayList.add(new sponserclass("", R.drawable.comp12));
        arrayList.add(new sponserclass("", R.drawable.comp7));
        arrayList.add(new sponserclass("", R.drawable.comp2));
        arrayList.add(new sponserclass("", R.drawable.comp8));
        arrayList.add(new sponserclass("", R.drawable.comp9));
        arrayList.add(new sponserclass("", R.drawable.comp1));

        adapter = new sponserAdapter(arrayList, this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void oncardlis(int position) {
        switch ((position)) {
            case 0:
                Intent intent12 = new Intent(Sponsers.this, Company.class);
                intent12.putExtra("text","EGyptInnovate is the online Innovation Hub for Egypt powered by TIEC,managed by Innovetry&developed by Link Development");
                intent12.putExtra("image",R.drawable.comp4);
                intent12.putExtra("page","https://www.facebook.com/EgyptInnovate");
                startActivity(intent12);
                break;

            case 1:
                Intent intent1 = new Intent(Sponsers.this, Company.class);
                intent1.putExtra("text","ITShare is an Egyptian Training Company(ISO 9001).founded in 2008 to provide IT,Excutive Coaching and Soft Skills Training of exceptional quality through");
                intent1.putExtra("image",R.drawable.comp14);
                intent1.putExtra("page","https://www.facebook.com/ITShare.Page");
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(Sponsers.this, Company.class);
                intent2.putExtra("text","Jelecom Group: Technical Consultant for R&D professional technical training provider Electronics Agent for(Microchip-Amtel-Mikroelktronika");
                intent2.putExtra("image",R.drawable.comp5);
                intent2.putExtra("page","https://www.facebook.com/Jelecom.official");
                startActivity(intent2);
                break;
            case 3:
                Intent intent8 = new Intent(Sponsers.this, Company.class);
                intent8.putExtra("text","نقابة المهندسين لها شخصية اعتبارية و تعتبر الغيئة الممثلة للمهندسين وتعتبر هيئة استشارية للدولة في مجال تخصصها ويكون مقرها الرئيسي بالقاهره لها فروع بالمحافظات وطبقا لقانون رقم 66لسنه1974فان النقابة تعمل علي تحقيق الاهداف الخاصه بكافه مجالات الهندسة");
                intent8.putExtra("image",R.drawable.comp11);
                intent8.putExtra("page","https://www.facebook.com/eea.org.eg");
                startActivity(intent8);
                break;
            case 4:
            Intent intent5 = new Intent(Sponsers.this, Company.class);
            intent5.putExtra("text","جمعيه الاورمان وهي جمعيه مسئوله عن كفاله اليتيم ورعايه المساكين");
            intent5.putExtra("image",R.drawable.comp13);
            intent5.putExtra("page","https://www.facebook.com/%D8%AC%D9%85%D8%B9%D9%8A%D9%87-%D8%A7%D9%84%D8%A7%D9%88%D8%B1%D9%85%D8%A7%D9%86-105719347627215");
            startActivity(intent5);
            break;

            case 5:
            Intent intent13 = new Intent(Sponsers.this, Company.class);
            intent13.putExtra("text","اندومي هي شركه رائده لصناعه النودلز");
            intent13.putExtra("image",R.drawable.comp3);
            intent13.putExtra("page","https://www.facebook.com/Indomie.Egypt");
            startActivity(intent13);
            break;
            case 6:
                Intent intent4 = new Intent(Sponsers.this, Company.class);
                intent4.putExtra("text","English capsules is an eductional study program to ensure that every English learner that takes our capsules does so enjoying and learning");
                intent4.putExtra("image",R.drawable.comp10);
                intent4.putExtra("page","https://www.facebook.com/English.Capsules/?ref=page_internal");
                startActivity(intent4);
                break;
            case 7:
            Intent intent3= new Intent(Sponsers.this, Company.class);
            intent3.putExtra("text","Valeo, one of the world's leading automotive suppliers");
            intent3.putExtra("image",R.drawable.comp6);
            intent3.putExtra("page","https://www.facebook.com/Valeo.Group");
            startActivity(intent3);
            break;
            case 8:

            Intent intent = new Intent(Sponsers.this, Company.class);
            intent.putExtra("text","SYE is the first English community in Egypt.we provide an enjoyable and sociable learning experience by creating content tailored just for You.");
            intent.putExtra("image",R.drawable.comp12);
            intent.putExtra("page","https://www.facebook.com/syecommunity/");
            startActivity(intent);
            break;
            case 9:
            Intent intent6 = new Intent(Sponsers.this, Company.class);
            intent6.putExtra("text","اهلني هي مؤسسه هدفها تاهيل مائه الف شاب لسوق العمل بالمجان والقضاء علي الفجوه بين سوق العمل ودراسه الطالب ف الجامعه");
            intent6.putExtra("image",R.drawable.comp7);
            intent6.putExtra("page","https://www.facebook.com/Ahelny97");
            startActivity(intent6);
            break;
            case 10:
                Intent intent9 = new Intent(Sponsers.this, Company.class);
                intent9.putExtra("text","JONASوهي شركه سوريه للصناعات الغذائيه رائده في السوق من خلال صناعه الحلوي والشوكولا في مصنعها في مصر");
                intent9.putExtra("image",R.drawable.comp2);
                intent9.putExtra("page","https://www.facebook.com/jonaschocola");
                startActivity(intent9);
                break;

            case 11:
                Intent intent10 = new Intent(Sponsers.this, Company.class);
                intent10.putExtra("text","نفهم هي خدمه تعليميه الكترونية مبتكرة علي الانترنت تقدم فيديوهات تشرح المناهج الدراسية ودورات في المهارات الحياتية");
                intent10.putExtra("image",R.drawable.comp8);
                intent10.putExtra("page","https://www.facebook.com/NafhamEducation");
                startActivity(intent10);
                break;

            case 12:
                Intent intent11 = new Intent(Sponsers.this, Company.class);
                intent11.putExtra("text","مبادره المبرمج المصري هي مبادره تهدف الي تعليم وتطوير الشباب للتوافق مع سوق العمل في مجال البرمجة");
                intent11.putExtra("image",R.drawable.comp9);
                intent11.putExtra("page","https://www.facebook.com/EgyptianProgrammer1");
                startActivity(intent11);
                break;
            case 13:
                Intent intent7 = new Intent(Sponsers.this, Company.class);
                intent7.putExtra("text","CyberTalents is platform that Helps Universities,Schools,Governments and Companies to Discover&Recruit Talents in Cyber Security through Hackat");
                intent7.putExtra("image",R.drawable.comp1);
                intent7.putExtra("page","https://www.facebook.com/cybertalentsofficial");
                startActivity(intent7);
                break;

        }
    }
}