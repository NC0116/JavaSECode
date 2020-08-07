package com.neusoft.Practise.zhouce3;

public  abstract class Shape {
   double  area;
    double per;
   char color;

    public Shape() {

    }

    public Shape(char color) {
        this.color = color;
    }

    public abstract double getArea() ;
    public abstract double getPer() ;
    public abstract void showAll() ;

}
