package com.company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit : ");
        double Fahr = scanner.nextDouble();
        double Cels = (Fahr - 32) / 1.8;
        System.out.println(Fahr + " degree Fahrenheit is equal to " + Cels + " in Celsius");

    }
}
