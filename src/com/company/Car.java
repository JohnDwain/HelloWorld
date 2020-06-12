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
        if(ferrari.isNew == true)
            seat.condition = "New";
        else
            seat.condition = "Occasion";
        System.out.println(ferrari.isNew);
        System.out.println(ferrari.condition);
        System.out.println(ferrari.PS);
        seat.testDrive();
    }
}
