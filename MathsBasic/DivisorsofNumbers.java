import java.util.*;

public class DivisorsofNumbers{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    n = sc.nextInt();

    ArrayList<Integer> divisor = new ArrayList<>();

    for(int i = 1 ;i <= n; i++){
      if(n % i == 0){
        divisor.add(i);
      }
      Collections.sort(divisor);
    }
    System.out.println("Divisors of "+n+" in sorted order ="+divisor);


  }
}
// You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.

// A number which completely divides another number is called it's divisor.