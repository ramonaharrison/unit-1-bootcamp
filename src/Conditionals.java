/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    public static void main(String args[]) {

//    ================================================ ####1 ==================================================

//  1. Write a method `isOdd` that takes in an `int` n. Returns a `true` if n is odd, and `false` otherwise.
        System.out.println(isOdd(20));

//    ================================================ ####2 ==================================================

//  2. Write a method `isMultipleOfThree` that takes in an `int` n. Returns `true` if n is a multiple of three, and `false` otherwise.
        System.out.println(isMultipleOfThree(4));

//    ================================================ ####3 ==================================================

//  3. Write a method `isOddAndIsMultipleOfThree` that takes in an `int` n. Returns `true` if n is both odd and a multiple of three, and false otherwise.
        System.out.println(isOddAndIsMultipleOfThree(9));

//    ================================================ ####4 ==================================================

//  4. Write a method `isOddAndIsMultipleOfThree2` - if you used `isOdd` and `isMultipleofThree` in your last solution, don't use it this time. If you did not, write this method building on your last methods.
        System.out.println(isOddAndIsMultipleOfThree2(6));

//    ================================================ ####5 ==================================================

//  5. Write a method `fizzMultipleofThree` that takes in an `int` n and prints "Fizz" if n is a multiple of three, and prints n otherwise.
        fizzMultipleofThree(6);

//    ================================================ ####5 ==================================================

//  5. Write a method that takes in a `Person` and returns `true` if the person is from London, and `false` otherwise.
        Person person = new Person();
        person.setCity("London");
        System.out.println(isFromLondon(person));

//    ================================================ ####6 ==================================================

//  6. Write a method that takes in a `Person` and prints the name if the person has a name longer than 5 characters, and otherwise prints "Name is too short."
        person.setName("Isco");
        nameLength(person);

//    ================================================ ###Exercises++ ==================================================

//    ================================================ ####1. Cigar Party ==================================================

//    When squirrels get together for a party, they like to have cigars. A squirrel party is successful
//    when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
//    there is no upper bound on the number of cigars. Write a method called `cigarParty` that takes an `int`
//    (the number of cigars) and `boolean` (whether or not it is the weekend) as parameters, and returns `true`
//    if the party with the given values is successful, or `false` otherwise.
        int cigarsNumber = 100;
        boolean isWeekend = false;
        System.out.println(cigarParty(cigarsNumber, isWeekend));

//    ================================================ ####2. Caught Speeding ==================================================

//    You are driving a little too fast, and a police officer stops you. Write code to compute the result,
//    encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
//    If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it
//    is your birthday -- on that day, your speed can be 5 higher in all cases.
        System.out.println(caughtSpeeding(65, true));

//    ================================================ ####3. Alarm Clock ==================================================

//    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
        System.out.println(alarmClock(5, false));

//    ================================================ ####4. Lottery Ticket ==================================================

//    ####4. Lottery Ticket
//    You have a green lottery ticket, with `int`s a, b, and c on it. If the numbers are all different from each other,
//    the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same,
//    the result is 10. Write a method that takes 3 `int`s as parameters and returns the correct result.
        System.out.println(greenTicket(2, 2, 3));

//    ================================================ ####5. Blackjack ==================================================

//    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
//    Return 0 if they both go over.
        System.out.println(blackjack(19, 21));

//    ================================================ ####6. Evenly Spaced ======================================================

//    Given three ints, a b c, one of them is small, one is medium and one is large.
//    Return true if the three values are evenly spaced, so the difference between small and
//    medium is the same as the difference between medium and large.
        System.out.println(evenlySpaced(4, 6, 3));

//    ========================================================== END ================================================


    }

    public static boolean evenlySpaced(int a, int b, int c) {
        if ((a - b) == (b - c) || (a - c) == (c - b) || (a - b) == (c - a)) {
            return true;
        } else {
            return false;
        }
    }

    public static int blackjack(int a, int b) {
        if (a > 21) {
            if (b > 21) {
                return 0;
            }
            return b;
        }
        if (a < b && b <= 21) {
            return b;
        }
        return a;
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b) {
            if (b == c) {
                return 20;
            }
            return 10;
        }
        if (a == c || b == c) {
            return 10;
        }
        return 0;
    }

    public static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day == 0 || day == 6) {
                return "off";
            }
            return "10:00";
        } else {
            if (day == 0 || day == 6) {
                return "10:00";
            }
            return "7:00";
        }
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5; //  diff limit is higher now
        }
        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        } else if (cigars >= 40 && cigars <= 60) {
            return true;
        } else {
            return false;
        }
    }

    private static void nameLength(Person person) {
        if (person.getName().toString().length() > 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short.");
        }
    }

    private static boolean isFromLondon(Person person) {
        if (person.getCity().toString().equals("London")) {
            return true;
        } else {
            return false;
        }
    }

    private static void fizzMultipleofThree(int number) {
        if (isMultipleOfThree(number)) {
            System.out.println("Fizz");
        } else {
            System.out.println(number);
        }
    }

    private static boolean isOddAndIsMultipleOfThree2(int number) {
        if (number % 2 == 0 && number % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isOddAndIsMultipleOfThree(int number) {
        if (isOdd(number) && isMultipleOfThree(number)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isMultipleOfThree(int number) {
        if (number % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isOdd(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
