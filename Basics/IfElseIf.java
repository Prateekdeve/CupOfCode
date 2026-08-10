// Given marks of a student, print on the screen:

// Grade A if marks >= 90
// Grade B if marks >= 70
// Grade C if marks >= 50
// Grade D if marks >= 35
// Fail, otherwise.


// Example 1

// Input: marks = 95

// Output: Grade A

// Explanation: marks are greater than or equal to 90.

// Example 2

// Input: marks = 14

// Output: Fail

// Explanation: marks are less than 35.

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
