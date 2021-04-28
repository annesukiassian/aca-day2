package Day3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a long");
        long myLong = scanner.nextLong();
        System.out.println("Enter a new long");
        long myLong2 = scanner.nextLong();
        String firstString = String.valueOf(myLong);
        String secondString = String.valueOf(myLong2);
        boolean flag = (firstString.charAt(firstString.length()/2)) != (secondString.charAt(secondString.length()/2));
        System.out.println(flag);
    }
}
