package com.example.moncvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.text.Format;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Experience> experiences = new ArrayList<Experience>();
        experiences.add(new Experience("2020", "2023", "Opéra national de Paris", "Concepteur développeur logiciel"));
        experiences.add(new Experience("2020", "2020", "Teletech International", "Développeur commercial"));
        experiences.add(new Experience("2019", "2020", "Groupe Cybertek", "Technico-commercial informatique"));
        experiences.add(new Experience("2017", "2019", "McDonald's", "Equipier polyvalent"));

        ListView listViewExperiences = findViewById(R.id.listViewExp);
        ExperienceBaseAdapter experienceAdapter = new ExperienceBaseAdapter (experiences,this);
        listViewExperiences.setAdapter(experienceAdapter);

        ArrayList<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("2022", "2023","Concepteur développeur d'application", "CFA INSTA"));
        formations.add(new Formation("2020", "2022","BTS SIO Option SLAM", "CFA INSTA"));
        formations.add(new Formation("2016", "2016","Baccalauréat ES", "Lycée Paul Robert (Les Lilas)"));

        ListView listViewFormation = findViewById((R.id.listViewFormation));
        FormationBaseAdapter formationAdapter = new FormationBaseAdapter (formations,this);
        listViewFormation.setAdapter(formationAdapter);


        Button buttonCompetences = findViewById(R.id.buttonCompetences);

        buttonCompetences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CompetencesActivity.class);
                startActivity(intent);
            }
        });
    }


}