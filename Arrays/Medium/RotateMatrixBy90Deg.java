import java.util.Scanner;

public class RotateMatrixBy90Deg {
  public static void main(String[] args) {
    int n ,m;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter rows:");
    n = sc.nextInt();
    System.out.print("Enter columns:");
    m = sc.nextInt();

    int mat[][] = new int[n][m];
    System.out.print("Enter the matrix elements:");
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        mat[i][j] = sc.nextInt();
      }
    }

    RotateMatrix90DegBrute(n,m ,mat);

    sc.close();
  }

  static void RotateMatrix90DegBrute(int n ,int m ,int mat[][]){
    int ans[][] = new int[m][n];
    for(int i = 0;i<n;i++){
      for(int j=0;j<n;j++){
        ans[j][n-1-i] = mat[i][j];
      }
    }

    System.out.println("Rotated Matrix:");
    System.out.println("[");
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        System.out.print(ans[i][j]+ " ");
      }
      System.out.println();
    }
    
  }
}
