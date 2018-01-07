
/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

    public static void main(String args[]) {

//    ================================================ ####1 ==================================================

        //1. [Programming by Doing - Using Variables](https://programmingbydoing.com/a/using-variables.html)
        int firstV = 113;
        double secondV = 2.71828;
        String thirdV = "Computer Science";
        System.out.println("This is room # " + firstV);
        System.out.println("e is close to " + secondV);
        System.out.println("I am learning a bit about " + thirdV);

//    ================================================ ####2 ==================================================

        //2. Consider a method `isOdd`. What type should it return? What type(s) should it take in? Create the method signature.
        isOdd(firstV);

//    ================================================ ####3 ==================================================

        //3. Consider a method `printHelloWorld`. What type should it return? What type(s) should it take in? Create the method signature.
        printHelloWorld();

//    ================================================ ####4 ==================================================

        //4. Consider a method `greatestCommonFactor`. What type should it return? What type(s) should it take in? Create the method signature.
        greatestCommonFactor(20, 30);

    }

    public static int greatestCommonFactor(int num1, int num2) {

        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        if (num1 == num2) {
            return num1;
        }
        if (num1 > num2) {
            return greatestCommonFactor(num1 - num2, num2);
        }
        return greatestCommonFactor(num1, num2 - num1);
    }

    private static void printHelloWorld() {
        System.out.println("Hello World");

    }

    private static boolean isOdd(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

