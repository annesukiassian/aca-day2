import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number =scanner.nextInt();
        System.out.println("The second number is -> " + (number/100));
    }
}
