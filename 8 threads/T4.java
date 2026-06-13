// lets understand synchronize and join

// we will use keyword synchronize so only one thread can 
// use this class at a time
// otherwise two thread will come to this class at a same time 
// and will do same work for example both come to this class
// and get i = 50; now both will add one in 50 so one thread is waste
class  Counter {
  int i ;
  public synchronized void  increment (){
    i++;
  };
}
public class T4 {
  public static void main() throws InterruptedException{
    Counter c = new Counter();
    Runnable obj1 = ()->{
      for(int i=0;i<1000;i++){
        c.increment();
      }
    };

    Runnable obj2 = ()->{
      for(int i=0; i<1000;i++){
        c.increment();
      }
    };
    obj1.run();
    obj2.run();
    Thread T1 = new Thread(obj1);
    Thread T2 = new Thread(obj2);
    T1.start();
    T2.start();
    T1.join();
    T2.join();
    System.out.println(c.i);

  }
}
