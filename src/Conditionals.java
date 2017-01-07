/**
 * Created by alexandraqin on 4/14/15.
 */

import java.util.Arrays;

public class Conditionals {
    static Person sam = new Person("Sam");
    static Person david = new Person("David");

    public static void main(String args[]) {
        System.out.println(isOdd(5));
        System.out.println(isMultipleofThree(15));
        System.out.println(isOddAndIsMultipleOfThree(27));
        System.out.println(isOddAndIsMultipleOfThree2(45));
        fizzMultipleofThree(9);
        sam.setCity("London");
        david.setCity("Paris");
        System.out.println(isFromLondon(sam));
        System.out.println(isFromLondon(david));
        nameLengthAtLeast5(sam);
        nameLengthAtLeast5(david);
        System.out.println(evenlySpaced(6, 2, 8));
    }

    public static boolean isOdd(int n) {
        if (n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isMultipleofThree(int n) {
        if (n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        if (n % 2 == 1 && n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOddAndIsMultipleOfThree2(int n) {
        if (isOdd(n) && isMultipleofThree(n)) {
            return true;
        } else {
            return false;
        }
    }

    public static void fizzMultipleofThree(int n) {
        if (isMultipleofThree(n)) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }

    // Person Questions:

    public static boolean isFromLondon(Person person) {
        if (person.getCity() == "London") {
            return true;
        } else {
            return false;
        }
    }

    public static void nameLengthAtLeast5(Person person) {
        if (person.getName().length() > 4) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short.");
        }
    }

    // ++ Questions

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return ((isWeekend && cigars > 39) || (!isWeekend && cigars > 39 && cigars < 61));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int smlMax = 60;
        int bigMax = 80;
        if (isBirthday) {
            smlMax = 65;
            bigMax = 85;
        }
        if (speed > bigMax) {
            return 2;
        } else if (speed > smlMax && speed <= bigMax) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String alarmClock(int day, boolean vacation) {
        String wkDay = "7:00";
        String wkEnd = "10:00";
        if (vacation) {
            wkDay = "10:00";
            wkEnd = "off";
        }
        if (day > 0 && day < 6) {
            return wkDay;
        } else {
            return wkEnd;
        }
    }

    public static int lotteryTicket(int a, int b, int c) {
        if (a == b && b == c && c == a) {
            return 20;
        } else if (a == b || b == c || c == a) {
            return 10;
        } else {
            return 0;
        }
    }

    public static int blackjack(int a, int b) {
        if (a > b && a < 22 || a < 22 && b > 21) {
            return a;
        }
        if (b > a && b < 22 || b < 22 && a > 21) {
            return b;
        }
        return 0;
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);
        if (arr[1] - arr[0] == arr[2] - arr[1]) {
            return true;
        }
        return false;
    }
}
