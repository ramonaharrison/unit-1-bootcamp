import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
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
//        try {
//            Scanner sc = new Scanner(citiesFile);
//            while (sc.hasNext()) {
//                String word = sc.next();
//                twoCities.add(word);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        Set<String> mobyDick = new HashSet<String>();
        api.addTextToSet(mobyFile, mobyDick);

//        api.printSetElements(mobyDick, "Moby Dick has unique words count of ");
        api.printSetElements(twoCities, "A Tale of Two Cities has unique words count of ");


//        System.out.println("A Tale of Two Cities has unique words count of " + twoCities.size());
//        for (String text : twoCities) {
//            System.out.println(text);
//        }
//        System.out.println("Moby Dick has unique words count of " + mobyDick.size());
//        for (String text : mobyDick) {
//            System.out.println(text);
//        }

    }
    private void printSetElements(Set<String> set, String println) {
        System.out.println(println+ set.size());
        for (String text : set) {
            System.out.println(text);
        }
    }
    private void addTextToSet(File file, Set<String> set) {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String word = sc.next();
                int end = word.length() - 1;
                while (!word.isEmpty()
                        && !Character.isAlphabetic(word.charAt(end))
                        && !Character.isDigit(word.charAt(end))) {
                    word = word.substring(0, end);
                    if (end > 0) {
                        end--;
                    }
                }
                set.add(word.toLowerCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
