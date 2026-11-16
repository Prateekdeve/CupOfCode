import java.util.Scanner;

public class SetMatrixZeroes {
  public static void main(String[] args) {
    int n;
    int m;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    n = sc.nextInt();

    System.out.print("Enter m:");
    m = sc.nextInt();
    int arr[][] = new int[n][m];

    System.out.print("Enter matrix elements:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    BetterApproachSeperateArrays(arr, n, m);

    sc.close();
  }

  static void BetterApproachSeperateArrays(int arr[][], int n, int m) {
    int row[] = new int[n];
    int col[] = new int[m];

    // Mark row and columns containing 0
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] == 0) {
          row[i] = 1;
          col[j] = 1;
        }
      }
    }

    // Set matrix elements to 0
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (row[i] == 1 || col[j] == 1) {
          arr[i][j] = 0;
        }
      }
    }

    // Print updated matrix
    System.out.print("Matrix after setting zeroes:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(arr[i][j] + " ");
      }
    }
  }
}
