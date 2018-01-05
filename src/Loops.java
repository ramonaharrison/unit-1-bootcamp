import java.util.HashMap;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main (String args[]) {
//    printNums();
//    printNumsWhile();
//    printNumsGiven(10);
//    printEvens(10);
//    printSumTen();
//    printSum(10000);
//    printStringNTimes(10,"hi");
//    printStringNTimesModified(10,"hi");
//    fibonnaciPrintTen();
//    fibonnaciPrintSum();
//    fibonnaciPrintN(20);
//    sumNumbers("7 11");
//    notReplace("is-is");
//    wordEnds("XY1XY","XY");
//    numberPuzzle();
//    digits();
  }

  private static void digits(){
    for (int i = 1; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.println(String.valueOf(i)+ String.valueOf(j) + ", " + i + "+" + j + " = " + (i+j));
      }
    }
  }

  private static void numberPuzzle(){
    HashMap<Integer,Integer> pairs = new HashMap<>();
    for (int i = 0; i <= 60; i++) {
      for (int j = 60; j >= 0; j--) {
        if((i + j == 60) && ((j - i == 14) || (i - j == 14))){
          pairs.put(i,j);
          break;
        }
      }
    }
    System.out.println(pairs);
  }

  private static void wordEnds(String bigWord, String smallWord) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < bigWord.length(); i++) {
      if (bigWord.substring(i,bigWord.length()).length() >= smallWord.length())
      if (bigWord.substring(i,smallWord.length()+i).equals(smallWord)){
        if (!(i == 0) && i < (bigWord.length() - smallWord.length())) {
          stringBuilder.append(bigWord.charAt(i - 1));
          stringBuilder.append(bigWord.charAt(i + smallWord.length()));
        } else if (i == 0){
          stringBuilder.append(bigWord.charAt(i + smallWord.length()));
        } else {
          stringBuilder.append(bigWord.charAt(i - 1));
        }
      }
    }
    String s = stringBuilder.toString();
    System.out.println(s);
  }

  private static void notReplace(String s){
    int i = 0;
    while (i < s.length()-1) {
      if ((i != 0)) {
        if (s.substring(i, i + 2).equals("is") && !Character.isLetter(s.charAt(i-1))) {
          s = s.substring(0, i) + "is not" + s.substring(i + 2, s.length());
        }
      } else if (s.substring(0, 2).equals("is")) {
        s = "is not" + s.substring(2, s.length());
      }
      i++;
    }
    System.out.println(s);
  }

  private static void sumNumbers(String string) {
    int sum = 0;
    string = string + " ";
    StringBuilder hold = new StringBuilder();
    for (int i = 0; i < string.length(); i++) {
      if (Character.isDigit(string.charAt(i))){
        hold.append(string.charAt(i));
      }
      if (!hold.toString().equals("") && !Character.isDigit(string.charAt(i))){
        String s = hold.toString();
        sum += Integer.parseInt(s);
        hold = new StringBuilder();
      }
    }
    System.out.println(sum);
  }

  private static void printStringNTimes(int i, String s) {
    if (i > 0) {
      for (int j = 0; j < i; j++) {
        System.out.println(s);
      }
    }else {
      System.out.println("");
    }
  }
  private static void printStringNTimesModified(int i, String s) {
    StringBuilder stringBuilder = new StringBuilder();
    if (i > 0) {
      for (int j = 0; j < i; j++) {
        stringBuilder.append(s);
      }
    }else {
      System.out.println("");
    }
    String string = stringBuilder.toString();
    System.out.println(string);
  }


  private static void printSum(long sum) {

    for (long i = 1; i <= sum; i++) {
      sum += i;
    }
    System.out.println(sum);
  }

  private static void printSumTen() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.println(sum);
  }

  private static void printNums() {
    for (int i = 0; i < 10; i++) {
      System.out.println(i + 1);
    }
  }
  private static void printNumsWhile() {
    int i = 0;
    while (i < 10){
      System.out.println(i + 1);
      i++;
    }
  }

  private static void printNumsGiven(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(i + 1);
    }
  }
  private static void printEvens(int n) {
    for (int i = 0; i <= n; i++) {

      if( i % 2 == 0){
        System.out.println(i);
      }

    }
  }


  public static void fibonnaciPrintTen(){
    int num1 = 0;
    int num2 = 1;
    int hold;
    //0,1,1,2,3,5,8
    System.out.println(num1);
    System.out.println(num2);
    for (int i = 0; i < 10; i++) {
      hold = num1 + num2;
      num1 = num2;
      num2 = hold;
      System.out.println(hold);
    }
  }
  public static void fibonnaciPrintSum(){
    int num1 = 0;
    int num2 = 1;
    int hold;
    int sum = 1;
    //0,1,1,2,3,5,8
    for (int i = 0; i < 10; i++) {
      hold = num1 + num2;
      num1 = num2;
      num2 = hold;
      sum += hold;
    }
    System.out.println(sum);

  }
  public static void fibonnaciPrintN(int n){
    int num1 = 0;
    int num2 = 1;
    int hold;
    //0,1,1,2,3,5,8
    System.out.println(num1);
    System.out.println(num2);
    for (int i = 0; i < n; i++) {
      hold = num1 + num2;
      num1 = num2;
      num2 = hold;
      System.out.println(hold);
    }
  }
}
