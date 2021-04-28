package Day2;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        int additionalNumber = secondNumber;
        secondNumber = firstNumber;
        firstNumber = additionalNumber;
        System.out.println("First number is -> " + firstNumber + " Second number is -> " + secondNumber);
    }
}
