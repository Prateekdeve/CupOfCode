// Find grade of a student who enters his marks under 100.
// Grade A if marks >= 90
// Grade B if marks >= 70
// Grade C if marks >= 50
// Grade D if marks >= 35
// Fail



import java.util.Scanner;

public class IfElseIf {
  public static void main(String[] args) {
    System.out.print("Enter marks: ");
    int marks;
    Scanner sc = new Scanner(System.in);
    marks = sc.nextInt();

    if(marks >= 90){
      System.out.println("Grade = A");
    }else if(marks >= 70){
      System.out.println("Grade = B");
    }else if(marks >= 50 ){
      System.out.println("Grade = C");
    }else if(marks >= 35){
      System.out.println("Grade = C");
    }else{
      System.out.println("Fail ! But don't get disappointed.'");
    }

  }
}
