package com.neusoft;

public class Person {
    private String name;
    private int age;
    private boolean live = true;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    


    //创建内部类
    class Heart {
        public void jump(){
            //直接访问外部成员
            if (live){
                System.out.println("心扑通扑通的在跳");
            }else{
                System.out.println("over");
            }
        }
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", live=" + live +
                '}';
    }


}
