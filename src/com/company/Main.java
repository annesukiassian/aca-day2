package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //exercise 2
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Print your number");
        int yourMinutes = scanner.nextInt();
        int remainingMinutes = yourMinutes % 60;
        int hour = yourMinutes/ 60;
        System.out.println(hour + " hours " + remainingMinutes + " minutes");*/

        //exercise 3
        /*int sumOdd = 1 + 3 + 5 + 7;
        int sumEven = 2 + 4 + 6 + 8;*/

        //exercise 4
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber= scanner.nextInt();
        System.out.println(firstNumber*secondNumber);*/

        //exercise 5
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber= scanner.nextInt();
        System.out.println(firstNumber%secondNumber);*/

        //exercise 6
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum of 3 numbers is " + sum);
        System.out.println("The difference of 3 numbers is " + (firstNumber - secondNumber - thirdNumber));
        System.out.println("The average of 3 numbers is " + sum / 3);*/

        //exercise 7
        /*int triangleBase = 8;
        int triangleHeight = 10;
        System.out.println("Area of the triangle is " + (triangleHeight*triangleBase));
        int squareHeight = 5;
        System.out.println("Area of the square is " + (5*5));
        int rectangleHeight = 6;
        int rectangleWidth=7;
        System.out.println("Area of the square is " + (rectangleWidth*rectangleHeight));*/

        //exercise 8
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter byte");
        byte b = scanner.nextByte();
        System.out.println("Enter short");
        short c = scanner.nextShort();
        System.out.println("Enter int");
        int a = scanner.nextInt();
        System.out.println("Average of them is -> " + (b + c + a) / 3);
        System.out.println("Product of them is -> " + (b * c * a));*/

        //exercise 9
        /*int n = 10;
        int secondN = 15;
        int sum = 3 * n * n - 12 * n;
        int secondSum = 3 * secondN * secondN - 12 * secondN;
        System.out.println("n=10, Sum is -> " + sum);
        System.out.println("n=10, Sum is -> " + secondSum);*/

        //exercise 10
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number");
        int ourNumber = scanner.nextInt();
        System.out.println(ourNumber%10);*/

        //exercise 11
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println(a % b);*/

        //exercise 12
        /*Random random = new Random();
        System.out.println(random.nextInt());*/

        //exercise 13
        /*Random random =new Random();
        System.out.println(random.nextInt(15));*/

        //exercise 14
        /*Random random = new Random();
        System.out.println(random.nextInt(30 - 15) + 15);*/

        //exercise 15
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean flag = number % 2 == 1;
        System.out.println(flag);
*/

        //exercise 16
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number =scanner.nextInt();
        System.out.println("The second number is -> " + (number/10%10));*/

        //exercise 17
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number =scanner.nextInt();
        System.out.println("The second number is -> " + (number/100));*/

        //exercise 18
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println("The sum of 3 digits is -> " + (number / 100 + number / 10 % 10 + number % 10));*/

        //exercise 19
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        int additionalNumber = secondNumber;
        secondNumber = firstNumber;
        firstNumber = additionalNumber;
        System.out.println("First number is -> "+ firstNumber + " Second number is -> " +secondNumber);*/
    }
}
