package com.example.wilder.app_wcs_se_monster_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MonsterCollectionActivity extends AppCompatActivity {

    private ArrayList<String> collection;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_collection);
        /*

        Intent newMonster = getIntent();
        String name = newMonster.getStringExtra(CreateMonster2.name);
        String type = newMonster.getStringExtra(CreateMonster2.type);
        int vie=newMonster.getStringExtra(CreateMonster2.vie);
        int force=newMonster.getStringExtra(CreateMonster2.force);
        int vitesse=newMonster.getStringExtra(CreateMonster2.vitesse);
        int endurance=newMonster.getStringExtra(CreateMonster2.endurance);
      //  Monsters test = new Monsters(name, type, vie, force, vitesse, endurance);
        collection.add(test);
        for(int i = 0; i < collection.size(); i++){

            TextView monstre;

    }*/
        ListView monster_list = (ListView) findViewById(R.id.monster_list);
        String monstre []= {"jojo eau 100 150 200 50"};
        // Create a List from String Array elements
        final List<String> collection = new ArrayList<String>(Arrays.asList(monstre));

        // Create an ArrayAdapter from List
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_monster_collection,collection);
        // DataBind ListView with items from ArrayAdapter
        monster_list.setAdapter(arrayAdapter);

    }
}
