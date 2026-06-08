

public class array {
  
  public static void main(){
    int nums []  = {1,3,5,7};

    System.out.println("this is index 2 value : " + nums[2]);

    // dynamic array , here 4 is the size of array
    int nums2 [] = new int[4];
    // here all values are 0 so let's assign the values
    for(int i=0;i<4;i++){
      nums[i] = (i+1)*2;
      System.out.println(nums[i]);
    }

  }
}
