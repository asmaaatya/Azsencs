package com.example.azsencs;

public class operationclass {
    String opername;
    int operimg;

    public operationclass(String opername, int operimg) {
        this.opername = opername;
        this.operimg = operimg;
    }

    public String getOpername() {
        return opername;
    }

    public void setOpername(String opername) {
        this.opername = opername;
    }

    public int getOperimg() {
        return operimg;
    }

    public void setOperimg(int operimg) {
        this.operimg = operimg;
    }
}
