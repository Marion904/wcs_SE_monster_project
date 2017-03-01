package com.example.wilder.app_wcs_se_monster_project;


/**
 * Created by wilder on 01/03/17.
 */

public class Monster {
    private String name;
    private String type;
    private String life;
    private String power;
    private String speed;
    private String stamina;

    //constructeur
    public Monster (String name,String type, String life, String power, String speed, String stamina){
        this.name = name;
        this.type = type;
        this.life=life;
        this.power = power;
        this.speed = speed;
        this.stamina = stamina;
    }

    //getter

    public String toString(){
        return this.name+" - "+this.type+" - "+this.life+" - "+this.power+" - "+this.speed+" - "+this.stamina;
    }

}
