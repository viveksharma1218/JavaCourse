// Inheritance - a class can extend another class
// to use it's features with this they becomes parent and child classes
// with this feature we don't have to put all methods in one class

class AdvCal {
  public int multiply (int a , int b){
    return a*b;
  }
  public int div (int a , int b){
    return a / b;
  }
}
class Calc extends AdvCal {
  public int add(int a , int b){
    return a  + b;
  }
  public int sub(int a , int b){
    return a - b;
  }
}


public class Inheritance {
  public static void  main(String[] args){
    Calc Calculator = new Calc();
    int a = Calculator.add(5, 9);
    int b = Calculator.sub(12, 2);
    System.out.println(a + " " + b);
    int c = Calculator.multiply(45, 66);
    int d = Calculator.div(44, 11);
    System.out.println(c + " - " + d);
  }
}
