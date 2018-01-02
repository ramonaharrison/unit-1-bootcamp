/**
 * Created by Muaadh Melhi
 */

/**
 * Write a program that creates three variables: an int, a double, and a String.
 *Put the value 113 into the first variable, the value 2.71828 into the second,
 *and the value "Computer Science" into the third. It does not matter what you call the variables... this time.
 *Then, display the values of these three variables on the screen, one per line.
 *
 This is room # 113
 e is close to 2.71828
 I am learning a bit about Computer Science
 */
public class Variables {
    private static int roomNumber = 113;
    private static double eValue = 2.71828;
    private static String subject = "Computer Science";

    public static void main(String args[]) {

        System.out.println("This is room # " + roomNumber +
                "\ne is close to " + eValue +
                "\nI am learning a bit about Computer Science " + subject);
        System.out.println(isOdd(4) + " " + isOdd(3) + " " + isOdd(19));
        printHelloWorld();
        System.out.println(greatestCommonFactor(25, 5));
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    private static void printHelloWorld() {
        System.out.println("Hello My World 2018 !");
    }

    public static int greatestCommonFactor(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        return greatestCommonFactor(b, a % b);
    }


}
