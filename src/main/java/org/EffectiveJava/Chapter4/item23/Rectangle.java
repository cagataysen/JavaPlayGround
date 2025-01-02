package org.EffectiveJava.Chapter4.item23;

public class Rectangle extends FigureTrue{

    final double length;
    final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    double area() {
        return length * width;
    }
}
