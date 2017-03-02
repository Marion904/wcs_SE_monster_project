package com.example.wilder.app_wcs_se_monster_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Monster_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster__page);

        //gets all of the monster stats from the intent to be displayed in the UI
        Intent onStart = getIntent();
        String name = onStart.getStringExtra("name");
        String life = onStart.getStringExtra("life");
        String power = onStart.getStringExtra("power");
        String speed = onStart.getStringExtra("speed");
        String stamina = onStart.getStringExtra("stamina");
        int type = onStart.getIntExtra("type", 0);

        //declaring both buttons to be used with onClick later
        Button back_menu_button = (Button) findViewById(R.id.back_menu_button);
        Button back_collection_button = (Button) findViewById(R.id.back_collection_button);

        //declaring all textViews to use .setText later
        TextView stat_life_text = (TextView) findViewById(R.id.stat_life_text);
        TextView stat_power_text = (TextView) findViewById(R.id.stat_power_text);
        TextView stat_speed_text = (TextView) findViewById(R.id.stat_speed_text);
        TextView stat_stamina_text = (TextView) findViewById(R.id.stat_stamina_text);

        //replacing textViews content with strings from intent and displaying stats
        stat_life_text.setText(life);
        stat_power_text.setText(power);
        stat_speed_text.setText(speed);
        stat_stamina_text.setText(stamina);

        //setting title of the page to monster's name
        this.setTitle(name);

        //declaring imageView to set content based on monster's type
        ImageView monsterType = (ImageView) findViewById(R.id.type_image);

        //switch that checks monster's type and displaying image accordingly
        switch (type) {

            case 0 :
                monsterType.setImageResource(R.drawable.eau);
                break;

            case 1 :
                monsterType.setImageResource(R.drawable.feu);
                break;

            case 2 :
                monsterType.setImageResource(R.drawable.lumiere);
                break;

            case 3 :
                monsterType.setImageResource(R.drawable.foudre);
                break;

            case 4 :
                monsterType.setImageResource(R.drawable.magie);
                break;

            case 5 :
                monsterType.setImageResource(R.drawable.nature);
                break;

            case 6 :
                monsterType.setImageResource(R.drawable.mort)   ;
                break;

            case 7 :
                monsterType.setImageResource(R.drawable.metal);
                break;

            case 8 :
                monsterType.setImageResource(R.drawable.special);
            break;

        }

        //onCLick, closes the activity and sends back to collection
        back_collection_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        //onCLick starts the main menu activity
        back_menu_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                Intent back_menu = new Intent(Monster_Page.this, MainActivity.class);
                startActivity(back_menu);
                finish();
        }
        });

    }
}
