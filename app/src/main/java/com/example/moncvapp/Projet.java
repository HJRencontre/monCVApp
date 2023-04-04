package com.example.moncvapp;

public class Projet {
    private String projet;
    private String descProjet;

    public Projet(String projet, String descProjet) {
        this.projet = projet;
        this.descProjet = descProjet;
    }

    public String getProjet() {
        return projet;
    }

    public void setProjet(String projet) {
        this.projet = projet;
    }

    public String getDescProjet() {
        return descProjet;
    }

    public void setDescProjet(String descProjet) {
        this.descProjet = descProjet;
    }
}
