// Enum are constant values

enum Status {
  running,pending,failed,success;
}
public class E{
  public static void main(){
    Status run  = Status.running;
    System.out.println("status is "  + run);
    Status[]  ss = Status.values();

    for(Status s : ss){
      System.out.println(s + " " + s.ordinal());
    }
  }
}