/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static void main(String args[]) {
        Cat garfield = new Cat("Garfield");
        Cat pinkPanther = new Cat("Pink Panther");
        Cat catWoman = new Cat("Catwoman");
        Person juan = new Person("Juan");
        Person carlos = new Person("Carlos");
        Person maria = new Person("Maria");
        garfield.setFavoriteFood("Lasagna");
        pinkPanther.setFavoriteFood("Ravioli");
        catWoman.setFavoriteFood("Pizza");
        garfield.setAge(2);
        pinkPanther.setAge(4);
        catWoman.setAge(6);
        System.out.println(isOlder(catWoman, garfield));
        Cat kitten1 = makeKitten(garfield, catWoman);
        System.out.println(kitten1.getName());
        System.out.println(kitten1.getAge());
        adoption(juan, garfield);
        adoption(carlos, pinkPanther);
        adoption(maria, catWoman);
        System.out.println(garfield.getOwner().getName());
        System.out.println(pinkPanther.getOwner().getName());
        System.out.println(isFree(garfield));
        System.out.println(isFree(pinkPanther));
        System.out.println(isFree(catWoman));
        System.out.println(isSibling(garfield, pinkPanther));
    }

    public static boolean isOlder(Cat cat1, Cat cat2) {
        return cat1.getAge() > cat2.getAge();
    }

    public void bestFriends(Cat cat1, Cat cat2) {
        cat2.setFavoriteFood(cat1.getFavoriteFood());
    }

    public static Cat makeKitten(Cat cat1, Cat cat2) {
        Cat newCat = new Cat(cat1.getName() + cat2.getName());
        newCat.setAge(0);
        return newCat;
    }

    public static void adoption(Person person, Cat cat) {
        if (cat.getName().equalsIgnoreCase("Catwoman")) {
            System.out.println(cat.getName() + " will never be anyone's pet!");
        } else {
            cat.setOwner(person);
        }
    }

    public static boolean isFree(Cat cat) {
        if (cat.getOwner() != null) {
            return true;
        }
        return false;
    }

    public static boolean isSibling(Cat cat1, Cat cat2) {
        return cat1.getOwner().equals(cat2.getOwner());
    }
}
