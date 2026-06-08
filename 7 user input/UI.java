// how to take user input in java

import java.io.IOException;

public class UI {
  public static void main(){
    System.out.println("Enter a number");
    int num = 0;
    try {
      num = System.in.read();
    } catch (IOException e) {
      System.out.println("IO exception");
    }
    // when we enter number we are getting ASCII values
    // 0 = 48 ; 1 = 49
    System.out.println(num-48);
    // it only reads one character at a time so try to input 2 or 3 char
    // we will use buffer reader from here

    
  }  
}
