import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    public static void main(String args[]) {
        System.out.println(calculateSquare(3));
        System.out.println(calculateSquareRoot(25));
        System.out.println(toLowerCase("PizZA"));
        System.out.println(isMultiple(5, 101));
        prettyInteger(9);
        System.out.println(random(1, 100));
    }

    public static int calculateSquare(int number) {
        return number * number;
    }

    public static int calculateSquareRoot(int number) {
        return (int) Math.sqrt(number);
    }

    public static String toLowerCase(String text) {
        return text.toLowerCase();
    }

    public static boolean isMultiple(int a, int b) {
        return b % a == 0;
    }

    public static void prettyInteger(int number) {
        String asterisk = "";
        for (int i = 0; i < number - 1; i++) {
            asterisk += "*";
        }
        System.out.println(asterisk + " " + number + " " + asterisk);
    }

    public static int random(int a, int b) {
        Random random = new Random();
        return random.nextInt(b - a) + a;
    }

}
