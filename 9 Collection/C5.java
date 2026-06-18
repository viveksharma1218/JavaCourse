// we will sort collection with our own logic 
// like in incresing order but compare only first digit only
// 24 is bigger than 53 because we are comparing only 4 and 3

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C5 {
  public static void main(){
    Comparator<Integer> com = new Comparator<>() {
      public int compare(Integer i , Integer j){
        if(i%10 > j % 10){
          return 1;
        }
        else{
          return -1;
        }
      }
    };
    List<Integer> nums =  new ArrayList<>();
    nums.add(34);
    nums.add(65);
    nums.add(82);
    nums.add(91);
    Collections.sort(nums,com);
    System.out.println(nums);
  }
}
