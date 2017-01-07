import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    private void printOneToTen() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    private void printOneToTenB() {
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }

    private void printUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    private void printTwoAndUpToN(int n) {
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private void printSumFrm1Thru10() {
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private void printSumFrm1ThruN(int n) {
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    private void printSumFrm1ThruThousand() {
        printSumFrm1ThruN(1000);
    }

    private void printStringNx(int n, String s) {
        if (n < 0) {
            System.out.println("\"\"");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        }
    }

    private void printStringConcat(int n, String s) {
        if (n < 0) {
            System.out.println("\"\"");
        } else {
            String output = "";
            for (int i = 0; i < n; i++) {
                output += s;
            }
            System.out.println(output);
        }
    }

    private void printTenFibNum() {
        int sum;
        int n1 = 1;
        int n2 = 1;

        for (int i = 0; i < 10; i++) {
            if (i < 2) {
                System.out.println(n1);
            } else {
                sum = n1 + n2; // 2  3  5
                n1 = n2; // 1  2  3
                n2 = sum; // 2  3  5
                System.out.println(sum); // 2  3
            }
        }
    }

    private int TotalOfTenFibNum() {
        int sum;
        int total = 0;
        int n1 = 1;
        int n2 = 1;

        for (int i = 0; i < 10; i++) {
            if (i < 2) {
                total += n1;
            } else {
                sum = n1 + n2; // 2  3  5
                n1 = n2; // 1  2  3
                n2 = sum; // 2  3  5
                total += sum;
            }
        }
        return total;
    }

    private int TotalofNFibNum(int n) {
        int total = 0;
        int sum;
        int n1 = 1;
        int n2 = 1;

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                total += n1;
            } else {
                sum = n1 + n2; // 2  3  5
                n1 = n2; // 1  2  3
                n2 = sum; // 2  3  5
                total += sum;
            }
        }
        return total;
    }

    private int sumNumbers(String s) {
        List<String> digitChars = new ArrayList<>();
        int sum = 0;
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num += s.charAt(i);
                if (i == s.length() - 1) {
                    digitChars.add(num);
                }
            } else {
                if (num.length() != 0) {
                    digitChars.add(num);
                    num = "";
                }
            }
        }

        if (!digitChars.isEmpty()) {
            for (String digitChar : digitChars) {
                sum += Integer.parseInt(digitChar);
            }
        }
        return sum;
        /*int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            String num = "";
            if (Character.isDigit(s.charAt(i))) {
                num += s.charAt(i);
                int skip = 0;
                for (int p = 1; (i + p) < s.length() && Character.isDigit(s.charAt(i + p)); p++) {
                    num += s.charAt(i + p);
                    skip = p;
                }
                sum += Integer.parseInt(num);
                i += skip;
            }
        }
        return sum;*/
    }

    public static void main(String args[]) {
        Loops loops = new Loops();

        // Exercise 1
//    loops.printOneToTen();

        // Exercise 2
//    loops.printOneToTenB();

        // Exercise 3
//    loops.printUpToN(5);

        // Exercise 4
//    loops.printTwoAndUpToN(20);

        // Exercise 5
//        loops.printSumFrm1Thru10();

        // Exercise 6
//        loops.printSumFrm1ThruN(10);

        // Exercise 7
//        loops.printSumFrm1ThruN(1000);
//        loops.printSumFrm1ThruThousand();

        // Exercise 8
//        loops.printStringNx(-2, "dos");
//        loops.printStringNx(5, "cinco");

        // Exercise 9
//        loops.printStringConcat(5, "rusrs");

        // Exercise 10
//        loops.printTenFibNum();

        // Exercise 11
//        System.out.println(loops.TotalOfTenFibNum());

        // Exercise 12
//        System.out.println(loops.TotalofNFibNum(11));

        // Exercise ++
        // Exercise 1

        System.out.println(loops.sumNumbers("abc123xyz"));
        System.out.println(loops.sumNumbers("aa11b33"));
        System.out.println(loops.sumNumbers("7 11"));
        System.out.println(loops.sumNumbers("3jk543j2j2"));
        System.out.println(loops.sumNumbers("899sda77a6a6a"));
        System.out.println(loops.sumNumbers("      "));
        System.out.println(loops.sumNumbers("dafs"));
    }
}
