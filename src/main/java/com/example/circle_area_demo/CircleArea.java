package com.example.circle_area_demo;

public class CircleArea {
	public static double calculateArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double r = 5;
        System.out.println("Radius : " + r);
        System.out.println("Area   : " + calculateArea(r));
    }
}


