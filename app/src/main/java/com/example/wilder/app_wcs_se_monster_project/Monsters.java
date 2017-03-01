package com.example.wilder.app_wcs_se_monster_project;

/**
 * Created by wilder on 28/02/17.
 */

public class Monsters {
    String name;
    String type;
    int vie;
    int force;
    int vitesse;
    int endurance;
    int index=0;

    public Monsters (String name, String type, int vie, int force, int vitesse, int endurance){
        this.name=name;
        this.type=type;
        this.vie=vie;
        this.force=force;
        this.vitesse=vitesse;
        this.endurance = endurance;
        this.index=index++;
    }
}
