//You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.

import java.util.Scanner;

public class ArmstrongNumber{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n :");
    n = sc.nextInt();
    
    int sum =0;
    // Loop ke karan n ki value change ho jayegi isliye n ko digit me store karna padega.
    int originalNum = n;
    int digit = String.valueOf(n).length();
    while(n != 0){
      int lastdigit = n %10; 
      // For 3 digit armstrong number
      //sum = sum + (lastdigit*lastdigit*lastdigit);
      sum += Math.pow(lastdigit,digit);
      n = n/ 10;
      
    }
    if(sum == originalNum){
        System.out.println("Armstrong Number !");
      }else{
        System.out.println("Not a Armstrong Number!");
      }
  }
}

// An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.