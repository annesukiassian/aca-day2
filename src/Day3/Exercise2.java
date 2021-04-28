package Day3;

public class Exercise2 {
    public static void main(String[] args) {
        String myString = "Hello World";
        String myString2 = "Pineapple";
        char lastChar = myString.charAt(myString.length() - 2);
        char lastChar2 = myString2.charAt(myString2.length() - 2);
        boolean flag = lastChar == lastChar2;
        System.out.println(true);
    }
}
