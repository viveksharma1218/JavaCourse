// lets learn another collection "set"
// set can contains only unique values

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C2 {
  public static  void main(){
    Set<Integer> nums = new HashSet<>();
    nums.add(23);
    nums.add(12);
    nums.add(78);
    nums.add(45);
    nums.add(23);
    System.out.println("These are all Values");
    for(int n:nums){
      System.out.println(n);
    }
    System.out.println("you will not find Repeated values");

    // if you want sorted values use TreeSet
    Set<Integer> nums1 = new TreeSet<Integer>();
    nums1.add(23);
    nums1.add(12);
    nums1.add(78);
    nums1.add(45);
    nums1.add(23);
    System.out.println("These are all sorted Values");
    for(int n:nums1){
      System.out.println(n);
    }
  }
}
