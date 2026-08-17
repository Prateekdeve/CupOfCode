import java.util.Scanner;

public class Pattern9{
  public static void main(String[] args) {
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    n = sc.nextInt();

    // Star Pyramid Logic
    for(int i =0 ;i<n ;i++){
      // Spaces
      for(int j =0; j<n-i-1 ;j++){
        System.out.print(" ");
      }
      for(int j =0 ; j < 2*i -1 ;j++){
        System.out.print("*");
      }
      for(int j =0 ;j< n-i-1 ;j++){
        System.out.print(" ");
      }
      System.out.println();
    }

    // Upside Pattern
    for(int i = n-1 ; i>=0 ;i--){
      for(int j = 0; j < n-i-1 ;j++){
        System.out.print(" ");
      }
      // Star
      for(int j = 0 ;j < 2*i-1;j++){
        System.out.print("*");
      }
      // Spaces
      for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
      }
      System.out.println();
    }




// Target Pattern->
//     * 
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *
  }
}