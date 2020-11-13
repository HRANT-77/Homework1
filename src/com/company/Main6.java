package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius = ");
        double r = scanner.nextDouble();
        double P = Math.PI;
        double Perimeter = 2 * P * r;
        double Area = P * Math.pow(r, 2);
        System.out.println("Perimeter is - " + Perimeter);
        System.out.println("Area is - " + Area);
    }
}
