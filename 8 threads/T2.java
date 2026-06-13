// second method of using thread
// thread implements runnable so we can 
// so we can also use parent interface also

class A implements Runnable{
  public void run(){
    for(int i=0;i<1000;i++){
      System.out.println("hi");
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
class B  implements Runnable{
  public void run(){
    for(int i=0;i<=1000;i++){
      System.out.println("Helllo");
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
public class T2 {
  public static void main(){
    A obj1 = new A();
    B obj2 = new B();

    Thread T1 = new Thread(obj1);
    Thread T2 = new Thread(obj2);
    T1.start();
    T2.start();
  }
}
