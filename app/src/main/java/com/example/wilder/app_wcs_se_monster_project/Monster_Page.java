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

        Intent onStart = getIntent();
        String name = onStart.getStringExtra("name");
        String life = onStart.getStringExtra("life");
        String power = onStart.getStringExtra("power");
        String speed = onStart.getStringExtra("speed");
        String stamina = onStart.getStringExtra("stamina");
        int type = onStart.getIntExtra("type", 0);

        Button back_menu_button = (Button) findViewById(R.id.back_menu_button);
        Button back_collection_button = (Button) findViewById(R.id.back_collection_button);

        TextView monster_name = (TextView) findViewById(R.id.monster_name);
        TextView stat_life_text = (TextView) findViewById(R.id.stat_life_text);
        TextView stat_power_text = (TextView) findViewById(R.id.stat_power_text);
        TextView stat_speed_text = (TextView) findViewById(R.id.stat_speed_text);
        TextView stat_stamina_text = (TextView) findViewById(R.id.stat_stamina_text);

        monster_name.setText(name);
        stat_life_text.setText(life);
        stat_power_text.setText(power);
        stat_speed_text.setText(speed);
        stat_stamina_text.setText(stamina);


        ImageView monsterType = (ImageView) findViewById(R.id.type_image);

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

    back_collection_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();

        }
    });

    back_menu_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent back_menu = new Intent(Monster_Page.this, MainActivity.class);
            startActivity(back_menu);
        }
    });

    }
}
