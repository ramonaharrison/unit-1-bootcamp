/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static void main(String args[]) {
        Cat garfield = new Cat("Garfield");
        Cat pinkPanther = new Cat("Pink Panther");
        Cat catwoman = new Cat("Catwoman");
        garfield.setFavoriteFood("Lasagna");
        pinkPanther.setFavoriteFood("Ravioli");
        catwoman.setFavoriteFood("Pizza");
        garfield.setAge(2);
        pinkPanther.setAge(4);
        catwoman.setAge(6);
        System.out.println(isOlder(garfield, catwoman));
        bestFriends(garfield, catwoman);
        Cat kitten = makeKitten(garfield, catwoman);
        System.out.println("a Cat named " + kitten.getName() + " with age " + kitten.getAge());
        Person jon = new Person("jon");
        adoption(garfield, jon);
        System.out.println( isFree(garfield));
        System.out.println(isSibling(garfield,pinkPanther));

    }

    //2
    private static Boolean isOlder(Cat cat1, Cat cat2) {
        return cat1.getAge() > cat2.getAge();
    }

    //3
    private static void bestFriends(Cat cat1, Cat cat2) {
        cat2.setFavoriteFood(cat1.getFavoriteFood());
    }

    //4
    private static Cat makeKitten(Cat cat1, Cat cat2) {
        Cat newCat = new Cat(cat1.getName() + cat2.getName());
        newCat.setAge(0);
        return newCat;

    }

    //5+Bonus Challenge
    private static void adoption(Cat cat, Person person) {
        if (cat.getName().equalsIgnoreCase("Catwoman")) {
            System.out.println(cat.getName() + " will never be anyone's pet!");
        } else {
            cat.setOwner(person);
            System.out.println(cat.getOwner().getName() + " is now " + cat.getName() + "'s owner!");
        }
    }
    //6
    private static boolean isFree(Cat cat){
        return cat.getOwner().getName()!=null;
    }
    //7
    private static boolean isSibling(Cat cat1, Cat cat2) {
        return (cat1.getOwner()).equals(cat2.getOwner());
    }

}
