package com.company;

public class Car {
    String color;
    int PS;
    public Car(String carColor, int carPS){
        color = carColor;
        PS = carPS;
    }
    public static void main(String[] args){
        Car seat = new Car("gray", 300);
        System.out.println(seat.PS);
    }
}
