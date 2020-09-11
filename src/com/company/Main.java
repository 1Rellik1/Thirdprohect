package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/////////////task1////////////
        Circle firstCircle=new Circle();
        double radius;
        Scanner Scan = new Scanner(System.in);
//        radius=Scan.nextDouble();
//        firstCircle.setRadius(radius);
        radius=2;
        firstCircle.findSquare();
        System.out.println(firstCircle.getSquare());

    ////////////task2//////////////////
        Human firstHuman= new Human();
        System.out.println(firstHuman.getHeight());
    }
}
