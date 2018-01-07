import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {

  private final String USER_AGENT = "Mozilla/5.0";


  public static void main (String args[]) {



    map();


//    try {
//    URL url = new URL("https://api.stripe.com/v1/customers");
//    HttpURLConnection con = (HttpURLConnection) url.openConnection();
//      con.setRequestMethod("GET");
//
//
//    } catch (ProtocolException e) {
//      e.printStackTrace();
//    } catch (MalformedURLException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    UsingAPIs http = new UsingAPIs();

    try {
      http.sendGet();

      http.sendPost();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // HTTP GET request
  private void sendGet() throws Exception {

    String url = "https://api.stripe.com/v1/customers";

    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

    // optional default is GET
    con.setRequestMethod("GET");

    //add request header
    //con.setRequestProperty("User-Agent", USER_AGENT);
    con.setRequestProperty("Authorization", "Bearer sk_test_BQokikJOvBiI2HlWgH4olfQ2");

    int responseCode = con.getResponseCode();
    System.out.println("\nSending 'GET' request to URL : " + url);
    System.out.println("Response Code : " + responseCode);

    BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
      response.append(inputLine);
    }
    in.close();

    //print result
    System.out.println(response.toString());

  }


//  -d amount=2000 \
//          -d currency=usd \
//          -d source=tok_visa \
//          -d description="Charge for aubrey.williams@example.com"
private void sendPost() throws Exception {

  String url = "https://api.stripe.com/v1/customers";
  URL obj = new URL(url);
  HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

  //add reuqest header
  con.setRequestMethod("POST");
  con.setRequestProperty("Authorization", "Bearer sk_test_BQokikJOvBiI2HlWgH4olfQ2");
  con.setRequestProperty("amount", String.valueOf(2000));
  con.setRequestProperty("currency", "usd");
  con.setRequestProperty("source", "tok_visa");
  con.setRequestProperty("description", "Charge for aubrey.williams@example.com");


  //String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";

  // Send post request
  con.setDoOutput(true);
  DataOutputStream wr = new DataOutputStream(con.getOutputStream());
  //wr.writeBytes(urlParameters);
  wr.flush();
  wr.close();

  int responseCode = con.getResponseCode();
  System.out.println("\nSending 'POST' request to URL : " + url);
 // System.out.println("Post parameters : " + urlParameters);
  System.out.println("Response Code : " + responseCode);

  BufferedReader in = new BufferedReader(
          new InputStreamReader(con.getInputStream()));
  String inputLine;
  StringBuffer response = new StringBuffer();

  while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
  }
  in.close();

  //print result
  System.out.println(response.toString());

}
  private static void map() {
    //    HashSet hashSet= new HashSet();
//
//
//
//    File file = new File("tale.txt");
//
//
//      try {
//
//        String tale= new String(Files.readAllBytes(file.toPath()));
//        //System.out.println(new String(Files.readAllBytes(file.toPath())));
//
//        hashSet.add(tale);
//        System.out.println(hashSet.);
//
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//
//    }
    File f = new File("tale.txt");
    ArrayList arr = new ArrayList();
    HashMap<String, Integer> listOfWords = new HashMap<String, Integer>();
    Scanner in = null;
    try {
      in = new Scanner(f);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    int i = 0;
    while (in.hasNext()) {
      String s = in.next();
      //System.out.println(s);
      arr.add(s);
    }
    Iterator itr = arr.iterator();
    while (itr.hasNext()) {
      i++;

      listOfWords.put((String) itr.next(), i);
      //System.out.println(listOfWords);
    }

    Set<Object> uniqueValues = new HashSet<Object>(listOfWords.values());

    System.out.println("The number of unique words: " + uniqueValues.size());

  }


}
