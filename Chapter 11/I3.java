// Functional interface = interface that has only one method
// lemda expression
@FunctionalInterface
interface A{
  public void show();
}
// we can create a class here or we can make anonymus class to 
// define the show method


public class I3 {
  public void main(){
    // we have defined abstract method by using anonymus class
    // A a = new A(){
    //   public void show(){
    //     System.out.println("in A show");
    //   }
    // };
    // a.show();

    // lets use lemda expression for all this
    // we removed new A() because we have already suggested in start
    // we have removed show() because we know in functional interface
    // these is only one method to defind.
     A a = () -> {
      System.out.println("in A show");
     };
     a.show();
  }
}
