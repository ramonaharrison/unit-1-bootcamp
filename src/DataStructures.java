import java.util.*;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    private List<Cat> cats;
    private Integer compare;
    private Integer key;

    public static void main(String args[]) {
        DataStructures ds = new DataStructures();
//    ds.coolCats();
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 3, 2, 5));
        ds.mostFrequentElement(numbers);
    }

    private void coolCats() {
        cats = new ArrayList<Cat>();
        cats.add(new Cat("Luna"));
        cats.add(new Cat("Artemis"));
        cats.add(new Cat("Salem"));
        cats.add(new Cat("Tardar Sauce"));
        cats.add(new Cat("Maru"));
        cats.add(new Cat("Nyan Cat"));

        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
    }

    private void mostFrequentElement(ArrayList<Integer> integerList) {
        Map<Integer, Integer> countElement = new TreeMap<Integer, Integer>();
        for (Integer item : integerList) {
            countElement.put(item, Collections.frequency(integerList, item));
        }

        compare = 0;
        key = 0;
        for (Map.Entry<Integer, Integer> entry : countElement.entrySet()) {
             if (entry.getValue() > compare) {
                 compare = entry.getValue();
                 key = entry.getKey();
             }
        }
        System.out.println("The element " + key + " was the most frequent by count of " + compare);
    }
}
