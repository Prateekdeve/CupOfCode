import java.util.Scanner;

public class Pattern19 {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    n = sc.nextInt();
    // Upper half
    for (int i = n; i >= 1; i--) {

      // First group of stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // Spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      // Second group of stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

    // Lower half
    for (int i = 1; i <= n; i++) {

      // First group of stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // Spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      // Second group of stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
// Target Pattern

// **********
// **** ****
// *** ***
// ** **
// * *
// * *
// ** **
// *** ***
// **** ****
// **********