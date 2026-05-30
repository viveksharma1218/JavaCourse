
class calculator{
  String show(){
      System.out.println("i am class create an object to use this method");
      return "i am  class create an obj to use  me";
    }

  // methods with different parameters
  public int add(int a , int b){
    return a + b;
  }
  public int add (int a , int b , int c){
    return a + b + c;
  }
  // both above methods have same name but different parameters
}


public class Object {
  
  public static void main(){
    calculator cal = new calculator();
    String message =cal.show();
    int num1 = cal.add(3, 4);
    int num2 = cal.add(1, 2, 3);
    System.out.println(num1 + " " + num2);
  }
}
