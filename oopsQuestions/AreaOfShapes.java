package oopsQuestions;

import java.awt.*;
import java.util.Scanner;

abstract class AreaOfShapes
{
    abstract double getArea();
   abstract double getPerimeter();
}
class Circle extends AreaOfShapes{
    private double radius;
   public Circle(double radius){
       this.radius=radius;
   }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius");
        double radius=sc.nextInt();
        Circle rad=new Circle(radius);
        System.out.println("Area of Circle :"+rad.getArea());
        System.out.println("Perimete of circle :"+rad.getPerimeter());
    }
}
