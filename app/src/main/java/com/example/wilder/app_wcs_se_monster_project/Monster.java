package com.example.wilder.app_wcs_se_monster_project;


import android.os.Parcelable;

/**
 * Created by wilder on 01/03/17.
 */

public class Monster {
    private String name;
    private int type;
    private String life;
    private String power;
    private String speed;
    private String stamina;
    private String[] typeSelector = {"Eau", "Feu", "Lumière", "Foudre", "Magie", "Nature", "Mort", "Metal", "Spécial"};

    //constructeur
    public Monster (String name,int type, String life, String power, String speed, String stamina){
        this.name = name;
        this.type = type;
        this.life=life;
        this.power = power;
        this.speed = speed;
        this.stamina = stamina;
    }

    //getter


    public int getType(){
        return this.type;
    }
    public String getLife(){
        return this.life;
    }
    public String getPower(){
        return this.power;
    }
    public String getSpeed(){
        return this.speed;
    }
    public String getStamina(){
        return this.stamina;
    }

    public String getName() {
        return  this.name;
    }

    public String toString(){

        return this.name+" - "+typeSelector[this.type]+" - "+this.life+" - "+this.power+" - "+this.speed+" - "+this.stamina;
    }

}
