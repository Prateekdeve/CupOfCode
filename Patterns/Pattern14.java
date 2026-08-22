import java.util.Scanner;

public class Pattern14{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    n = sc.nextInt();
    
    for(int i =0;i<n;i++){
      for(int j=0 ;j<=i;j++){
        // Print character by converting ASCII value
        System.out.print((char) ('A'+j));
      }    
      System.out.println(" ");
    }
  }
}

// Target Pattern
// A
// AB
// ABC
// ABCD
// ABCDE