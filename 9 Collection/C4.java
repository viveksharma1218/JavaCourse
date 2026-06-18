// how to sort collection values

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C4 {
  public  static void main(){
    List<Integer> nums = new ArrayList<>();
    nums.add(4);
    nums.add(44);
    nums.add(89);
    nums.add(33);
    nums.add(21);

    Collections.sort(nums);
    System.out.println(nums);
    
  }  
}
