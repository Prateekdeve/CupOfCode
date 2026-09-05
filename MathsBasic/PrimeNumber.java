import java.util.Scanner;

public class PrimeNumber{
  public static void main(String args[]){
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    n = sc.nextInt();
    int count =0;
    
    // Brute Force Method for Prime.
    // if(n == 1 || n== 0){
    //   System.out.println("Not a Prime Number!");
    // }
      
    // for(int i =1 ;i<=n ;i++){
    //     if(n % i == 0){
    //       count++;
    //     }
        
    // }
    
    // if(count <= 2){
    //   System.out.println("Prime Number");
    // }
    // else{
    //   System.out.println("Composite Number !");
    // }

    
    // Optimized method using sqrt of n.
    boolean isPrime = true;
    if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }
  }
}