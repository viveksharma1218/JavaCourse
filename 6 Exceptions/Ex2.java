// Throw keyword
// creating our own exception

class MyException extends Exception {
  public MyException(String str){
    super(str);
  }
}

public class Ex2 {
  public static void main(){
    int i = 0;
    int j = 0;

    try{
      if (i == 0){
        throw new MyException("i can not be zero");
      }
    }catch(MyException e){
      System.out.println(e);
    }
    System.out.println(j);
  }
}
