package com.neusoft.day15.myGeneric;

import java.util.ArrayList;
import java.util.Collection;

public class TextGenericDemo3 {

        public static void main(String[] args) {
            Collection<Integer> list1= new ArrayList<>();
            Collection<String> list2= new ArrayList<>();
            getElement(list1);
            getElement(list2);
        }
        public static  void getElement(Collection<?> coll){
            //<?>代表可以接受任意类型的

        }


}
