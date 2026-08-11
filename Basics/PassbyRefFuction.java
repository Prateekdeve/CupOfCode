// Pass by Reference.
class Student{
  String name;
}
public class PassbyRefFuction {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Prateek";
    System.out.println("Before: "+ s1.name);
    changeName(s1);
    System.out.println("After: "+ s1.name);

  }
  public static void changeName(Student student){
    student.name = "Prince";
     //Here, the object’s property changes because the reference value (address of the object) was passed. Both the method and the caller point to the same object in memory.
    System.out.println("Inside method: "+ student.name);
  }
}
