import java.util.Scanner;

public class Pattern18{
  public static void main(String[] args) {
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    n = sc.nextInt();
    for(int i = 1; i <= n; i++){
      for(int j =0;j<i;j++){
        System.out.print((char) ('A' + n - i + j) + " ");
      }
      System.out.println(" ");
    }

  }
}
// E 
// D E 
// C D E 
// B C D E 
// A B C D E