package com.example.azsencs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ArchieveAdapter extends BaseAdapter {
    private Context context;
    public  int[] imgarray={
R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,R.drawable.pic9,R.drawable.pic10,
R.drawable.pic11,R.drawable.pic12,R.drawable.pic13,R.drawable.pic14,R.drawable.pic15,R.drawable.pic16,R.drawable.pic17
,R.drawable.pic18,R.drawable.pic19,R.drawable.pic20,R.drawable.pic21,R.drawable.pic22,R.drawable.pic23,R.drawable.pic24
,R.drawable.pic25,R.drawable.pic26,R.drawable.pic27,R.drawable.pic28,R.drawable.pic1,R.drawable.pic2,R.drawable.pic29,R.drawable.pic30,R.drawable.pic31,R.drawable.pic32,R.drawable.pic33,R.drawable.pic34
            ,R.drawable.pic35,R.drawable.pic36,R.drawable.pic37,R.drawable.pic38,R.drawable.pic39,R.drawable.pic40,R.drawable.pic41,
            R.drawable.pic42,R.drawable.pic43,R.drawable.pic44,R.drawable.pic45,R.drawable.pic46,R.drawable.pic47,R.drawable.pic48,
            R.drawable.pic49,R.drawable.pic50,R.drawable.pic51,R.drawable.pic52,R.drawable.pic53,R.drawable.pic54,R.drawable.pic55,
            R.drawable.pic56,R.drawable.pic57,R.drawable.pic58,R.drawable.pic59,



    };

    public ArchieveAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return imgarray.length;
    }

    @Override
    public Object getItem(int i) {
        return imgarray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(context);
        imageView.setImageResource(imgarray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340,350));
        return imageView;
    }
}
