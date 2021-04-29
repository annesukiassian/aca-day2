package Day4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of your breaths");
        int lungsNumber = scanner.nextInt();

        if (lungsNumber == 0) {
            System.out.println("You are dead");
        } else if (lungsNumber < 0) {
            System.out.println("You entered negative number");
        } else if (lungsNumber < 30) {
            System.out.println("You are doing well");
        } else if (lungsNumber < 50) {
            System.out.println("Good job");
        } else if (lungsNumber < 70) {
            System.out.println("Go check your health");
        } else if (lungsNumber < 98) {
            System.out.println("Get medications");
        } else if (lungsNumber > 98) {
            System.out.println("Quarantine");
        }
    }

}
