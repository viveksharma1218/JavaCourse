// Encapsulation = declare variables private and then access  them with 
// gettter and setter

class Human{

  private int age;
  private String name;
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
}

public class EC {
  public static void main(){

    Human jack = new Human();
    jack.setAge(20);
    jack.setName("jack sparrow");

    System.out.println(jack.getAge());
    System.out.println(jack.getName());
  }
}
