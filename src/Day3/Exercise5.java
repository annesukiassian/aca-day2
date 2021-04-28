package Day3;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double ");
        double doubleNumber = scanner.nextDouble();
        float floatNumber = (float) doubleNumber;
        System.out.println("Double is -> " + doubleNumber);
        System.out.println("Float is -> " + floatNumber);
        long longNumber = (long) floatNumber;
        System.out.println("Long is -> " + longNumber);
        int intNumber = (int) longNumber;
        System.out.println("Int is -> " + intNumber);
        short shortNumber = (short) intNumber;
        System.out.println("Short is -> " + shortNumber);
        byte byteNumber = (byte) shortNumber;
        System.out.println("Byte is -> " + byteNumber);
    }
}
