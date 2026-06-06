package Chapter6;

public class TypeCasting {
  public static void main(){
    double d = 4.5;
    int i = (int)d;
    System.out.println("Before type was double and value is "
      + d
      +" Now After Type casting to int we lose some value and value is "
      + i);
  }
}
