// Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.

import java.util.Scanner;

public class Print1toN{
  static void Print1ton(int n){
    
    if(n ==0){
      return ;
    }
    Print1ton(n-1);
    System.out.println(n);
    
  }
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner( System.in);
    System.out.print("Enter n:");
    n = sc.nextInt();
    
    Print1ton(n);
  }
}

