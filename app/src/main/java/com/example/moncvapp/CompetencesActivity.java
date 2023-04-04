package com.example.moncvapp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CompetencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competences);

        ArrayList<String> listeNiveaux = new ArrayList<>();
        listeNiveaux.add("25");
        listeNiveaux.add("50");
        listeNiveaux.add("75");
        listeNiveaux.add("100");

        ArrayList<Langage> langages = new ArrayList<Langage>();
        langages.add(new Langage("PHP",listeNiveaux.get(1)));
        langages.add(new Langage("Javascript",listeNiveaux.get(0)));
        langages.add(new Langage("HTML",listeNiveaux.get(3)));
        langages.add(new Langage("CSS",listeNiveaux.get(1)));
        langages.add(new Langage("Java",listeNiveaux.get(1)));
        langages.add(new Langage("Java Android",listeNiveaux.get(0)));
        langages.add(new Langage("SQL",listeNiveaux.get(3)));


        ListView listViewLangages = findViewById(R.id.listViewLangages);
        LangageBaseAdapter langageAdapter = new LangageBaseAdapter(langages, this);
        listViewLangages.setAdapter(langageAdapter);

        ArrayList<Projet> projets = new ArrayList<Projet>();
        projets.add(new Projet("Lomography App","Réalisation d'une application de suivi de commande en Java Android."));
        projets.add(new Projet("Gestion des avenants","Création d'un module de gestion des avenants au sein d'un SIRH."));
        projets.add(new Projet("Lomography","Réalisation d'un site d'e-commerce en PHP."));

        ListView listViewProjets = findViewById(R.id.listViewProjets);
        ProjetBaseAdapter projetAdapter = new ProjetBaseAdapter(projets, this);
        listViewProjets.setAdapter(projetAdapter);
    }
}
