// what is wrapper class
// for every primitive value we have wrapper class
// like for int we have integer
package Chapter6;

public class W {
  public static void main(){
    int num = 7;
    // old method
    // Integer num1 = new Integer(7);
    Integer num1 = num; // auto-boxing
    // what if we want to get int value from Integer
     // int num2 = num1.intValue();
     int num2 = num1; // auto-unboxing
    System.out.println(num2);

    String st = "12";
    int num3 = Integer.parseInt(st);
    System.out.println(num3);
  }
}
