// using BufferReader to get user input
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI2 {
  public static void main(String[] args){
    // we need obj of inputStream and System.in creates the obj
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Enter a big number");
    int num1 =0;
    // br.readlin() will give us String
    try {
      String x = br.readLine();
      num1 = Integer.parseInt(x);
    } catch (NumberFormatException e) {
      System.out.println("NumberFormantException");
    } catch (IOException e) {
      System.out.println("IO exception");
    }
    System.out.println(num1);
    try {
      br.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
