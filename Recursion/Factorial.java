import java.util.Scanner;

public class Factorial {
  static int CalcFact(int n){
    int fact = 1;
    if(n == 0 || n == 1){
      return fact = 1;
    }

    return n * CalcFact(n-1);
  
  }
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    n = sc.nextInt();
    int FactorialOfNumber = CalcFact(n);
    System.out.println("Factorial of "+n+ " is "+FactorialOfNumber);
  }
}

// Finding factorial of a number n.
