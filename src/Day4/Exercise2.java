package Day4;

import java.math.MathContext;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Exercise2 {
    private static Object Math;

    public static void main(String[] args) {
        int circleRadius = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for Perimeter and Press 2 for Area");
        int yourChoice = scanner.nextInt();
        double thePerimeter = (double) (circleRadius * 2 * java.lang.Math.PI);
        double theArea = (double) ((pow(circleRadius, 2)) * java.lang.Math.PI);
        if (yourChoice == 1) {
            System.out.println("The perimeter is -> " + thePerimeter);
        } else if (yourChoice == 2) {
            System.out.println("The area is -r> " + theArea);
        }
    }
}
