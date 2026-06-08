// Anonymus Class
class A{
  public void show(){
    System.out.println("in A show");
  }
}
// if we want to change show method we can use another class
// and extend this but here we will use anonymus class
public class AN {
 public static void  main(){

    // we are giving new implementation to this class
  A obj = new A(){
    public void show() {
      System.out.println("Anonymus class implementation");
    };
  };
  obj.show();
 }
}
