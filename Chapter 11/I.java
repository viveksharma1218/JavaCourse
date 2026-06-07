// Interfaces

interface A {
  // All varialbes inside interfaces are final and static
  // because you can not instantiate the interface 
  int age = 44;
  String area = "mumbai";
  void show();
  void config();
}
interface B{
  void run();
}
// a class can implement more than one interfaces
// we must define all methods
class C implements A,B{
  public void show(){
    System.out.println("in Show");
  }
  public void config(){
    System.out.println("in Config");
  }
  public void run(){
    System.out.println("in run");
  }

}
// an interface can extend another interface
interface D{
  void show();
}
interface E extends D{
  void config();
}
class F implements E{
  public void show(){
    System.out.println("in f show");
  }
  public void config(){
    System.out.println("in f config");
  }
}

public class I {
 public static void main(){
    C c = new C();
    c.show();

    F f = new F();
    f.show();
    f.config();
 }
}
