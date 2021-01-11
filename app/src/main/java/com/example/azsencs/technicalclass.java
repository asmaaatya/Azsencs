package com.example.azsencs;

public class technicalclass {
    String commitename;
    int commitephoto;

    public technicalclass(String commitename, int commitephoto) {
        this.commitename = commitename;
        this.commitephoto = commitephoto;
    }

    public String getCommitename() {
        return commitename;
    }

    public void setCommitename(String commitename) {
        this.commitename = commitename;
    }

    public int getCommitephoto() {
        return commitephoto;
    }

    public void setCommitephoto(int commitephoto) {
        this.commitephoto = commitephoto;
    }
}
