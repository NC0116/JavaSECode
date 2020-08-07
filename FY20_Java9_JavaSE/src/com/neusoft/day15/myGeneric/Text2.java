package com.neusoft.day15.myGeneric;

public interface Text2 {
    public static void main(String[] args) {
        MyGenericMethod mgm = new MyGenericMethod();
        //调用方法是确定了泛型的类型
        mgm.show("aaa");
        mgm.show(123);
        mgm.show(12.45);
    }
}
