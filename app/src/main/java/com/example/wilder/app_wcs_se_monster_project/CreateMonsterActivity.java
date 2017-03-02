package com.example.wilder.app_wcs_se_monster_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class CreateMonsterActivity extends AppCompatActivity implements View.OnClickListener {

    //declaring editText name so it can be used it later in onClick method.

    EditText add_monster_name_edit;

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

        //declaring and hiding buttons layout to display only when edit text is filled
        final RelativeLayout buttons_layout = (RelativeLayout) findViewById(R.id.buttons_layout);
            buttons_layout.setVisibility(View.INVISIBLE);

        //defining monster name when onCreate is running
        add_monster_name_edit = (EditText) findViewById(R.id.add_monster_name_edit);

        //defining both buttons
        final Button save_name_button = (Button) findViewById(R.id.save_name_button);
        final Button main_menu_button = (Button) findViewById(R.id.main_menu_button);

        //onClick on main menu button, go back to main menu
        main_menu_button.setOnClickListener(new View.OnClickListener() {  //first event handler brings back to main menu
            @Override
            public void onClick(View v) {

                Intent back_menu = new Intent(CreateMonsterActivity.this, MainActivity.class);
                startActivity(back_menu);
            }
        });

        //on click on save name button, check if name editText is filled, if yes display type buttons, else display toast
        save_name_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (add_monster_name_edit.length() == 0) {

                    Toast.makeText(CreateMonsterActivity.this, getString(R.string.need_monster_name_toast), Toast.LENGTH_SHORT).show();

                }

                else {

                    add_monster_name_edit.setEnabled(false);
                    save_name_button.setEnabled(false);
                    buttons_layout.setVisibility(View.VISIBLE);
                }
            }

        });
    }

    //onClick listener on the type buttons layout
    public void onClick(View v) {

        int type;
        String name = add_monster_name_edit.getText().toString();
        Intent next_creation = new Intent(CreateMonsterActivity.this, CreateMonster2.class);

        //switch that checks which button has been clicked and affect a values to the "type" variable depending on the type
        //then starts a new activity with name and type as extras
        switch (v.getId()) {

            case R.id.water_image_button :

                type = 0;
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.fire_image_button :

                type = 1;
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.light_image_button :

                type = 2;
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.foudre_image_button :

                type = 3;
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.magic_image_button :

                type = 4;
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.nature_image_button :

                type = 5;
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.death_image_button :

                type = 6;
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.metal_image_button :

                type = 7;
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;

            case R.id.special_image_button :

                type = 8;
                next_creation.putExtra("type", type);
                next_creation.putExtra("name", name);
                startActivity(next_creation);
                break;



        }
    }
}
