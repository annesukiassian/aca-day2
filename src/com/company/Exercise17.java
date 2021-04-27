package com.company;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println("The sum of 3 digits is -> " + (number / 100 + number / 10 % 10 + number % 10));
    }
}
