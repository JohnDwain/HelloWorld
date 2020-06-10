package com.company;

import java.sql.SQLOutput;

public class Car {
    String color;
    int PS;
    boolean isNew;
    String condition;

    public Car(String carColor, int carPS, boolean carIsNew, String carCondition){
        color = carColor;
        PS = carPS;
        isNew = carIsNew;
        condition = carCondition;
    }

    public void testDrive(){
        System.out.println("Starting Engine");
        System.out.println("Vroom Vroom");
    }

    public static void main(String[] args){
        Car seat = new Car("grey", 300, false, "");
        Car ferrari = new Car("red", 600, true, "");
        if(seat.isNew == true)
            seat.condition = "New";
        else
            seat.condition = "Occasion";
        System.out.println(seat.isNew);
        System.out.println(seat.condition);
        System.out.println(ferrari.PS);
        seat.testDrive();
    }
}
