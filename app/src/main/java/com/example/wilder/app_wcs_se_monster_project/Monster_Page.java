package com.example.wilder.app_wcs_se_monster_project;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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
        Monster show = onStart.getParcelableExtra("Monster");
        final int position = onStart.getIntExtra("position",0);
        final String name = show.getName();
        int type = show.getType();
        String type_text = show.getType_text();
        String life = show.getLife();
        String power = show.getPower();
        String speed = show.getSpeed();
        String stamina = show.getStamina();


        //declaring both buttons to be used with onClick later
        Button back_menu_button = (Button) findViewById(R.id.back_menu_button);
        Button back_collection_button = (Button) findViewById(R.id.back_collection_button);
        Button supress_button = (Button) findViewById(R.id.suppress_button);

        //declaring all textViews to use .setText later
        TextView stat_life_text = (TextView) findViewById(R.id.stat_life_text);
        TextView stat_power_text = (TextView) findViewById(R.id.stat_power_text);
        TextView stat_speed_text = (TextView) findViewById(R.id.stat_speed_text);
        TextView stat_stamina_text = (TextView) findViewById(R.id.stat_stamina_text);
        TextView type_textView = (TextView) findViewById(R.id.type_text);

        //replacing textViews content with strings from intent and XML and displaying stats
        type_textView.setText(getString(R.string.monster_type_text) + type_text);
        stat_life_text.setText(life);
        stat_power_text.setText(power);
        stat_speed_text.setText(speed);
        stat_stamina_text.setText(stamina);

        //setting title of the page to monster's name
        this.setTitle(getString(R.string.title_text) + name);

        //declaring imageView to set content based on monster's type
        ImageView monsterType = (ImageView) findViewById(R.id.type_image);

        //switch that checks monster's type and displaying image accordingly
        switch (type) {

            case 0:
                monsterType.setImageResource(R.drawable.eau);
                break;

            case 1:
                monsterType.setImageResource(R.drawable.feu);
                break;

            case 2:
                monsterType.setImageResource(R.drawable.lumiere);
                break;

            case 3:
                monsterType.setImageResource(R.drawable.foudre);
                break;

            case 4:
                monsterType.setImageResource(R.drawable.magie);
                break;

            case 5:
                monsterType.setImageResource(R.drawable.nature);
                break;

            case 6:
                monsterType.setImageResource(R.drawable.mort);
                break;

            case 7:
                monsterType.setImageResource(R.drawable.metal);
                break;

            case 8:
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

        //onClick to delete Monster and go back to collection
        supress_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb = new AlertDialog.Builder(Monster_Page.this);
                adb.setTitle("Delete?");
                adb.setMessage("Are you sure you want to delete " + name);
                adb.setNegativeButton("Cancel", null);
                adb.setPositiveButton("Ok", new AlertDialog.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent delete = new Intent(Monster_Page.this, MonsterCollectionActivity.class);
                        delete.putExtra("position_to_delete", position);
                        startActivity(delete);

                    }
                });
                adb.show();
            }

        });
    }
}
