// Stream - when we want to work with array and don't want to 
// change original array we can use stream 
// it's makes copy of Array / collection

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class C8 {
  public static void main(){
    List<Integer> nums = Arrays.asList(5,4,3,7,99,34,54,64,64,34,54,66,33);

    Stream<Integer> s1 = nums.stream();
    Stream<Integer> s2 = s1.filter(n -> n%2==0);
    // we can use Stream only once
    //s1.forEach(n  ->  System.out.println(n));
    Stream<Integer> s3 = s2.map(n -> n*2);
    s3.forEach(n -> System.out.println(n));
    // try using different methods of Stream
  }
}
