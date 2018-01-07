/**
 * Created by alexandraqin on 4/14/15.
 */
import java.util.Arrays;

public class Conditionals {
  private static Person moaz = new Person("moaz");
  private static Person seFooo = new Person("seFooo");

  public static void main(String args[]) {
    System.out.println(isOdd(3));
    System.out.println(isMultipleOfThree(7));
    System.out.println(isOddAndIsMultipleOfThree(9));
    System.out.println(isOddAndIsMultipleOfThree2(12));
    fizzMultipleofThree(6);
    moaz.setCity("London");
    seFooo.setCity("Dubai");
    System.out.println(isFromLondon(moaz));
    System.out.println(isFromLondon(seFooo));
    nameMoreThan5(moaz);
    nameMoreThan5(seFooo);
    System.out.println(cigarParty(47, false));
    System.out.println(caughtSpeeding(50, true));
    System.out.println(alarmClock(0, true));
    System.out.println(lotteryTicket(0, 10, 0));
    System.out.println(blackjack(19, 23));
    System.out.println(evenlySpaced(4, 2, 6));
  }


  private static boolean isOdd(int number) {
    return number % 2 == 1;
  }

  private static boolean isMultipleOfThree(int input) {
    return input % 3 == 0;
  }

  private static boolean isOddAndIsMultipleOfThree(int i) {
    return isOdd(i) && isMultipleOfThree(i);
  }

  private static boolean isOddAndIsMultipleOfThree2(int i) {
    return (i % 2 == 1) && (i % 3 == 0);
  }

  private static void fizzMultipleofThree(int i) {
    if (isMultipleOfThree(i)) {
      System.out.println("Fizz");
    } else {
      System.out.println(i);
    }
  }

  // Person Question
  private static boolean isFromLondon(Person person) {
    if (person.getCity() == "London") {
      return true;
    } else {
      return false;
    }
  }

  private static void nameMoreThan5(Person person) {
    if (person.getName().length() > 5) {
      System.out.println(person.getName());
    } else {
      System.out.println("Name is too short.");
    }
  }

  //Exercises++
  private static boolean cigarParty(int cigarsNumber, boolean isWeekend) {
    return ((isWeekend && cigarsNumber >= 40) || (!isWeekend && (cigarsNumber >= 40 && cigarsNumber <= 60)));
  }

  private static int caughtSpeeding(int yourSpeed, boolean isyourBirthday) {
    int miniSpeed = 60;
    int maxSpeed = 80;
    if (isyourBirthday) {
      miniSpeed = 65;
      maxSpeed = 85;
    }
    if (yourSpeed > maxSpeed) {
      return 2;
    } else if (yourSpeed > miniSpeed && yourSpeed <= maxSpeed) {
      return 1;
    } else {
      return 0;
    }
  }

  private static String alarmClock(int dayNumber, boolean isVaction) {
    String wkDayAlram = "7:00";
    String wkEndAlram = "10:00";
    if (isVaction) {
      wkDayAlram = "10:00";
      wkEndAlram = "off";
    }
    if (dayNumber == 0 || dayNumber == 6) {
      return wkEndAlram;
    } else {
      return wkDayAlram;
    }
  }

  private static int lotteryTicket(int a, int b, int c) {
    if (a != b && b != c && a != c) {
      return 0;
    } else if (a == b && b == c) {
      return 20;
    } else {
      return 10;
    }
  }

  private static int blackjack(int a, int b) {
    if (a > b && a < 22 || a < 22 && b > 21) {
      return a;
    }
    if (b > a && b < 22 || b < 22 && a > 21) {
      return b;
    }
    return 0;
  }

  private static boolean evenlySpaced(int a, int b, int c) {
    int[] numbers = {a, b, c};
    Arrays.sort(numbers);
    if (numbers[1] - numbers[0] == numbers[2] - numbers[1]) {
      return true;
    } else {
      return false;
    }
  }
}
