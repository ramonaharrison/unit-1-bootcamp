/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {
        printOneToTenA();
        printOneToTenB();
        printOneToN(25);
        printEvenToN(33);
        printAddOneToTen();
        printAddOneToN(10000);
        printStringNTimes(10, "Apple");
        printConcatStringNTimes(10, "Orange");
        fib1();
        fib2();
        fib3(10);
    }

    public static void printOneToTenA() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void printOneToTenB() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 11);
    }

    public static void printOneToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void printEvenToN(int n) {
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    public static void printAddOneToTen() {
        int total = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println(total += i);
        }
    }

    public static void printAddOneToN(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(total += i);
        }
    }

    public static void printStringNTimes(int n, String s) {
        if (n < 0) {
            System.out.println("");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println(s);
            }
        }
    }

    public static void printConcatStringNTimes(int n, String s) {
        String newS = "";
        if (n < 0) {
            System.out.println(newS);
        } else {
            for (int i = 1; i <= n; i++) {
                newS += s;
            }
        }
        System.out.println(newS);
    }

    public static void fib1() {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println(n2);
        for (int i = 2; i <= 10; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void fib2() {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int total = n2;
        for (int i = 2; i <= 10; i++) {
            n3 = n1 + n2;
            total = total + n3;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(total);
    }

    public static void fib3(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int total = n2;
        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            total = total + n3;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(total);
    }
}
