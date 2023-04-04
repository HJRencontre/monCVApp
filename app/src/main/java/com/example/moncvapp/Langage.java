package com.example.moncvapp;

public class Langage {
    private String langage;
    private String niveau;

    public Langage(String langage, String niveau) {
        this.langage = langage;
        this.niveau = niveau;
    }

    public String getLangage() {
        return langage;
    }

    public void setLangage(String langage) {
        this.langage = langage;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
