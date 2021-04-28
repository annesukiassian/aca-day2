package Day3;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the circle radius ");
        double yourRadius = scanner.nextDouble();
        double circlePerimeter = 2 * yourRadius * Math.PI;
        System.out.println("The perimeter is -> " + circlePerimeter);
        double circleArea = Math.pow(yourRadius, 2) * Math.PI;
        System.out.println("The area is-> " + circleArea);
    }
}
