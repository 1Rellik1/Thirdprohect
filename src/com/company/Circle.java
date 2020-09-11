package com.company;

public class Circle {
    private double radius;
    private double square;
    private double circleLength;

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public double getSquare() {
        return square;
    }

    public double getCircleLength() {
        return circleLength;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void findSquare(){
        square=Math.PI*Math.pow(radius,2);
    }
    public void findLength(){
        circleLength=2*Math.PI*radius;
    }
}
