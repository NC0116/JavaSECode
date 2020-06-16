package com.neusoft.homework;

public class Sun extends Star implements Universe {

    @Override
    public void doAnything() {
        System.out.println("sun:太阳系九大行星旋转");
    }
    public void shine(){
        System.out.println("sun:光照八分钟到达地球");
    }
}
