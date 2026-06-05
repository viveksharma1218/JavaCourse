// Inner class
package Chapter6;
class A{
  public void show(){
    System.out.println("in A show");
  }
  class B{
    public void config(){
      System.out.println("in B config");
    }
  }
}
public class In {
  public static void main(){
    A obj = new A();
    obj.show();
    // how can we use config method
    A.B obj1 = obj. new B();
    obj1.config();
    
  }
}
