package com.example.wilder.app_wcs_se_monster_project;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MonsterCollectionActivity extends AppCompatActivity {

    Button back_to_menu;
    Button create;
    Button delete;
    private static List<Monster> sMonsters = null;
    private ListView collection = null;
    private ArrayAdapter mAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_collection);
        if (sMonsters == null) {
            sMonsters = new ArrayList<>();
        }
        back_to_menu = (Button) findViewById(R.id.retour);
        create = (Button) findViewById(R.id.create);

        back_to_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_menu = new Intent(MonsterCollectionActivity.this, MainActivity.class);
                startActivity(intent_menu);
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent create = new Intent(MonsterCollectionActivity.this, CreateMonsterActivity.class);
                startActivity(create);
            }
        });


        // Get reference of widgets from XML layout
        collection = (ListView) findViewById(R.id.collection);

        Intent intent = getIntent();
        if (intent.hasExtra("name")) {
            String name = intent.getStringExtra("name");
            int type = intent.getIntExtra("type", 0);
            String life = intent.getStringExtra("life");
            String power = intent.getStringExtra("power");
            String stamina = intent.getStringExtra("stamina");
            String speed = intent.getStringExtra("speed");

            Monster munch = new Monster(name, type, life, power, stamina, speed);

            //String[] tableau={"Name - Type - Life - Power- Stamina - Speed"};
            // Create a List from String Array elements
            this.sMonsters.add(munch);
            this.mAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, sMonsters);

            // DataBind ListView with items from ArrayAdapter
            this.collection.setAdapter(this.mAdapter);
            //List <String> collection = new ArrayList<>(Arrays.asList(tableau));

            // Create an ArrayAdapter from List
            //final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, collection);


            //mAdapter.notifyDataSetChanged();
            collection.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent monsterProfile = new Intent(MonsterCollectionActivity.this, Monster_Page.class);
                    Monster clickedMonster = (Monster) mAdapter.getItem(position);

                    clickedMonster.toString();
                    String name = clickedMonster.getName();
                    String life = clickedMonster.getLife();
                    String power = clickedMonster.getPower();
                    String speed = clickedMonster.getSpeed();
                    String stamina = clickedMonster.getStamina();
                    int type = clickedMonster.getType();

                    monsterProfile.putExtra("name", name);
                    monsterProfile.putExtra("life", life);
                    monsterProfile.putExtra("power", power);
                    monsterProfile.putExtra("speed", speed);
                    monsterProfile.putExtra("stamina", stamina);
                    monsterProfile.putExtra("type", type);

                    startActivity(monsterProfile);

                }
            });

        }

    }



}