package Day2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum of 3 numbers is " + sum);
        System.out.println("The difference of 3 numbers is " + (firstNumber - secondNumber - thirdNumber));
        System.out.println("The average of 3 numbers is " + sum / 3);
    }
}
