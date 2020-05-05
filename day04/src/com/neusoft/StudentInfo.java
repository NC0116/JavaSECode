package com.neusoft;

public class StudentInfo {
    private String name;
    private int age;

    //为成员方法提供公有的get、set 方法(访问、修改）
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //this 的含义：
    //this 代表所在类的当前对象的引用（地址值），即对象自己的引用
//    方法被那个对象调用，方法中的this代表那个对象，
//    即谁在调用，this就代表谁
}
