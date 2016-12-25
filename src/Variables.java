/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {
    private int roomNum = 113;
    private double eRounded = 2.71828;
    private String compSci = "Computer Science";
    private String HELLO_WORLD = "Hello World";

    private boolean isOdd(int number) {
        return (number % 2 != 0);
    }

    private void printHelloWorld(String HELLO_WORLD) {
        System.out.println(HELLO_WORLD);
    }

    private void greatestCommonFactor(int a, int b) {

    }


    public static void main(String args[]) {
        Variables variables = new Variables();
        System.out.println("This is room # " + variables.roomNum);
        System.out.println("e is close to " + variables.eRounded);
        System.out.println("I am learning a bit about " + variables.compSci);

    }
}
