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

    RotateMatrix90DegOptimalSquare(n,mat);
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
    System.out.print("]");
  }
  static void RotateMatrix90DegOptimalSquare(int n ,int mat[][]){
    // Transposing Matrix
    for(int i=0;i<n;i++){
      for(int j =i+1;j<n;j++){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
      }
    }

    // Reverse each row
    for(int i=0;i<n;i++){
      int left =0;
      int right = n-1;

      while(left < right){
        int temp = mat[i][left];
        mat[i][left] = mat[i][right];
        mat[i][right] = temp;
        left ++;
        right --;
      }
    }

    System.out.println("Rotated Matrix:");
    System.out.print("[");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
    System.out.print("]");
    
  }
}
