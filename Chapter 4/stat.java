//static keyword is used for
// making a variable or method common to all object created 
// with this class
// we don't need obj to use static methods

class mobile{
  static String name;
  int price;

  static void show(mobile obj){
    // we can not use directly non static varialble 
    // because for they are different in different obj so we 
    // pass obj to use them

    System.out.println(name + " - "+ obj.price);
  }
  // static block
  // runs only one
  // runs before constructor
  // don't run if we don't create any obj
  static{
    System.out.println("I am static block i will only run ones no "+
    "matter how many objects you create");
  }

}
class car{
  static {
    System.out.println("let's learn how to create instance of class " + 
    "with out creating object");
  }
}

public class stat {
  public static void main() throws ClassNotFoundException{
    mobile mob1 = new mobile();
    mobile mob2 = new mobile();
    mob1.price = 100;
    mob2.price = 120;
    // we can call static variable with class name
    mobile.name = "smartphone";
    mobile.show(mob2);

    Class.forName("car");
  }
}
