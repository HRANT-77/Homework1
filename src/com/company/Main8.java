package com.company;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = scanner.nextDouble();
        double meter = inch * 0.0254;
        System.out.print(inch + " inch is " + meter + " meters");
    }
}
