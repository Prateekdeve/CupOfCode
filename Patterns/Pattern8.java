import java.util.Scanner;

public class Pattern8 {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    n = sc.nextInt();
    for(int i =n -1; i>=0;i--){
      //spaces
      for(int j=0 ;j< n-i-1 ;j++){
        System.out.print(" ");
      }
      // stars
      for(int j = 2 *i+1 ;j> 0 ;j--){
        System.out.print("*");
      }
      // spaces
      for(int j =0 ;j<n-i-1 ;j++){
        System.out.print(" ");
      }
      System.out.println(" ");
    }

    // *********
    //  *******
    //   *****
    //    ***
    //     *
  }
}
