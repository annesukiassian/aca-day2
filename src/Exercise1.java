import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your number");
        int yourMinutes = scanner.nextInt();
        int remainingMinutes = yourMinutes % 60;
        int hour = yourMinutes / 60;

        System.out.println(hour + " hours " + remainingMinutes + " minutes");
    }
}
