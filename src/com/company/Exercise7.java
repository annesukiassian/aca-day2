package com.company;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter byte");
        byte b = scanner.nextByte();
        System.out.println("Enter short");
        short c = scanner.nextShort();
        System.out.println("Enter int");
        int a = scanner.nextInt();
        System.out.println("Average of them is -> " + (b + c + a) / 3);
        System.out.println("Product of them is -> " + (b * c * a));
    }
}
