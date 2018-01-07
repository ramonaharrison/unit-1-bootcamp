import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

  public static void main (String args[]) {

//    ================================================ ####1. Cool Cats Pt. II ==================================================

//    1. Create an ArrayList of 5 Cats.
//    2. Use a loop to print the contents of each object in the ArrayList.

//    ArrayList<Cat> catList= new ArrayList<>();
//    catList.add(new Cat("A"));
//    catList.add(new Cat("B"));
//    catList.add(new Cat("C"));
//    catList.add(new Cat("D"));
//    catList.add(new Cat("E"));
//
//    for (int i=0; i<catList.size(); i++){
//      System.out.println(catList.get(i).getName());
//    }


//    ================================================ ####2. Most Frequent Element ==================================================

//    Write a method called `mostFrequentElement` that takes an ArrayList of Integers and finds the most frequently occurring element
//    in the ArrayList. At the end print the element and its number of occurrences. If there is more than one such element, any one of
//    them may be printed.

//    ArrayList<Integer> listIntegers= new ArrayList<>();
//    listIntegers.add(1);
//    listIntegers.add(3);
//    listIntegers.add(1);
//    listIntegers.add(2);
//    listIntegers.add(1);
//    listIntegers.add(2);
//    mostFrequentElement(listIntegers);

//    What needs to be changed to make this work on an array of Strings?

//    if(listIntegers.get(j) == currentNumber){
//      temp++;
//    }
//    This if statement will be changed to .equals to compare if they strings are simmilar

//    ================================================ ####3. Pod HashMap ==================================================

//    1. Create a HashMap that maps the names of all the Access Coders in your Pod to their age.
//    2. Use a loop to print each key-value pair of the HashMap.



//    ================================================ ####4. canRentACar ==================================================

//    Write a method called `canRentACar` that takes the Pod HashMap as a parameter and returns whether or not the Pod can rent a car.
//    If one or more studetns is over 25, it should return `true`. If no one in the Pod is over 25, it should return `false`.




//    ================================================ ####5. wordsWithoutList ==================================================

//    Given an array of strings and an integer, write a method that return a an ArrayList where all the strings of the given length
//    are omitted.

    String[] words= {"a", "bb", "b", "ccc"};
    ArrayList<String> list1 = wordsWithoutList(words, 3);
    for (int i=0; i<list1.size(); i++ ){
      System.out.println(list1.get(i));
    }


//    ================================================ ####6. How many clumps? ==================================================

//    Say that a "clump" in an ArrayList is a series of 2 or more adjacent elements of the same value.
//    Write a method that returns the number of clumps in the given ArrayList.


//    ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
//    System.out.println(countClumps(list3));
    

//    ================================================ ####7. Sorting sentences ==================================================

//    Write a method that takes a String sentence, breaks it up into an ArrayList of Strings (one word per ArrayList element),
//    and prints out the words in alphabetical order.

      sortingSentence("hello there how are you");


//    ================================================ END ==================================================


  }

  private static void sortingSentence(String input) {
    // Add a space at end of input String
    input = input + " ";
    // Find number of words
    int numberOfWords = 0;
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (ch == ' ') {
        numberOfWords++;
      }
    }
    // Extract words and store in array
    String[] words = new String[numberOfWords];
    int startIndex = 0;
    int currentWord = 0;
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (ch == ' ') {
        String word = input.substring(startIndex, i);
        words[currentWord] = word;
        currentWord++;
        startIndex = i + 1;
      }
    }
    // Sort words
    for (int i = 0; i < words.length - 1; i++) {
      for (int j = 0; j < words.length - i - 1; j++) {
        if (words[j].compareTo(words[j + 1]) > 0) {
          String temp = words[j];
          words[j] = words[j + 1];
          words[j + 1] = temp;
        }
      }
    }
    // Print words
    for (int i = 0; i < words.length; i++) {
      System.out.print(words[i] + " ");
    }
  }

  public static int countClumps(ArrayList<Integer> num) {
    boolean match = false;
    int count = 0;
    for (int i = 0; i < num.size()-1; i++) {
      if (num.get(i) == num.get(i+1) && !match) {
        match = true;
        count++;
      }
      else if (num.get(i) != num.get(i+1)) {
        match = false;
      }
    }
    return count;
  }

  private static ArrayList<String> wordsWithoutList(String[] words, int num) {
    ArrayList<String> list= new ArrayList<>();
    for(int i=0; i<words.length;i++){
      if(words[i].length()!=num){
        list.add(words[i]);
      }
    }
    return list;
  }

  private static void mostFrequentElement(ArrayList<Integer> listIntegers) {
  int count=1;
  int temp=1;
  int currentNumber=0;
  int number=0;


//    listIntegers.add(1);
//    listIntegers.add(3);
//    listIntegers.add(1);
//    listIntegers.add(2);
//    listIntegers.add(1);
//    listIntegers.add(2);
//    listIntegers.add(2);

  for (int i=0; i<listIntegers.size(); i++){

    currentNumber= listIntegers.get(i);

    for (int j=i+1; j<listIntegers.size(); j++){
      if(listIntegers.get(j) == currentNumber){
        temp++;
      }
    }

    if(temp>count){
      number=currentNumber;
      count=temp;
      temp=1;
    }

    else {
      number=number;
      count=count;
    }

  }
    System.out.println("Count="+count+"number="+number);
  }
}
