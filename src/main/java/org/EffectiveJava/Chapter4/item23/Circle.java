package org.EffectiveJava.Chapter4.item23;

public class Circle extends FigureTrue{

    final double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }

}
