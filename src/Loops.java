/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {

//    ================================================ ####1 ==================================================

//    1. Write a method that prints the numbers 1 through 10 using a loop.

        printNumbersForLoop();

//    ================================================ ####2 ==================================================

//    2. Write a method that prints the numbers 1 through 10 using a different kind of loop.

        printNumbersWhileLoop();

//    ================================================ ####3 ==================================================

//    3. Write a method that takes in an `int` n and prints the numbers 1 through n.

        printNTimes(9);

//    ================================================ ####4 ==================================================

//    4. Write a method that takes in an `int` n and prints the even numbers 2 through n.

        printEvenNumbers(20);

//    ================================================ ####5 ==================================================

//    5. Write a method that prints the sum of 1 through 10 using a loop.

        printSum();

//    ================================================ ####6 ==================================================

//    6. Write a method that takes in an `int` n and prints the sum of the numbers 1 through n using a loop.

        printSumN(10);

//    ================================================ ####7 ==================================================

//    7. Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.

        printSumN(10000);

//    ================================================ ####8 ==================================================

//    8. Write a method that takes in an `int` n and a `String` s and prints out s on its own line, n times.
//      If n is negative, print "".

        printString(5, "Hello");

//    ================================================ ####9 ==================================================

//    9. Modify the method to print out the string concatenated with itself n times.

        printStringConcat(5, "Hello");

//    ================================================ ####10 ==================================================

//    10. Write a method that prints the first ten Fibonnaci numbers.

        fibonnaciNum();

//    ================================================ ####11 ==================================================

//    11. Modify the method to sum the first ten Fibonnaci numbers.

        fibonnaciNumSum();

//    ================================================ ####12 ==================================================

//    12. Modify the method to take in an `int` n and sum the first n Fibonnaci numbers.

        fibonnaciSumNNum(10);

//    ************************************************ ###Exercises++ ******************************************

//    ================================================ ####1. sumNumbers =======================================

//    Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
//    A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is
//    one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

        System.out.println(sumNumbers("7 11"));

//    ================================================ ####2. Is Not ============================================

//    Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
//    The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this"
//    does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

        isNot("is test");

//    ================================================ ####3. Between Words ============================================

//    Given a string and a non-empty word string, return a string made of each char just before and just after every
//    appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may
//    be included twice if it is between two words.

        System.out.println(betweenWords("abcXY123XYijk", "XY"));

//    ================================================ ####4. Number Puzzle ===========================================

//    Use nested for loops to generate a list of all the pairs of positive two digit numbers whose sum is 60, and whose
//    difference is 14.

        numberPuzzle();

//    ================================================ ####5. Digits ==================================================

//    Use nested for loops to generate a list of all the positive two digit numbers. Display the numbers, and the sums of t
//    heir digits.

        digits();

//    ================================================ END ============================================================

    }

    private static void digits() {
        for (int i = 10; i < 40; i++) {
            for (int j = i / 10; j <= i / 10; j++) {
                int result = j + (i % 10);
                System.out.println(i + " " + j + "+" + (i % 10) + "= " + result);
            }
        }
    }

    private static void numberPuzzle() {
        for (int i = 10; i < 100; i++) {
            for (int j = 11; j < 100; j++) {
                if ((i + j) == 60 && (i - j) == 14) {
                    System.out.println(i + "--" + j);
                }
            }
        }
    }

    private static String betweenWords(String string, String word) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            char firstCharacter = word.charAt(0);
            char secondCharacter = word.charAt(1);
            if (string.charAt(i) == firstCharacter && string.charAt(i + 1) == secondCharacter) {
                if (i > 0) {
                    newString += string.charAt(i - 1);
                }
                if (i < string.length() - 2) {
                    newString += string.charAt(i + 2);
                }
            }
        }
        return newString;
    }

    private static void isNot(String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            String isNot = " not";
            newString += character;
            if (Character.isLetter(character)) {
                if (i > 2 && i < string.length() - 1) {
                    if (character == 's' && string.charAt(i - 1) == 'i' && !Character.isLetter(string.charAt(i - 2)) && !Character.isLetter(string.charAt(i + 1))) {
                        newString += isNot;
                    }
                } else if (character == 's' && string.charAt(i - 1) == 'i') {
                    newString += isNot;
                }
            }
        }
        System.out.println(newString);
    }

    private static int sumNumbers(String string) {
        int num = 0;
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            String numbers = "";
            if (Character.isDigit(letter)) {
                numbers = String.valueOf(letter);
                for (int j = i + 1; j < string.length(); j++) {
                    //System.out.println(numbers);
                    if (!Character.isDigit(string.charAt(j))) {
                        break;
                    } else {
                        numbers += string.charAt(j);
                        i = j;
                    }
                }
                num += Integer.parseInt(numbers);
            }
        }
        return num;
    }

    private static void fibonnaciSumNNum(int num) {
        int a = 0, b = 1, c, count = 0;
        System.out.print(a + ",");
        System.out.print(b + ",");
        for (int i = 2; i < num; i++) {
            c = a + b;
            count += c;
            a = b;
            b = c;
        }
        System.out.println("\n" + (count + 1));
    }

    private static void fibonnaciNumSum() {
        int a = 0, b = 1, c, count = 0;
        System.out.print(a + ",");
        System.out.print(b + ",");
        for (int i = 2; i < 10; i++) {
            c = a + b;
            count += c;
            System.out.print(c + ",");
            a = b;
            b = c;
        }
        System.out.println("\n" + (count + 1));
    }

    private static void fibonnaciNum() {
        int a = 0, b = 1, c;
        System.out.print(a + ",");
        System.out.print(b + ",");
        for (int i = 2; i < 10; i++) {
            c = a + b;
            System.out.print(c + ",");
            a = b;
            b = c;
        }
    }

    private static void printStringConcat(int a, String string) {
        if (a < 0) {
            System.out.println("");
        }
        for (int i = 0; i < a; i++) {
            string += string;
        }
        System.out.println(string);
    }

    private static void printString(int a, String string) {
        String word = "";
        if (a < 0) {
            System.out.println("");
        }
        for (int i = 0; i < a; i++) {
            word += string;
        }
        System.out.println(word);
    }

    private static void printSumN(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
            System.out.println(sum);
        }
    }

    private static void printSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
    }

    private static void printEvenNumbers(int a) {
        for (int i = 2; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void printNTimes(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printNumbersWhileLoop() {
        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }

    private static void printNumbersForLoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
