package com.example.wilder.app_wcs_se_monster_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreateMonster2 extends AppCompatActivity {

    Button valider_create_button;
    static String life;
    static String power;
    static String stamina;
    static String speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_monster2);

        Intent next_creation = getIntent();
        final String name = next_creation.getStringExtra("name");
        final int type = next_creation.getIntExtra("type", 0);


        //textView that changes based on the name chosed for the monster
        TextView pick_stats_text = (TextView) findViewById(R.id.pick_stats_text);
        pick_stats_text.setText(getString(R.string.pick_stats_text) + name);

        //button with events handler to get back to menu
        final Button back_menu_button = (Button) findViewById(R.id.back_menu_button);

        //button to finalize monster creation
        valider_create_button= (Button) findViewById(R.id.valider_create_button);

        //declaring edit text to get monster stats
        final EditText create_stat_life = (EditText) findViewById(R.id.create_stat_life);
        final EditText create_stat_power = (EditText) findViewById(R.id.create_stat_power);
        final EditText create_stat_speed = (EditText) findViewById(R.id.create_stat_speed);
        final EditText create_stat_stamina = (EditText) findViewById(R.id.create_stat_stamina);

        //activating onClick for the back menu button
        back_menu_button.setOnClickListener(new View.OnClickListener() {  //second one, brings back to previous page
            @Override
            public void onClick(View v) {

                Intent back_create = new Intent(CreateMonster2.this, CreateMonsterActivity.class);
                startActivity(back_create);
            }
        });

        //activating onClick for the "done" button
        valider_create_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                life = create_stat_life.getText().toString();
                power = create_stat_power.getText().toString();
                stamina = create_stat_stamina.getText().toString();
                speed = create_stat_speed.getText().toString();

                //checking if all editText fields are filled, then starting new activity, else displaying a toast

                if (life.length()!=0 && power.length()!=0 && stamina.length()!=0 && speed.length()!=0) {

                    Intent intent_create = new Intent(CreateMonster2.this, MonsterCollectionActivity.class);
                    intent_create.putExtra("name", name);
                    intent_create.putExtra("type", type);
                    intent_create.putExtra("life", life);
                    intent_create.putExtra("power", power);
                    intent_create.putExtra("stamina", stamina);
                    intent_create.putExtra("speed", speed);

                    startActivity(intent_create);
                }

                else {

                    Toast.makeText(CreateMonster2.this, getString(R.string.stats_missing_toast), Toast.LENGTH_SHORT).show();
                }
            }
            });



    }


}
