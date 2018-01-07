import java.time.DayOfWeek;

public class Bonus {
    public static void main (String args[]) {

//    ================================================ #### FizzBuzz ==================================================

//  1. [Project Euler #1 - Multiples of 3 and 5](https://projecteuler.net/problem=1)

//  2. Modify this code to write FizzBuzz. Print out each of the numbers from 1 to 1000. If the number is
//  divisible by 3 then print "Fizz" instead of the number. If the number is divisible by 5 then print "Buzz"
//  instead of the number. If the number is divisible by both then print "Fizzbuzz".

//  3. Modify this code again: instead of replacing numbers if they are divisible by 3 and 5, print "Fizz" if
//  the number contains a 3 and "Buzz" if the number contains a 5, and "Fizzbuzz" if it contains both.

    //fizzBuzz();

//    ================================================ #### Collatz ==================================================

//  1. [Project Euler #14 - Longest Collatz sequence](https://projecteuler.net/problem=14)
//  2. Modify this code so that it takes in the starting number as a parameter.
//  3. Modify this code so that it prints out each chain.
//  4. Modify this code so that it only prints out the longest chain found so far, whenever a new longest chain is encountered.
//  5. Modify this code so that it only prints out the longest chain under the starting number.

        collatz(13);

//    ================================================ #### Weekdays ==================================================

//  1. [Project Euler #19 - Counting Sundays](https://projecteuler.net/problem=19)
//  2. Find a Java date library and solve this problem again, using that library.
//  3. Find another Java date library. Implement this solution again, using the new date library.
//  4. What day of the week were you born?

        weekDays();


//    ================================================ ####1 ==================================================

//  1. Write a method `isOdd` that takes in an `int` n. Returns a `true` if n is odd, and `false` otherwise.



//    ================================================ ####1 ==================================================

//  1. Write a method `isOdd` that takes in an `int` n. Returns a `true` if n is odd, and `false` otherwise.


    }

    private static void weekDays(){

    }

    private static void collatz(int n) {
        //System.out.print(n);
        int count;
        String even="";
        String odd="";
        while (n>1){
            System.out.print(n+"-");
            if(n%2==0){
                even+=n+"-";
                count=n/2;
            }
            else {
                odd+=n+"-";
                count=(3*n)+1;
            }
            n=count;
            System.out.println(n);
            System.out.println("ODD: "+odd+", EVEN: "+even);



        }

        if(odd.length() > even.length()){
            System.out.println("Odd is larger");
        }
        if(odd.length() < even.length()){
            System.out.println("Even is larger");
        }
        else {
            System.out.println("They have the same size");
        }
    }

    private static void fizzBuzz() {

        for (int i=1; i<=1000; i++){

            if(i%3==0 && i%5==0 ){
                System.out.println("Fizzbuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
//            else if(i%3!=0 || i%5==0) {
//                System.out.println(i);
//            }
            else{
                System.out.println(i);
            }


        }
    }

}
