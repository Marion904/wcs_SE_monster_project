package com.example.wilder.app_wcs_se_monster_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CreateMonster2 extends AppCompatActivity {

    Button valider_create_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_monster2);

        Intent next_creation = getIntent();
        String name = next_creation.getStringExtra("name");
        String type = next_creation.getStringExtra("type");

        TextView pick_stats_text = (TextView) findViewById(R.id.pick_stats_text);   //changes the text view to display name of created monster
        pick_stats_text.setText(getString(R.string.pick_stats_text) + name);

        final Button main_menu_button = (Button) findViewById(R.id.main_menu_button);   //buttons with events handler to navigate the app
        final Button back_menu_button = (Button) findViewById(R.id.back_menu_button);
        valider_create_button= (Button) findViewById(R.id.valider_create_button);


        final EditText create_stat_life = (EditText) findViewById(R.id.create_stat_life);
        final EditText create_stat_power = (EditText) findViewById(R.id.create_stat_power);
        final EditText create_stat_speed = (EditText) findViewById(R.id.create_stat_speed);
        final EditText create_stat_stamina = (EditText) findViewById(R.id.create_stat_stamina);




        main_menu_button.setOnClickListener(new View.OnClickListener() {  //first event handler brings bacj to main menu
            @Override
            public void onClick(View v) {

                Intent back_menu = new Intent(CreateMonster2.this, MainActivity.class);
                startActivity(back_menu);
            }
        });

        back_menu_button.setOnClickListener(new View.OnClickListener() {  //second one, brings back to previous page
            @Override
            public void onClick(View v) {

                Intent back_create = new Intent(CreateMonster2.this, CreateMonsterActivity.class);
                startActivity(back_create);
            }
        });
        valider_create_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String life = create_stat_life.getText().toString();
                String power = create_stat_power.getText().toString();
                String stamina = create_stat_stamina.getText().toString();
                String speed = create_stat_speed.getText().toString();

                if (life.length()!=0 || power.length()!=0 || stamina.length()!=0 || speed.length()!=0) {

                    Toast.makeText(CreateMonster2.this, "Félicitations pour la création de ton monste !!", Toast.LENGTH_SHORT).show();
                }

                else {

                    Toast.makeText(CreateMonster2.this, getString(R.string.stats_missing_toast), Toast.LENGTH_SHORT).show();
                }
            }
            });



    }



}
