import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    public static void main(String args[]) {

//    ================================================ ####1. Calculate Square ======================================================

//    Write a method called `calculateSquare` that takes an int as a parameter and returns the square of that integer.
        System.out.println(calculateSquare(4));

//    ================================================ ####2. Calculate Square Root ======================================================

//    Write a method called `calculateSquareRoot` that takes an int as a parameter and returns the square root of that integer.
        System.out.println(calculateSquareRoot(16));

//    ================================================ ####3. toLowerCase======================================================

//    Write a method called `toLowerCase` that takes a String as a parameter and returns the String in lower case.
        System.out.println(toLowerCase("HELLO"));

//    ================================================ ####4. isMultiple ======================================================

//  Write a method called `isMultiple` that takes 2 int parameters and determines if the second is a multiple of the first.
        System.out.println(isMultiple(10, 4));

//    ================================================ ####5. Pretty Integer ======================================================

//  Write a method called `prettyInteger` that takes an int as a parameter and prints the integer surrounded by asterisks with the length of each side equal to the given integer.
        prettyInteger(10);

//    ================================================ ####6. Random ======================================================

//   Write a method called `random` that takes 2 ints as parameters and returns a random int within that range.
        System.out.println(random(10, 20));

    }

    private static int random(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    private static void prettyInteger(int num1) {
        char asterisks = '*';
        String appending = "";
        for (int i = 0; i < num1; i++) {
            appending += asterisks;
        }
        System.out.println(appending + num1 + appending);
    }

     static boolean isMultiple(int num1, int num2) {

        if (num2 % num1 == 0) {
            return true;
        } else {
            return false;
        }

    }

    private static String toLowerCase(String hello) {

        return hello.toLowerCase();
    }

    private static int calculateSquareRoot(int i) {
        double num = i;
        return (int) Math.sqrt(i);
    }

    private static int calculateSquare(int num) {
        return num * num;
    }

}

