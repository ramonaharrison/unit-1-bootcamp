import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {

  public static void main (String args[]) {
    HashSet<String > hashSetWords = new HashSet<>();
    HashSet<String > hashSetSentence = new HashSet<>();
    // An abstract representation of a File
    File file = new File("Moby_Dick.txt");

    try{
      Scanner sc = new Scanner(file);
      /**
       *  Your CODE goes here
       *
       *
       *
       *
       */
      while (sc.hasNext()){
        hashSetWords.add(sc.next());
      }
      while (sc.hasNext(".")){


      }

    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }


    System.out.println(""+hashSetWords.size());
    System.out.println(""+hashSetSentence.size());
    String[] arrayOfWords = hashSetWords.toArray(new String[0]);
    String[] arrayOfSentenced = hashSetSentence.toArray(new String[0]);

  }
}
