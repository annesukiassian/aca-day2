package Day3;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yourTemp = scanner.nextDouble();
        System.out.println("Input Fahrenheit temperature is -> " + yourTemp);
        double celsiusTemp = ((yourTemp - 32) * 5 / 9);
        System.out.println("Celsius double is -> " + celsiusTemp);
        float floatTemp = (float) celsiusTemp;
        System.out.println("Celsius float is -> " + floatTemp);
        int intTemp = (int) floatTemp;
        System.out.println("Celsius int is -> " + intTemp);

    }
}
