// Given an integer x, return Palindrome if x is a palindrome, and Not Palindrome otherwise

import java.util.Scanner;

public class Palindrome{
  public static void main(String[] args) {
    int x;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter x:");
    x = sc.nextInt();
    if(x <0){
      System.out.print("Not Palindrome !");
    }else{
      int reverse =0;
      int xcopy = x;
      while(x>0){
        reverse = reverse*10 + (x%10);
        x = x/10;
      }
      if(xcopy == reverse){
        System.out.println("Palindrome Number!");
      }else{
        System.out.println("Not Palindrome!");
      }
    }
  }
}

// Dry Run on ex - 121
//121 -> 121 %10 = 1  reverse = 0*10 + 1 = 1
// 121/10 -> 12
// 12>0 
// 12%10 = 2 reverse = 1*10 + 2 =12
// 12/10 = 1
// 1>0 
// 1%10 == 1 reverse = 12*10 + 1 =121
// 1 /10 == 0 // Move out of while loop
// Print Palindrome Number!