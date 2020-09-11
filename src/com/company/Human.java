package com.company;

import java.util.Scanner;
import java.util.logging.Level;

public class Human {
    private double Height;
    private Head head;
    private Body body;
    private Leg right,left;
    private Hand leftHand,rightHand;


    public Human() {
        Scanner scan= new Scanner(System.in);
        this.head= new Head();
        System.out.println("Введите высоту головы");
        double forAll;
        forAll= scan.nextDouble();
        this.head.setHeadHeight(forAll);
        System.out.println("Введите высоту туловища");
        this.body=new Body();
        forAll=scan.nextDouble();
        this.body.setBodyLength(forAll);
        this.left=new Leg();
        this.right= new Leg();
        System.out.println("Введите высоту ноги");
        forAll=scan.nextDouble();
        this.left.setLegLength(forAll);
        this.right.setLegLength(forAll);
        this.rightHand=new Hand();
        this.leftHand=new Hand();
        System.out.println("Введите длинну руки");
        forAll= scan.nextDouble();
        this.rightHand.setHandLength(forAll);
        this.leftHand.setHandLength(forAll);
    }
    public void humanHeight(){
        Height=head.getHeadHeight()+body.getBodyLength()+ right.getLegLength();
    }

    public double getHeight() {
        return Height;
    }
}
