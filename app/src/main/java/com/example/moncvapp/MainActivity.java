package com.example.moncvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.text.Format;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Experience> experiences = new ArrayList<Experience>();
        experiences.add(new Experience("2020", "Today", "Opéra national de Paris", "Concepteur développeur logiciel"));
        experiences.add(new Experience("2020", "2020", "Teletech International", "Développeur commercial"));
        experiences.add(new Experience("2019", "2020", "Groupe Cybertek", "Technico-commercial informatique"));
        experiences.add(new Experience("2017", "2019", "Mcdonalds", "Equipier polyvalent"));

        ListView listViewExperiences = findViewById((R.id.listViewExp));
        ExperienceBaseAdapter experienceAdapter = new ExperienceBaseAdapter (experiences,this);
        listViewExperiences.setAdapter(experienceAdapter);

        ArrayList<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("2022", "2023","CONCEPTEUR DEVELOPPEUR D'APPLICATIONS", "CFA INSTA"));
        formations.add(new Formation("2020", "2022","BTS SIO Option SLAM", "CFA INSTA"));
        formations.add(new Formation("2016", "2016","BACCALAUREAT ES", "LYCEE PAUL ROBERT (LES LILAS)"));


        ListView listViewFormation = findViewById((R.id.listViewFormation));
        FormationBaseAdapter formationAdapter = new FormationBaseAdapter (formations,this);
        listViewFormation.setAdapter(formationAdapter);
    }
}