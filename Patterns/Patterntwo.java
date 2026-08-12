// package CupOfCode.Patterns;

import java.util.Scanner;

public class Patterntwo {
  public static void main(String[] args) {
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value: ");
    n = sc.nextInt();
    for(int i =1 ;i<=n ;i++){
      for(int j=1 ;j<=i ;j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}

// *
// **
// ***
// ****
// *****