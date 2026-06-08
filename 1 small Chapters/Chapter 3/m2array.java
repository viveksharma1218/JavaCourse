// different size of array inside one array

public class m2array {
  public static void main(){
    // size of arrays not decided yet
    int num[][] = new int [3][];
    // let's finalize size of array's
    num[0] = new int[4];
    num[1] = new int [3];
    num[2] = new int[2];

    // let's put values in these arrays
    for(int i=0; i < num.length;i++){
      for(int j=0; j < num[i].length;j++){
        num[i][j] = (int)(Math.random()*100);
        System.out.print(num[i][j] +" - ");
      }
      System.out.println(" ");
    }
  }
  
}
