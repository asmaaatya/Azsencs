package com.example.azsencs;

public class event {
    String name;
    int img;
    String date;
    public event(String name,int img,String date) {
        this.name = name;
        this.img=img;
        this.date=date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
