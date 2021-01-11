package com.example.azsencs;

public class sponserclass {
    String companyname;
    int companyimg;

    public sponserclass(String companyname, int companyimg) {
        this.companyname = companyname;
        this.companyimg = companyimg;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public int getCompanyimg() {
        return companyimg;
    }

    public void setCompanyimg(int companyimg) {
        this.companyimg = companyimg;
    }
}
