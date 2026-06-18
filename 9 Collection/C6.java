// sorting object values

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
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
  
  
}

public class C6 {
 public static void main(){

  // Comparator is functional interface so we can use lemda expression

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
  Comparator <Student> com = (Student i , Student j)->{
    // lets use here ternary operator instead of if else
      return (i.age>j.age) ? 1 : -1 ;
  };
  List <Student> stud = new ArrayList<>();
  stud.add(new Student("jacksparrow",22));
  stud.add(new Student("ironman",43));
  stud.add(new Student("captainAmerica",888));
  stud.add(new Student("hulk",11));
  stud.add(new Student("blackWidow",99));
  
  Collections.sort(stud,com);
  System.out.println(stud);
 } 
}
