import java.util.Scanner;

public class LeftRotateArray{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.print("Enter array elemnents: ");
    for(int i =0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    // Rotating function
    LeftrotateArray(n,arr);
    sc.close();

  }
  static void LeftrotateArray(int n,int arr[]){
    int temp = arr[0];
    for(int i=1;i<n;i++){
      arr[i-1] = arr[i];
    }
    arr[n-1] = temp;
    // print rotated array
    System.out.print("Array after left rotation: [");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]);
      if (i < n - 1) System.out.print(", ");
    }
    System.out.println("]");
  }
}