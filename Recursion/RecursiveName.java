// Given an integer N, write a program to print your name N times.

import java.util.Scanner;

public class RecursiveName{
  public static void recname(int n){
    if(n <= 0){
      return;
    }System.out.println("Prateek");
    recname(n-1);
    
  }
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    n = sc.nextInt();
    recname(n);
  }
}