// different approach of comparision

import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student>{
  String name;
  int age;
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }

  public int compareTo(Student that) {
      if(this.age  > that.age){
        return 1;
      }
      else{
        return -1;
      }
  }
  
  
}
public class C7 {
  public static void main(){

  // Comparator <Student> com = new Comparator<Student>() {
  //   public int compare (Student i , Student j){
  //     if(i.age  > j.age){
  //       return 1;
  //     }
  //     else{
  //       return -1;
  //     }
  //   }
  // };
  List <Student> stud = new ArrayList<>();
  stud.add(new Student("jacksparrow",22));
  stud.add(new Student("ironman",43));
  stud.add(new Student("captainAmerica",888));
  stud.add(new Student("hulk",11));
  stud.add(new Student("blackWidow",99));
  
  // Collections.sort(stud,com);

  System.out.println(stud);
 } 
}
