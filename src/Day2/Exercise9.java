package Day2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number");
        int ourNumber = scanner.nextInt();
        System.out.println(ourNumber%10);
    }
}
