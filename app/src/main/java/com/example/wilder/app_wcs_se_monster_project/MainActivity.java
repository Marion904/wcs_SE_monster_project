package com.example.wilder.app_wcs_se_monster_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaring both buttons
        Button see_monster_button = (Button) findViewById(R.id.see_monster_button);
        Button add_monster_button = (Button) findViewById(R.id.add_monster_button);

        //onClick on see_monster_button sends to collection activity
        see_monster_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent see_monster_intent =  new Intent(MainActivity.this, MonsterCollectionActivity.class);
                see_monster_intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(see_monster_intent);
            }
        });

        //onClick on add_monster_button, sends to CreateMonsterActivity
        add_monster_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_monster_intent = new Intent(MainActivity.this, CreateMonsterActivity.class);
                startActivity(add_monster_intent);
            }
        });
    }
}
