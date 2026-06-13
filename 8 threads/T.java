// Threads = run operations simultaneously

class A extends Thread {
  public void run(){
    for(int i=0; i <=1000 ;i++){
      System.out.println("hi");
    }
  }
}
class B extends Thread{
  public void run(){
    for(int i=0; i<=1000;i++){
      System.out.println("hello");
    }
  }
}

public class T {
  public static void main(){
    A obj1 = new A();
    B obj2 = new B();
    obj1.start();
    obj2.start();
    // now you check "hi" and "hello" in console you will get some
    // "hi" and some "hello" because it depends on computer speed 
    // if it is fast it can load my "hi" before loading 
  }
}
