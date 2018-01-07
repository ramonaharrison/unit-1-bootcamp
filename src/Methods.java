/**
 * Created by Muaadh Melhi.
 */
import java.util.Random;

public class Methods {
  public static void main(String args[]) {
    System.out.println(calculateSquare(2));
    System.out.println(calculateSquareRoot(24));
    System.out.println(toLowerCase("Hello, World!"));
    System.out.println(isMultiple(5, 101));
    prettyInteger(4);
    System.out.println(random(1, 100));
  }


  private static int calculateSquare(int number) {
    return number * number;
  }

  private static double calculateSquareRoot(int num) {
    return Math.sqrt(num);
  }

  private static String toLowerCase(String str) {
    return str.toLowerCase();
  }

  private static boolean isMultiple(int a, int b) {
    return b % a == 0;
  }

  private static void prettyInteger(int asterisksNumber) {
    String asterisks = "";
    if (asterisksNumber > 0) {
      for (int i = 0; i < asterisksNumber; i++) {
        asterisks += "*";
      }
    }
    System.out.println(asterisks + " " + asterisksNumber + " " + asterisks);
  }

  private static int random(int min, int max) {
    Random random = new Random();
    return random.nextInt((max - min) + 1) + min;
  }
}