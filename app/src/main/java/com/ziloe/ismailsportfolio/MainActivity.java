package com.ziloe.ismailsportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recycler_view_projects);

        Project [] projects = {
                new Project("Getting started app", "Our very first project, the default 'hello world app'", R.drawable.getting_started),
                new Project("Inches Converter", "Our second project, converting inches to meteres", R.drawable.tape),
                new Project("Archies", "Our third project, a Restaurant showcasing their menu", R.drawable.archies),
                new Project("BMI Calculator", "Our fourth project, calculating your BMI", R.drawable.calculator),
                new Project("Ummah lite", "Our 5th project, a prayer app which shows the time of your prayers in your current location", R.drawable.ummah),
        };

       ProjectAdapter projectAdapter = new ProjectAdapter(projects);
       recyclerView.setAdapter(projectAdapter);
    }
}