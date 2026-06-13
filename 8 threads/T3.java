// lets use lemda expression on T2 file
// we are making class A  and B just to implement Runnable
// class A implements Runnable{
//   public void run(){
//     for(int i=0;i<1000;i++){
//       System.out.println("hi");
//       try {
//         Thread.sleep(10);
//       } catch (Exception e) {
//         System.out.println(e.getMessage());
//       }
//     }
//   }
// }
// class B  implements Runnable{
//   public void run(){
//     for(int i=0;i<=1000;i++){
//       System.out.println("Helllo");
//       try {
//         Thread.sleep(10);
//       } catch (Exception e) {
//         System.out.println(e.getMessage());
//       }
//     }
//   }
// }
public class T3 {

  public static void main(){
    // using anonymus class
    Runnable obj1 = new Runnable() {
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
    };
    // lemda expression 
    Runnable obj2 = () -> {
        for(int i=0;i<1000;i++){
          System.out.println("hello");
          try {
            Thread.sleep(10);
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
        }
      };
    Thread t1 = new Thread(obj1);
    Thread  t2 = new Thread(obj2);
    t1.start();
    t2.start();
  }
  
}
