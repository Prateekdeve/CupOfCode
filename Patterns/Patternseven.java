import java.util.Scanner;

public class Patternseven{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value (n) :");
    n = sc.nextInt();
    
    for(int i=1 ;i <=n ;i++){
      // space 
      for(int j = 1 ; j <= n-i ;j++){
        System.out.print(" ");
      }
      // star
      for(int k = 1 ; k<= 2*i -1;k++){
        System.out.print("*");
      }
      // space 
      for(int l = 1;l <= n-i;l++){
        System.out.print(" ");
      }
      System.out.println(" ");
    }
  }
}

//     *
//    ***
//   *****
//  *******
// *********

// For zero based indexing
// Only for loop logic here
// for(int i=0 ;i<n ;i++){
//       // spaces 
//       for(int j =0 ;j<n-i-1 ;j++){
//         System.out.print(" ");
//       }
//       for (int j=0 ;j < 2*i+1 ;j++){
//         System.out.print("*");
//       }
//       for(int k =0;k< n-i-1; k++){
//         System.out.print(" ");
//       }
//       System.out.println(" ");
//     }