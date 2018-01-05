/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {
    Cat garfield = new Cat("Garfield");
    Cat pinkPanther = new Cat("Pink Panther");
    Cat catWoman = new Cat("Catwoman");

    garfield.setFavoriteFood("Lasagna");
    pinkPanther.setFavoriteFood("Pie");
    catWoman.setFavoriteFood("Fried Mouse");

    garfield.setAge(5);
    pinkPanther.setAge(10);
    catWoman.setAge(15);

    System.out.println(isOlder(catWoman,pinkPanther));
    makeBestFriends(garfield,pinkPanther);
    Cat babyCat = makeKitten(garfield,pinkPanther);
    System.out.println(babyCat.getName());
    Person wayne = new Person("Wayne");
    adoption(garfield,wayne);
    System.out.println(garfield.getOwner().getName());
    System.out.println(isFree(pinkPanther));
    System.out.println(isFree(garfield));
    isSibling(garfield,pinkPanther);
    pinkPanther.setOwner(wayne);
    System.out.println(isSibling(garfield,pinkPanther));
    System.out.println(isSibling(garfield,catWoman));
  }

  private static boolean isSibling(Cat cat, Cat cat1) {
    if (cat.getOwner() == cat1.getOwner()){
      return true;
    }
    return false;
  }

  private static boolean isFree(Cat cat) {
    if (cat.getOwner() == null){
      return false;
    } else {
      return true;
    }
  }

  private static void adoption(Cat cat, Person person) {
    cat.setOwner(person);
  }

  private static Cat makeKitten(Cat cat, Cat cat1) {
    Cat babyCat = new Cat(cat.getName()+cat1.getName());
    babyCat.setAge(0);
    babyCat.setFavoriteFood("cat milk");
    return babyCat;
  }

  private static void makeBestFriends(Cat cat, Cat cat1) {
    cat1.setFavoriteFood(cat.getFavoriteFood());
  }

  private static boolean isOlder(Cat cat1, Cat cat2) {
    if(cat1.getAge() > cat2.getAge()){
      return true;
    }
    return false;
  }
}
