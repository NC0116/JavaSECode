package com.neusoft.day12;

import java.io.ObjectStreamClass;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Person{name="+name+",age="+age+"}";
    }





    @Override
    public boolean equals(Object obj) {
        //如果对象的地址值一样，则认为相同
        if (this == obj) {
            return true;
        }
        //如果参数为空，或者类型信息不一样，则认为不相同
        if (obj == null || getClass() != obj.getClass())
        return false;
        //转化为当前类型
        Person person = (Person)obj;
        //要求基本类型相同，并且将引用类交给Objects类的equals今天方法取用结果
        return this.age == person.age && Objects.equals(this.name,person.name);
    }


}
