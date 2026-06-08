// Annotaions
// Override - when we want to override a method of one class
// with out Override we can make spelling mistake and java will 
// treat them two different methods

class A{
  public void show(){
    System.out.println("in A show");
  }
  public void config(){
    System.out.println("in A config");
  }
}
class B extends A{
  // spelling mistake will create a new method istead of overriding
  public void shhow(){
    System.out.println("in B show");
  }
  //lets overrid the method using annotation so if we make spelling
  // mistake a warning will appear
  @Override
  public void config() {
    //super.config();
    System.out.println("in B config");
  }
}
public class Annotaion {
  public static void main(){
    B b = new B();
    b.show();
    b.config();
  }
}
