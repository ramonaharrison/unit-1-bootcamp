import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    private boolean isOddAndIsMultipleOfThree(int n) {
        return n % 2 != 0 && n % 3 == 0;
    }

    private boolean isOddAndMultipleOfThree2(int n) {
        return isOdd(n) && isMultipleOfThree(n);
    }

    private void fizzMultipleofThree(int n) {
        if (n % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }

//    Write a method that takes in a Person and returns true if the person is from London, and false otherwise.
//    Write a method that takes in a Person and prints the name if the person has a name longer than 5 characters, and
//    otherwise prints "Name is too short."

    private boolean isFromLondon(Person person) {
        return person.getCity().equalsIgnoreCase("london");
    }

    private void printNameIfLonger5(Person person) {
        int nameLength = person.getName().length();
        if (nameLength > 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short.");
        }
    }

    private boolean cigarParty(int cigarsAmt, boolean isWeekend) {
        if (isWeekend) {
            return cigarsAmt >= 40;
        } else {
            return cigarsAmt >= 40 && cigarsAmt <= 60;
        }
    }

    private int caughtSpeeding(int speed, boolean isBirthday) {
        int noTix = 0;
        int smTix = 1;
        int bgTix = 2;
        int noTixSpd = 60;
        int smTixSpd = 80;

        if (isBirthday) {
            noTixSpd += 5;
            smTixSpd += 5;
            if (speed <= noTixSpd)
                return noTix;
            else if (speed <= smTixSpd)
                return smTix;
            else
                return bgTix;
        } else {
            if (speed <= noTix)
                return noTix;
            else if (speed <= smTixSpd)
                return smTix;
            else
                return bgTix;
        }
    }

    private String alarmClock(int day, boolean onVacation) {
        if (onVacation) {
            if (day > 6)
                return "Please use 0 - 1";

            if (day == 6 || day == 0) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (day > 6)
                return "Please use 0 - 1";

            if (day == 6 || day == 0) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }


    private int lotteryTicket(int a, int b, int c) {
        if (a == b && b == c)
            return 20;
        else if (a == b || b == c || a == c)
            return 10;
        else {
            return 0;
        }
    }

    /*
    5. Blackjack

    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go
    over.

    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    blackjack(19, 22) → 19

    */
    private int blackjack(int a, int b) {
        int resultA = 21 - a;
        int resultB = 21 - b;

        if (resultA < 0 && resultB < 0)
            return 0;

        if (resultA < 0)
            return b;

        if (resultB < 0)
            return a;

        if (resultA < resultB)
            return a;
        else
            return b;
    }
/*
6. Evenly Spaced

Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are
evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

    private boolean evenlySpaced(int a, int b, int c) {
        Integer[] arr = {a, b, c};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return x - y;
            }
        });

        int resultA = arr[1] - arr[0];
        int resultB = arr[2] - arr[1];

        return resultA == resultB;
    }

    public static void main(String args[]) {
        Conditionals conditionals = new Conditionals();
        System.out.println("Is 1 odd?" + conditionals.isOdd(1));
        System.out.println("Is 6 odd?" + conditionals.isOdd(6));
        System.out.println("Is 87 odd?" + conditionals.isOdd(87));
        System.out.println("Is 208 odd?" + conditionals.isOdd(208));

        System.out.println("Is 300 a multiple of 3?" + conditionals.isMultipleOfThree(300));
        System.out.println("Is 24 a multiple of 3?" + conditionals.isMultipleOfThree(24));
        System.out.println("Is 100 a multiple of 3?" + conditionals.isMultipleOfThree(100));
        System.out.println("Is 60 a multiple of 3?" + conditionals.isMultipleOfThree(60));

        System.out.println("Is 33 odd & a multiple of 3?" + conditionals.isOddAndIsMultipleOfThree(33));
        System.out.println("Is 18 odd & a multiple of 3?" + conditionals.isOddAndMultipleOfThree2(18));

        conditionals.fizzMultipleofThree(3);
        conditionals.fizzMultipleofThree(10);
        conditionals.fizzMultipleofThree(33);
        conditionals.fizzMultipleofThree(66);

        Person person = new Person("Mika");
        person.setCity("Tokyo");
        System.out.println("Is Mika from London? " + conditionals.isFromLondon(person));
        conditionals.printNameIfLonger5(person);

        person.setName("Mikaela");
        person.setCity("London");
        System.out.println("Is this person from London?" + conditionals.isFromLondon(person));
        conditionals.printNameIfLonger5(person);

        System.out.println(conditionals.cigarParty(39, true));
        System.out.println(conditionals.cigarParty(39, false));
        System.out.println(conditionals.cigarParty(40, true));
        System.out.println(conditionals.cigarParty(40, false));
        System.out.println(conditionals.cigarParty(60, true));
        System.out.println(conditionals.cigarParty(100, false));

        System.out.println("What size tix am I getting for driving 61? " + conditionals.caughtSpeeding(61, true));

        System.out.println(conditionals.alarmClock(3, false)); // expect 7
        System.out.println(conditionals.alarmClock(0, false)); // expect 10
        System.out.println(conditionals.alarmClock(0, true)); // expect off
        System.out.println(conditionals.alarmClock(7, true)); // expect msg

        System.out.println(conditionals.lotteryTicket(1, 1, 1));
        System.out.println(conditionals.lotteryTicket(1, 2, 1));
        System.out.println(conditionals.lotteryTicket(1, 2, 2));
        System.out.println(conditionals.lotteryTicket(1, 1, 2));
        System.out.println(conditionals.lotteryTicket(1, 3, 2));

        System.out.println(conditionals.blackjack(19, 21));
        System.out.println(conditionals.blackjack(21, 19));
        System.out.println(conditionals.blackjack(19, 22));

        System.out.println(conditionals.evenlySpaced(2, 4, 6));
        System.out.println(conditionals.evenlySpaced(4, 6, 2));
        System.out.println(conditionals.evenlySpaced(4, 6, 3));

    }
}
