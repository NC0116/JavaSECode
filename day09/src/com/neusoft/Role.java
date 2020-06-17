package com.neusoft;

public class Role {
    private int id;//角色id
    private int bool;//生命值
    private String name;//角色名


    private Weapon wp;  //添加武器属性


    private Armour ar;  //添加盔甲属性

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBool() {
        return bool;
    }

    public void setBool(int bool) {
        this.bool = bool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public Armour getAr() {
        return ar;
    }

    public void setAr(Armour ar) {
        this.ar = ar;
    }

    //攻击方法
    public void attack(){
        System.out.println("使用"+wp.getName()+",造成伤害"+wp.getHurt()+"点伤害");

    }

    //穿戴盔甲
    public void wear(){
        this.bool += ar.getProtect();//增加血量
        System.out.println("穿上"+ar.getName()+",生命值增加"+ar.getProtect());
    }
}
