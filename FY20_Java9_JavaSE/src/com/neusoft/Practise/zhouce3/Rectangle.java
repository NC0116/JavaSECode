package com.neusoft.Practise.zhouce3;

public class Rectangle extends Shape {
    double width ;
    double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(char color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
       area = width*height;
       return area;
    }

    @Override
    public double getPer() {
        per= 2*(width+height);
        return per;
    }

    @Override
    public void showAll() {
        System.out.println("矩形的长"+width);
        System.out.println("矩形的宽"+height);
        System.out.println("矩形的面积"+getArea());
        System.out.println("矩形的周长"+getPer());
        System.out.println("矩形的颜色"+color);
    }


}
