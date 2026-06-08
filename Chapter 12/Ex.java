// exceptions

public class Ex {
  public static void main(){
    int i = 0;
    int j = 0;
    int num[] = new int[5];
    int x = 0;
    try{
      j = 100 / i;
      System.out.println("after getting exception code after that will" +
      "not be executed. It will jump to catch block");

      // we are trying to create new exception by trying to access 7th item in array
      x = num[7];
    }catch(ArithmeticException e){
      System.out.println("can not divide a number by Zero - ");
    }
    // before this we are not handling exception other than ArithmeticException
    catch(ArrayIndexOutOfBoundsException e ){
      System.out.println("Array index out of bound exception");
    }
    // if we are not sure what kind of exception we are hadling
    // than put this at the end because if we put at start than other exception 
    // will not work
    catch (Exception e){
      System.out.println("exception handling ...");
    }
    System.out.println(j + x);
  }
}
