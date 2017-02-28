package com.example.wilder.app_wcs_se_monster_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonsterCollectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_collection);

        // Get reference of widgets from XML layout
        final ListView list = (ListView) findViewById(R.id.collection);


        //String[][] tableau={{"Nom","Prénom"},{"Machin","Bidule"}};
        String[] tableau={};
        // Create a List from String Array elements
        final List<String> collection = new ArrayList<>(Arrays.asList(tableau));

        // Create an ArrayAdapter from List
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, collection);

        // DataBind ListView with items from ArrayAdapter
        list.setAdapter(arrayAdapter);

        Intent intent = getIntent();
        String monster = intent.getStringExtra("name")+" - "+
                        intent.getStringExtra("type")+" - "+
                        intent.getStringExtra("life")+" - "+
                        intent.getStringExtra("Strength")+" - "+
                        intent.getStringExtra("Stamina")+" - "+
                        intent.getStringExtra("speed");

        collection.add(monster);
    }
}
