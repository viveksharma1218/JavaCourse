// let's use constructor
// it automaticlly runs when we create an Object from class
// we can use constructor to pass some value to it's variables
//  constructor will have same name as class name

class Human {
  private int age;
  private String name;


  public int getAge() {
    return age;
  }
  public String getName() {
    return name;
  }
  Human(){
    // we are giving default value to variables
    this.age = 10;
    this.name = "jack sparrow"  ;
  }
  // We are accepting new values also for new object
  Human(int a , String b){
    this.age =  a;
    this.name = b;
  }
}

public class Constr {
  public static void main(){
  Human H1 = new Human();
  Human H2 = new Human(12 , "barbosa");

  System.out.println(H1.getAge()+ " - " + H1.getName());
  System.out.println(H2.getAge() + " - " +  H2.getName());
  }

}
