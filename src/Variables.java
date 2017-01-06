/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {
    private static int intVariable = 113;
    private static double doubleVariable = 2.71828;
    private static String stringVariable = "Computer Science";

  public static void main (String args[]) {
      System.out.println("This is room # " + intVariable +
                        "\ne is close to " + doubleVariable +
                        "\nI am learning a bit about " + stringVariable);

      System.out.println(isOdd(3) + " " + isOdd(2) + " " + isOdd(25));

      printHelloWord();

      System.out.println(greatestCommonFactor(8, 36));

  }

  public static boolean isOdd(int number) {
      return number % 2 == 1;
  }

  public static void printHelloWord() {
      System.out.println("Hello, world!");
  }

  public static int greatestCommonFactor(int a, int b) {
      if (a == 0 || b == 0) {
          return a + b;
      }
      return greatestCommonFactor(b, a % b);
  }
}
