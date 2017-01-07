import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {

    public static void main(String args[]) {
        // An abstract representation of a File
        File citiesFile = new File("/Users/huilin/Desktop/accesscode/Homework/unit-1-bootcamp/Resources/ATaleOfTwoCities");
        File mobyFile = new File("/Users/huilin/Desktop/accesscode/Homework/unit-1-bootcamp/Resources/MobyDick");

        UsingAPIs api = new UsingAPIs();
        Set<String> twoCities = new HashSet<String>();
        api.addTextToSet(citiesFile, twoCities);

        Set<String> mobyDick = new HashSet<String>();
        api.addTextToSet(mobyFile, mobyDick);

        Set<String> intersection = new HashSet<String>(twoCities);
        intersection.retainAll(mobyDick);
        System.out.println(intersection);
        System.out.println("The intersection set has a count of " + intersection.size());

        Set<String> union = new HashSet<String>(twoCities);
        union.addAll(mobyDick);
        System.out.println("The intersection set has a count of " + union.size());

        api.unionIterate(union);
//        api.printSetElements(intersection, "Intersection");
//        api.printSetElements(twoCities, "A Tale of Two Cities");
//        api.printSetElements(mobyDick, "Moby Dick");
    }

//    private void printSetElements(Set<String> set, String setName) {
//        System.out.println(setName + " has unique words count of " + set.size());
//        for (String text : set) {
//            System.out.println(text);
//        }
//    }

    private void addTextToSet(File file, Set<String> set) {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String word = sc.next();
                int end = word.length() - 1;
                int beginning = 0;
                while (!word.isEmpty() &&
                        !Character.isAlphabetic(word.charAt(end)) &&
                        !Character.isDigit(word.charAt(end))) {
                    word = word.substring(0, end);
                    if (end > 0) {
                        end--;
                    }
                }
                while (!word.isEmpty() &&
                        !Character.isAlphabetic(word.charAt(0)) &&
                        !Character.isDigit(word.charAt(0))) {
                    end = word.length();
                    if (beginning < end) {
                        beginning++;
                        word = word.substring(beginning, end);
                    }
                }
                if(!word.isEmpty()) {
                    set.add(word.toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void unionIterate(Set<String> set) {
        System.out.println("The contents of this set: ");
        Iterator<String> itr = set.iterator();

        while(itr.hasNext()) {
            String item = itr.next();
            System.out.println(item + "");
        }
    }
}
