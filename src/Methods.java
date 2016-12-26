import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    private int calculateSquare(int length) {
        return length * length;
    }

    private int calculateSquareRoot(int square) {
        return (int) Math.sqrt(square);
    }

    private String toLowerCase(String input) {
        return input.toLowerCase();
    }

    private boolean isMultiple(int a, int b) {
        return b % a == 0;
    }

    private void prettyInteger(int amount) {
        String prettyString = "";
        for (int i = 0; i <= amount * 2; i++) {
            if (i == amount) {
                prettyString += " " + amount + " ";
            } else {
                prettyString += "*";
            }
        }
        System.out.println(prettyString);
    }

    private int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public static void main(String args[]) {

        Methods methods = new Methods();
        System.out.println(methods.calculateSquare(3));
        System.out.println(methods.calculateSquareRoot(9));
        System.out.println(methods.toLowerCase("MERRY CHRISTMAS"));
        System.out.println(methods.isMultiple(2, 4));
        methods.prettyInteger(10);
        System.out.println(methods.random(5, 12));
    }
}
