/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    private Cat garfield;
    private Cat pinkPanther;
    private Cat catWoman;

    private void create3Cats() {
        garfield = new Cat("Garfield");
        garfield.setFavoriteFood("Lasagna");
        garfield.setAge(39);

        pinkPanther = new Cat("Pink Panther");
        pinkPanther.setFavoriteFood("Hamburger");
        pinkPanther.setAge(54);

        catWoman = new Cat("Catwoman");
        catWoman.setFavoriteFood("Ice Cream");
        catWoman.setAge(77);
    }

    private boolean isOlder(Cat first, Cat second) {
        return first.getAge() > second.getAge();
    }

    private void makeBestFriends(Cat first, Cat second) {
        String favoriteFood = first.getFavoriteFood();
        second.setFavoriteFood(favoriteFood);
    }

    private Cat makeKitten(Cat first, Cat second){
        String newName = first.getName() + second.getName();
        Cat kitten = new Cat(newName);
        kitten.setAge(0);
        return kitten;
    }

    private void adoption(Cat cat, Person owner) {
        cat.setOwner(owner);
    }

    public static void main(String args[]) {
        ClassesAndObjects co = new ClassesAndObjects();

        co.create3Cats();

        System.out.println("Is Garfield older than Catwoman? " + co.isOlder(
                co.garfield, co.catWoman)
        );
        System.out.println("Is Catwoman older than Garfield? " + co.isOlder(
                co.catWoman, co.garfield)
        );

        System.out.println("Garfield's favorite food is " + co.garfield.getFavoriteFood());
        co.makeBestFriends(co.catWoman, co.garfield);
        System.out.println("Garfield's favorite food is now " + co.garfield.getFavoriteFood());

        Cat kitten = co.makeKitten(co.garfield, co.pinkPanther);
        System.out.println("The kitten's name is " + kitten.getName() + " & my age is " + kitten.getAge());

        Person Lily = new Person("Lily");
        System.out.println("Garfield's owner is " + co.garfield.getOwner());
        co.adoption(co.garfield, Lily);
        System.out.println("Garfield's owner is " + co.garfield.getOwner().getName());

    }
}
