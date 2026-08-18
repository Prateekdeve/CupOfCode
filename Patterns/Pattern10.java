import java.util.Scanner;

public class Pattern10 {
  public static void main(String[] args) {
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n :");
    n = sc.nextInt();

    for(int i =1 ;i<= 2*n;i++){
      // for(int j = 1 ;j<= i ;j++){
      //   System.out.print("*");
      // }
      int stars;
      if( i <= n){
        stars = i;
      }else{
        stars = 2*n -i;
      }
      System.out.print("*".repeat(stars));
      System.out.println(" ");
    }
  }
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
 }
