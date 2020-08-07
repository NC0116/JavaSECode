package com.neusoft.Practise.zhouce3;

public class Text5 {
    public static void main(String[] args) {
        Shape[] shapes={
               new Rectangle('蓝',1,2),
                new Circle('红',1.2),
        };
        for (Shape shape:shapes) {
            shape.showAll();

        }
    }
}
