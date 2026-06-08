public class one {

  public static void main (){
    System.out.print("hello world");


    // save data in variable and printing in new line
    int num1 = 5;
    int num2 = 10;
    System.out.println(num1 * num2);

    // Primitive data types
    int num3 =9;
    byte byt = 127;
    short sh = 558;
    long l = 5854l;

    float f = 5.8f;
    double d = 3.44;

    char c = 'a';
    boolean b = true;

    // type conversion and type casting
    byte by = 127;
    int a = 5;
    // by = a; not possible
    a =by;

    int number =256;
    // byte b = (byte)number;  will not work 

    float fl = 6.5f;
    int integer = (int)fl;
    // this will work

  }
}