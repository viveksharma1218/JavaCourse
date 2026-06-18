// lets use another collection named map
// it contains key value pair 

import java.util.HashMap;
import java.util.Map;

public class C3 {
  public static void main(){
    Map <String, Integer> Students = new HashMap<>();
    
    // keys cannot be same and values can be same

    Students.put("jacksparrow", 45);
    Students.put("ironman", 67);
    Students.put("hulk", 87);
    Students.put("captainAmerica", 33);
    Students.put("blackWidow", 55);
    Students.put("blackWidow", 45);
    Students.put("panther", 45);

    // practice different methods of collections

    System.out.println(Students.keySet());

    for(String key : Students.keySet()){
      System.out.println(key + " _ " + Students.get(key));
    }

    // you will not get key , value pairs in order
    
  }
}
