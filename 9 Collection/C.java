// Collection is interface and we will use different type 
// of classes that implements collection so we don't have to denife
// all methods inside collection

import java.util.ArrayList;
import java.util.List;

public class C {
  public static void main(){
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);

    // exploring different methods of List

    System.out.println(nums.indexOf(3));

    System.out.println(nums.get(2));

    System.out.println("these are all the values");
    for(Object n :nums){
      // n is object
      int num = (Integer)n;
      System.out.println(num);
    }
  }  
}
