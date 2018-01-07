import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {
        printoneToTen();
        printOneToTenA();
        printOneToN(17);
        printEvenNumberToN(7);
        printSumOneToTen();
        printSumOneToN(200);
        printSumOneToN(10000);
        printStringNTimes(10, "Yemen");
        printConcatenatedStringNTimes(10, "Yemen");
        fibFirstTen();
        fibSumFirstTen();
        fibSumFirstTenForN(3);
        System.out.println(sumNumbers("abc12,3-4-xyz"));
        System.out.println(notReplace("This is right"));
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        digits();


    }

    //1
    private static void printoneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
    }

    //2
    private static void printOneToTenA() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    //3
    private static void printOneToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);

        }
    }

    //4
    private static void printEvenNumberToN(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }

    //5
    private static void printSumOneToTen() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //6
    private static void printSumOneToN(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //7
    private static void printStringNTimes(int n, String s) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        } else {
            System.out.println("");
        }
    }

    //8
    private static void printConcatenatedStringNTimes(int n, String s) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(s);
            }
        } else {
            System.out.println("");
        }
    }

    //9
    private static void fibFirstTen() {
        int f1 = 0, f2 = 1, f = 0;
        for (int i = 0; i < 10; i++) {
            f = f1 + f2;
            System.out.println(f1);
            f1 = f2;
            f2 = f;
        }
    }

    //10
    private static void fibSumFirstTen() {
        int f1 = 0, f2 = 1, sum = 0;
        for (int i = 0; i < 10; i++) {
            int f = f1 + f2;
            sum += f;
            f1 = f2;
            f2 = f;
        }
        System.out.println(sum);

    }

    //11
    private static void fibSumFirstTenForN(int n) {
        int f1 = 0, f2 = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            int f = f1 + f2;
            sum += f;
            f1 = f2;
            f2 = f;
        }
        System.out.println(sum);

    }

    //###Exercises++
    //1
    private static int sumNumbers(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        return sum;

    }

    //2
    private static String notReplace(String str) {
        String result = "";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))
                    || i + 2 < len && Character.isLetter(str.charAt(i + 2))) {
                result += str.charAt(i);
            } else if (i + 1 < len && str.substring(i, i + 2).equals("is")) {
                result += "is not";
                i++;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    //3
    private static String wordEnds(String str, String word) {
        String res = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word.charAt(0)) {
                int n = i;
                for (int j = 0; j < word.length(); j++) {
                    if (str.charAt(n) == word.charAt(j)) {
                        count = 1;
                        count++;
                    }
                    n++;

                }
                if ((count == word.length()) && (i - 1 >= 0) && ((i + word.length()) <= str.length())) {
                    res = res + str.charAt(i - 1) + str.charAt(i + word.length());
                }
            }
        }
        return res;
    }

    //4
    private static List <Integer> numberPuzzle() {
        List <Integer> list = new ArrayList <>();
        for (int i = 0; i < 60; i++) {
            for (int j = 60; j < 0; j++) {
                if ((i + j == 60) && (j - i == 14)) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        return list;
    }

    //5
    private static void digits() {
        for (int i = 10; i < 100; i++) {
            String s = String.valueOf(i);
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += s.charAt(j);
            }
            System.out.println(i + ", " + s.charAt(0) + "+" + s.charAt(1) + " = " + sum);

        }
    }
}