package com.example.wilder.app_wcs_se_monster_project;

import android.os.Parcel;
import android.os.Parcelable;

//creating class Monster so it's attributes can be passed between different activities and displayed
public class Monster implements Parcelable{
    private String name;
    private int type;
    private String type_text;
    private float life;
    private float power;
    private float speed;
    private float stamina;

    //constructeur
    public Monster (String name,int type, String type_text, float life, float power, float speed, float stamina){
        this.name = name;
        this.type = type;
        this.type_text = type_text;
        this.life = life;
        this.power = power;
        this.speed = speed;
        this.stamina = stamina;
    }

    protected Monster(Parcel in) {
        name = in.readString();
        type = in.readInt();
        type_text = in.readString();
        life = in.readFloat();
        power = in.readFloat();
        speed = in.readFloat();
        stamina = in.readFloat();
    }

    public static final Creator<Monster> CREATOR = new Creator<Monster>() {
        @Override
        public Monster createFromParcel(Parcel in) {
            return new Monster(in);
        }

        @Override
        public Monster[] newArray(int size) {
            return new Monster[size];
        }
    };

    //getter
    public int getType(){
        return this.type;
    }
    public String getType_text(){
        return this.type_text;
    }
    public float getLife(){
        return this.life;
    }
    public float getPower(){
        return this.power;
    }
    public float getSpeed(){
        return this.speed;
    }
    public float getStamina(){
        return this.stamina;
    }

    public String getName() {
        return  this.name;
    }

    public String toString(){

        return this.name+" - "+this.type_text+" - "+this.life+" - "+this.power+" - "+this.speed+" - "+this.stamina;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(type);
        dest.writeString(type_text);
        dest.writeFloat(life);
        dest.writeFloat(power);
        dest.writeFloat(speed);
        dest.writeFloat(stamina);
    }
}
