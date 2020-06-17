package com.neusoft;

public class Weapon {
    private  String name;//武器名
    private int hurt; //武器伤害

    public Weapon(String name, int hurt){
        this.name = name;
        this.hurt = hurt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}
