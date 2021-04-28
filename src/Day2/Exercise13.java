package Day2;

import java.util.Random;

public class Exercise13 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(30 - 15) + 15);
    }
}
