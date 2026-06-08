// TypeCasting 


class A{
  public void show1(){
    System.out.println("in A show");
  }
}
class B extends A{
  public void show2(){
    System.out.println("in B show");
  }
}
public class T2 {
  
  public static void main(){
    // Upcasting
      A obj = new B();
      obj.show1();
  // If you tried to call obj.show2() here, it would throw an error 
  // because the reference type is 'A', and 'A' doesn't know 'show2' exists.
  
    // Downcasting
    B obj2 = new B();
    obj2.show2();
}


}
