package com.neusoft;

public class Armour {
    private String name;//装备名
    private int protect; //防御值

    public Armour(String name, int protect ){
        this.name = name;
        this.protect = protect;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}