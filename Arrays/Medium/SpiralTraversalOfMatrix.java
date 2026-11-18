// Given a matrix of size n * m . Find the spiral traversal of a matrix.
import java.util.Scanner;

public class SpiralTraversalOfMatrix{
  public static void main(String[] args) {
    int n,m;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n:");
    n = sc.nextInt();
    System.out.println("Enter m:");
    m = sc.nextInt();
    
    int arr[][] = new int[n][m];
    System.out.print("Enter matrix elements:");
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    
    SpiralMatrixOptimal(arr,n,m);

    sc.close();
  }

  static void SpiralMatrixOptimal(int arr[][],int n ,int m){
    int top =0;
    int bottom = n-1;
    int left =0;
    int right = m-1;

    while(top <= bottom && left <= right){

      // Left to right traversal
      for(int i =left ;i<= right ;i++){
        System.out.println(arr[top][i]+" ");
      }
      top++;

      // Top to bottom traversal
      for(int i= top ;i <= bottom ;i++){
        System.out.println(arr[i][right]);
      }
      right--;

      // Right to Left Traversal
      if(top <= bottom){
        for(int i= right ;i>= left;i--){
          System.out.println(arr[bottom][i]);
        }
        bottom--;
      }

      // Bottom to Top Traversal
      if(left<= right){
        for(int i = bottom ;i>= top ;i--){
          System.out.println(arr[i][left]+" ");
        }
        left++;
      }
    }

    // Printing Spiral Array
    System.out.println("Spiral Array: ");
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.println(arr[i][j]+" ");
      }
    }
  }
}