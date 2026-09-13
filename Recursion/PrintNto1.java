import java.util.Scanner;

public class PrintNto1{
  static void Printnto1(int n){
    if(n<=0){
      return;
    }
    System.out.println(n);
    Printnto1(n-1);
    
  }
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of n:");
    n = sc.nextInt();
    Printnto1(n);

  }
}

// Given an integer n, write a function to print all numbers from n to 1 (inclusive) using recursion.

// The function should print each number on a separate line, in decreasing order from n to 1