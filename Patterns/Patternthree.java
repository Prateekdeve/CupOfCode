//package CupOfCode.Patterns;

import java.util.Scanner;

public class Patternthree {
  public static void main(String[] args) {
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of n :");
    n = sc.nextInt();
    for(int i =1 ;i <=n ;i++){
      for(int j = 1 ; j<= i;j++){
        System.out.print(j );
      }
      System.out.println(" ");
    }
  }
  
}

// 1
// 12
// 123
// 1234
// 12345