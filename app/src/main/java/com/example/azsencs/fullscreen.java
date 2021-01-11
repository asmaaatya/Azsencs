package com.example.azsencs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class fullscreen extends AppCompatActivity {
ImageView imageView;
int x=0;
    ImageView imageView1;
    ImageView imageView2;
    ArchieveAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        imageView=findViewById(R.id.fullimg);
         imageView1=findViewById(R.id.leftimg);
         imageView2=findViewById(R.id.rightimg);
        Intent i = getIntent();
        int pos = i.getExtras().getInt("id");
         adapter = new ArchieveAdapter(this);
        imageView.setImageResource(adapter.imgarray[pos]);

    }

    public void clickright(View view) {
        imageView2.setImageResource(adapter.imgarray[x]);
        if(x<58){
            x++;
        }
    }

    public void clickleft(View view) {
        imageView1.setImageResource(adapter.imgarray[x]);
        if(x>0){
            x--;
        }
    }
}
