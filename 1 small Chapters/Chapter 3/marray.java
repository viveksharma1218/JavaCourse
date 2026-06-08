// this is multidimensional Array

public class marray {
  
  public static void main(){
    int num[][] = new int[3][4];
    for(int i=0; i<3;i++){
      for(int j=0; j<4; j++){
        num[i][j]= (int)(Math.random()*100);
        System.out.print(num[i][j] + " - ");
      }
      System.out.println("");
    } 
    // lets use enhaced for loop that will access values one by one
    for(int m[]:num){
      for(int n : m){
        System.out.print(n + " - ");
      }
      System.out.println("");
    }
  }
}
