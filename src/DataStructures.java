import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

  public static void main (String args[]) {
    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Fey"));
    cats.add(new Cat("Quasi"));
    cats.add(new Cat("Helia"));
    cats.add(new Cat("Gray"));
    cats.add(new Cat("Born"));
//
//    for (int i = 0; i < cats.size(); i++) {
//      System.out.println("Cat name: " + cats.get(i).getName());
//    }

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(1);
    integers.add(1);
    integers.add(2);
    integers.add(2);
    integers.add(3);
    integers.add(3);
    integers.add(4);
    integers.add(4);
    integers.add(5);
    integers.add(5);
    integers.add(5);
    integers.add(6);
    integers.add(7);
    integers.add(7);
    integers.add(8);
    integers.add(8);
    integers.add(9);
    integers.add(9);
    integers.add(9);
    integers.add(9);

//    mostFrequentElement(integers);
    HashMap<String,Integer> pod = new HashMap<>();
    //Don't know real ages
    pod.put("Darnell Otto",25);
    pod.put("Wayne Kellman",25);
    pod.put("Yisandy Marte",26);
    pod.put("Muaadh Melhi",31);
    pod.put("Anas Chikh",26);
    pod.put("Yoke Yen Lam",23);

//    printPod(pod);
//    System.out.println("Can Rent A Car: " + rentACar(pod));

    ArrayList<String> strings = new ArrayList<>();
    strings.add("a");
    strings.add("bb");
    strings.add("ccc");
    strings.add("ddd");
    strings.add("ee");
    strings.add("f");
    strings.add("gg");
    strings.add("hhh");
    strings.add("iiii");

//    for (String s : strings) {
//      System.out.print(" " + s);
//    }

    ArrayList<String> newStrings = wordsWithoutList(strings,3);
//    System.out.println("");

//    for (String s : newStrings) {
//      System.out.print(" " + s);
//    }

    int countClumps = countClumps(integers);
    System.out.println(countClumps);

  }

  private static int countClumps(ArrayList<Integer> integers) {
    int count = integers.get(0) == integers.get(1) ? 1 : 0 ;
    boolean wasLastFewSame = integers.get(0) == integers.get(1);
    for (int i = 1; i < integers.size(); i++) {
     if (integers.get(i) == integers.get(i-1) && wasLastFewSame == false){
        count++;
        wasLastFewSame = true;
     } else if (integers.get(i) != integers.get(i-1)){
       wasLastFewSame = false;
     }
    }

    return count;
  }

  private static void printPod(HashMap<String, Integer> pod){
    for (String s : pod.keySet()) {
      System.out.println("Key: " + s + "| Value: " + pod.get(s));
    }
  }

  private static boolean rentACar(HashMap<String, Integer> pod){
    for (String s : pod.keySet()) {
      if (pod.get(s) >= 25){
        return true;
      }
    }
    return false;
  }

  private static ArrayList<String> wordsWithoutList(ArrayList<String> inputArray, int omitLength){
    ArrayList<String> outputArray = new ArrayList<>();
    for (String s : inputArray) {
      if(s.length() != omitLength) {
        outputArray.add(s);
      }
    }

    return outputArray;
  }

  private static void mostFrequentElement(ArrayList<Integer> integers) {
    HashSet<Integer> integerSet = new HashSet<>();
    integerSet.addAll(integers);
    HashMap<Integer,Integer> compare = new HashMap<>();
    int holdKey = 0;
    int holdValue = 0;
    for (Iterator<Integer> it = integerSet.iterator(); it.hasNext(); ) {
      int i = it.next();
      if(!compare.containsKey(i)){
        int count = 0;
        for (int j = 0; j < integers.size(); j++) {
          if(i == integers.get(j)){
            count++;
          }
        }
        if(holdValue < count){
          holdValue = count;

          holdKey = i;
        }

      }

    }

    System.out.println("Most Frequent number: " + holdKey);
    System.out.println("Most Frequent times: " + holdValue);
  }
}
