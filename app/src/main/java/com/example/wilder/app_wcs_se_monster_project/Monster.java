package com.example.wilder.app_wcs_se_monster_project;


import android.os.Parcelable;

/**
 * Created by wilder on 01/03/17.
 */

public class Monster {
    private String name;
    private String type;
    private int type_index;
    private String life;
    private String power;
    private String speed;
    private String stamina;


    //constructeur
    public Monster (String name,String type, int type_index, String life, String power, String speed, String stamina){
        this.name = name;
        this.type = type;
        this.type_index = type_index;
        this.life=life;
        this.power = power;
        this.speed = speed;
        this.stamina = stamina;
    }

    //getter


    public int getType(){
        return this.type_index;
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

        return this.name+" - "+this.type+" - "+this.life+" - "+this.power+" - "+this.speed+" - "+this.stamina;
    }

}
