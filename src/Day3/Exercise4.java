package Day3;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a byte ");
        byte myByte = scanner.nextByte();
        short myShort = myByte;
        System.out.println("Input Byte is -> " + myByte);
        System.out.println("Short is -> " + myShort);
        int myInt = myShort;
        System.out.println("Int is -> " + myInt);
        long myLong = myInt;
        System.out.println("Long is -> " + myShort);
        float myFloat = myLong;
        System.out.println("Float is -> " + myFloat);
        double myDouble = myFloat;
        System.out.println("Double is -> " + myDouble);

    }
}
