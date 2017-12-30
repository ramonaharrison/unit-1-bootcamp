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

    for (int i = 0; i < cats.size(); i++) {
      System.out.println("Cat name: " + cats.get(i).getName());
    }

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
    integers.add(4);
    integers.add(4);

    mostFrequentElement(integers);




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
    System.out.println("Most Frequent: " + holdKey);
    System.out.println("Most Frequent: " + holdValue);
  }
}
