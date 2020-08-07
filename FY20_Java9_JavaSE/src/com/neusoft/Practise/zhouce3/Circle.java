package com.neusoft.Practise.zhouce3;

public class Circle extends Shape {
 double pi=3.14;
   double  radius;

   public Circle(char color, double radius) {
  super(color);
  this.radius = radius;
 }

 @Override
    public double getArea() {
     area = pi*radius*radius;
     return area;
    }

    @Override
    public double getPer() {
     per = pi*2*radius;
     return per;
    }

    @Override
    public void showAll() {
     System.out.println("圆的半径"+radius);
     System.out.println("圆的面积"+getArea());
     System.out.println("圆的周长"+getPer());
     System.out.println("圆的颜色"+color);
    }
}
