// Print table of a number n

import java.util.Scanner;

public class ForExample {

  public static void main(String[] args) {
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number whose number you want to print: ");
    n = sc.nextInt();
    for(int i =1 ;i <= 10;i++){
      System.out.println(n*i);
    }
  }
}
