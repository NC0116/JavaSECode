package com.neusoft;

public class AnimalLivable implements Livable {
    //alt+ shift + enter导入所有抽象方法

    @Override
    public void eat() {
        System.out.println("卡卡造");
    }

    @Override
    public void sleep() {
        System.out.println("呼呼睡");
    }
}
