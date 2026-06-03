// String Buffer
// it always have buffer of 16

public class SB {


  public static void main(){

      
  StringBuffer  SB = new StringBuffer();

  // length and capacity are different 
  System.out.println(SB.capacity());

  System.out.println(SB.length());

  SB.append("Java learning");
    System.out.println(SB);
  SB.deleteCharAt(6);

  System.out.println(SB);

    SB.insert(0,"My ");

  System.out.println(SB);

    // Try more different methods of string buffering

  }


}
