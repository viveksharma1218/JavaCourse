package Chapter6;
// abstract keyword
// when our class declare the method but don't define it
// the class who is extending this class will define the 
// abstract method
// we can not create object of abstract class because another class will
// define abstract methods for it.

abstract class Car{
  public abstract void run ();
  public abstract void fly();
}
// If we are not defining all abstract methods here 
// then this must be abstract class
abstract class WagonR extends Car{
  public void run(){
    System.out.println("running");
  }
}
class WagonR2 extends WagonR{
  public void fly(){
    System.out.println("flying .. ");
  }
}
public class Ab {
  WagonR car = new WagonR2();
}
