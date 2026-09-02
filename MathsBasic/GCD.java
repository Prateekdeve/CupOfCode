//You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.

import java.util.Scanner;

public class GCD{
  public static void main(String args[]){
    int n1 ,n2;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n1 :");
    n1 = sc.nextInt();
    System.out.print("Enter n2 :");
    n2 = sc.nextInt();

    // Brute-Force Method.
    // int commondivisor=1;
    // if (n1 == 0 && n2 == 0) {
    //     throw new IllegalArgumentException("GCD is undefined for both numbers being zero.");
    // }
    // for(int i = Math.min(n1 ,n2);i>=1;i--){
    //   if(n1 % i == 0 && n2 % i == 0){
    //     commondivisor =i;
    //     break;
    //   }
    // }
    // System.out.println("Commondivsior ="+commondivisor);
    
    System.out.println("GCD ="+gcd(n1 ,n2));
    sc.close();
  }
  // Euclidean Method
  public static int gcd(int a ,int b){
    while(b !=0){
      int temp =b;
      b = a%b;
      a = temp;
    }
    return a;
  }
  // Example if a,b = 24 , 10
  // Dry Run 
  // b = 10 (!= 0),move inside while loop
  // temp = 10
  // b = 24 %10 -> 4
  // a = 10(temp)
  // Again b=4(!=0)
  // temp = 4;
  // b = 10 %4 -> 2
  // a = temp = 4
  // Once again
  // b = 2(!= 0)
  // temp = 2
  // b = 4 %2 -> 0
  // a = 2(temp)
  // Again b = 0 , 
  // But this time b = 0 ,loop condition false 
  // Return gcd value as "a=2";
  
}


// The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.