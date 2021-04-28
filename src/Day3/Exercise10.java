package Day3;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'n';
        char c = 'n';
        char d = 'a';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth ");
        int myAge = scanner.nextInt();
        String myName = "" + a + b + c + d;
        System.out.println("Your Name and Date of birth is -> " + myName + " " + myAge);
    }
}
