
class A {
  A(){
    System.out.println("in class A");
  }
  A(int a){
    System.out.println("in Class A");
  }
}
class B extends A{
  B(){
  // by default this method is running for constructor of A
  // super()
    System.out.println("in B");
  }
  B(int b){
      // If we want to run constructor with parameter we do this
    super();
    // we want to use default contructor of class A
    // this();
    // this() is only runnning it's own without parameter constructor
    // where default super() will run 
    System.out.println("in Class B");
  }
}
public class Super {
  public static void main(){
      B b = new B(5);
  } 


}
