/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {

//    ================================================ ###Exercises ======================================================

//    ================================================ ####1. Cool cats ======================================================

//    1. Create 3 cats named `Garfield`, `Pink Panther`, and `Catwoman`.
//    2. Assign each of them a favorite food (Garfield's favorite food should be `Lasagna`).
//    3. Assign each of them an age.

    Cat cat1= new Cat();
    cat1.setName("Garfield");
    cat1.setFavoriteFood("Lasagna");
    cat1.setAge(2);

    Cat cat2= new Cat();
    cat2.setName("Pink Panther");
    cat2.setFavoriteFood("Chicken");
    cat2.setAge(5);

    Cat cat3= new Cat();
    cat3.setName("Catwoman");
    cat3.setFavoriteFood("Fish");
    cat3.setAge(7);


//    ================================================ ####2. isOlder ======================================================
//    Write a method called `isOlder` that takes 2 Cats as parameters and returns whether or not the first Cat is older than the second.

    System.out.println(isOlder(cat3, cat2));

//    ================================================ ####3. Best Friends ======================================================
//    Write a method called `makeBestFriends` that takes 2 Cats as parameters and sets both of their favorite foods to the same thing.
//    *Hint: this method does not return anything!*

    makeBestFriends(cat1, cat2);

//    ================================================ ####4. Kitten ======================================================
//    Write a method called `makeKitten` that takes 2 Cats as parameters and returns a new Cat with a name that is the combination
//    of the 2 parent Cats' names. The age of the new Cat should be `0`.

    makeKitten(cat1, cat2);

//    ================================================ ####5. Adoption ======================================================
//    Write a method called `adoption` that takes 1 Cat and 1 Person as a paramater and sets the Cat's owner to be the Person.
//    *Hint: this method does not return anything!*
    Person person1 = new Person("Jon");
    adoption(cat1, person1);


//    ================================================ **Bonus Challenge** ======================================================
//    If the Cat's name is `Catwoman`, don't set the owner, but instead print: "Catwoman will never be anyone's pet!"

    adoption(cat3, person1);


//    ================================================ ####6. isFree ======================================================
//    Write a method called `isFree` that checks whether or not a Cat has an owner.

    System.out.println("Is the cat free: "+isFree(cat2));

//    ================================================ ####7. isSibling ======================================================
//    Write a method called `isSibling` that checks whether or not 2 Cats have the same owner.

    System.out.println("Are they Siblings: "+isSibling(cat1, cat2));

  }

  private static boolean isSibling(Cat cat1, Cat cat2) {

    if(cat1.getOwner()== null || cat2.getOwner()== null){
      System.out.println("One of the cats has no owner");
      return false;
    }

    if(cat1.getOwner().getName().equals(cat2.getOwner().getName())){
      return true;
    }
    else return false;
  }

  private static boolean isFree(Cat cat1) {
    if(cat1.getOwner()== null){
      return true;
    }
    else {
      return false;
    }
  }

  private static void adoption(Cat cat1, Person person1) {
    if(cat1.getName().equals("Catwoman")){
      System.out.println("Catwoman will never be anyone's pet!");
    }
    else {
      cat1.setOwner(person1);
    }
  }


  private static Cat makeKitten(Cat cat1, Cat cat2) {
    Cat cat3= new Cat();
    cat3.setName(cat1.getName()+cat2.getName());
    cat3.setAge(0);
    return cat3;
  }

  private static void makeBestFriends(Cat cat1, Cat cat2) {
    cat2.setFavoriteFood(cat1.getFavoriteFood());
  }

  private static boolean isOlder(Cat cat1, Cat cat2) {
    if(cat1.getAge() > cat2.getAge()){
      return true;
    }
    else {
      return false;
    }

  }
}
