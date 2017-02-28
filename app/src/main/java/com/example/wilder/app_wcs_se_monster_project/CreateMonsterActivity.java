package com.example.wilder.app_wcs_se_monster_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class CreateMonsterActivity extends AppCompatActivity implements View.OnClickListener {

    //creating all EditText with one for name and 4 for stats

    EditText add_monster_name_edit = (EditText) findViewById(R.id.add_monster_name_edit);
    /*EditText create_stat_life = (EditText) findViewById(R.id.create_stat_life);
    EditText create_stat_power = (EditText) findViewById(R.id.create_stat_power);
    EditText create_stat_speed = (EditText) findViewById(R.id.create_stat_speed);
    EditText create_stat_stamina = (EditText) findViewById(R.id.create_stat_stamina);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_monster);

        //Setting up all stats buttons with clickListeners

        ImageButton water_image_button = (ImageButton) findViewById(R.id.water_image_button);
            water_image_button.setOnClickListener(this);
        ImageButton fire_image_button = (ImageButton) findViewById(R.id.fire_image_button);
            fire_image_button.setOnClickListener(this);
        ImageButton light_image_button = (ImageButton) findViewById(R.id.light_image_button);
            light_image_button.setOnClickListener(this);
        ImageButton foudre_image_button = (ImageButton) findViewById(R.id.foudre_image_button);
            foudre_image_button.setOnClickListener(this);
        ImageButton magic_image_button = (ImageButton) findViewById(R.id.magic_image_button);
            magic_image_button.setOnClickListener(this);
        ImageButton death_image_button = (ImageButton) findViewById(R.id.death_image_button);
            death_image_button.setOnClickListener(this);
        ImageButton metal_image_button = (ImageButton) findViewById(R.id.metal_image_button);
            metal_image_button.setOnClickListener(this);
        ImageButton special_image_button = (ImageButton) findViewById(R.id.special_image_button);
            special_image_button.setOnClickListener(this);
        ImageButton nature_image_button = (ImageButton) findViewById(R.id.nature_image_button);
            nature_image_button.setOnClickListener(this);

        //adding the two bottom buttons and their clickListeners

        /*Button back_menu_button = (Button) findViewById(R.id.back_menu_button);
        back_menu_button.setOnClickListener(this);
        Button valider_create_button = (Button) findViewById(R.id.valider_create_button);
        valider_create_button.setOnClickListener(this);*/

    }


    public void onClick(View v) {

        String type;
        String name = add_monster_name_edit.getText().toString();

        switch (v.getId()) {

            case R.id.water_image_button :

                type = "Eau";
                Intent next_creation = new Intent(CreateMonsterActivity.this, CreateMonster2.class);
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.fire_image_button :

                type = "Feu";
                Intent next_creation = new Intent(CreateMonsterActivity.this, CreateMonster2.class);
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.light_image_button :

                type = "Lumière";
                Intent next_creation = new Intent(CreateMonsterActivity.this, CreateMonster2.class);
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.foudre_image_button :

                type = "Foudre";
                Intent next_creation = new Intent(CreateMonsterActivity.this, CreateMonster2.class);
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.magic_image_button :

                type = "Magique";
                Intent next_creation = new Intent(CreateMonsterActivity.this, CreateMonster2.class);
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.nature_image_button :

                type = "Nature";
                Intent next_creation = new Intent(CreateMonsterActivity.this, CreateMonster2.class);
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.death_image_button :

                type = "Mort";
                Intent next_creation = new Intent(CreateMonsterActivity.this, CreateMonster2.class);
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.metal_image_button :

                type = "Métal";
                Intent next_creation = new Intent(CreateMonsterActivity.this, CreateMonster2.class);
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.death_image_button :

                type = "Mort";
                Intent next_creation = new Intent(CreateMonsterActivity.this, CreateMonster2.class);
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;



        }
    }
}
