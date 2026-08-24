import java.util.Scanner;

public class Pattern17{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    n = sc.nextInt();

    for(int i = 0;i <n;i++){
      for(int j= 0;j<n-i-1;j++){
        System.out.print(" ");
      }
      // Print serially the alphabet
      for(int j=0;j<= i;j++){
        System.out.print((char)('A'+j));
      }
      // Now print in reverse order(descending).
      for(int j=i-1;j>=0 ;j--){
        System.out.print((char)('A'+j));
      }
      System.out.println(" ");
    }
  }
}

// Target Pattern 
//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA