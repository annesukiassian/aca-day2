package Day3;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 32 to 127 ");
        int yourNumber = scanner.nextInt();
        char letter = (char) yourNumber;
        System.out.println("The letter of your code is -> " + letter);
    }
}
