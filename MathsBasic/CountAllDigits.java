import java.util.Scanner;

public class CountAllDigits {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n :");
    n = sc.nextInt();
    n = Math.abs(n);
    int count =0;
    if(n ==0){
      count =1;
    }else{
      while(n>0){
        n= n/10;
        count++;
      }
    }
    System.out.println(count);
  }
}

// Target 
//You are given an integer n. You need to return the number of digits in the number.



// The number will have no leading zeroes, except when the number is 0 itself.
