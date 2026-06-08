// why we need interfaces understand with this example
// we need a developer to write code and developer will require
// a dekstop or laptop to write code
// we will make a parent class computer for laptop and dekstop
// so we can use any one laptop or dekstop for devloper

interface computer {
  public  void code();
}
class laptop implements computer{
  public void code(){
    System.out.println("coding in laptop");
  }
}
class Desktop implements computer{
  public void code(){
    System.out.println("coding in desktop");
  }
}
class Developer{
  public void devApp(computer com){
    com.code();
  }
}
public class I2 {
  public static void  main(){
      computer lap = new laptop();
      computer des = new Desktop();
      Developer jackSparrow = new Developer();
      jackSparrow.devApp(lap);
      jackSparrow.devApp(des);
  } 
}
