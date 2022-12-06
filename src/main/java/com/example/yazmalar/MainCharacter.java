package com.example.yazmalar;

public class MainCharacter extends Character{
    String gender;
    String place;


    public MainCharacter(String name, String gender){
        this.name = name;
        this.gender = gender;
        this.attackDamage = 10;
        this.armor = 2;
        this.level = 1;
        this.health = 100;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }

    public void setName(String name){
        this.name = name;
    }
    public void usePotion(){

    }
    public void sellPotion(Object o){
        o = null;
    }
    public void buyPotion(){
    }
    public void sellShield(Object o){
        o = null;
    }
    public void buyShield(){

    }
    public void sellSword(Object o){
        o = null;
    }
    public void buySword(){

    }
    public void equipSword(){

    }
    public void unequipSword(){

    }
    public void equipShield(){

    }
    public void unequipShield(){

    }
    public void changePlace(){

    }
    public void sellTool(Object o){
        o = null;
    }
    public void buyTool(){

    }

}
