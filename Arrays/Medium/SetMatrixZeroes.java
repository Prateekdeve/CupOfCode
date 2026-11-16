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

    // BetterApproachSeperateArrays(arr, n, m);

    setMatrixZeroesOptimal(arr, n, m);
    sc.close();
  }

  static void setMatrixZeroesOptimal(int[][] arr, int n, int m) {
    int col0 = 1;

    // Step 1 : Mark rows and columns
    for (int i = 0; i < n; i++) {
      if (arr[i][0] == 0) {
        col0 = 0;
      }
      for (int j = 1; j < m; j++) {
        if (arr[i][j] == 0) {
          arr[i][0] = 0;
          arr[0][j] = 0;
        }
      }
    }

    // Set elements to 0 based on markers
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < m; j++) {
        if (arr[i][j] != 0) {
          if (arr[i][0] == 0 || arr[0][j] == 0) {
            arr[i][j] = 0;
          }
        }
      }
    }

    // Handle first Row
    if (arr[0][0] == 0) {
      for (int j = 0; j < m; j++) {
        arr[0][j] = 0;
      }
    }

    // Handle first column
    if (col0 == 0) {
      for (int i = 0; i < n; i++) {
        arr[i][0] = 0;
      }
    }

    // Print matrix
    System.out.println("Matrix after setting zeroes:");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
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
