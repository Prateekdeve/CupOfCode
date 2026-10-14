import java.util.ArrayList;
import java.util.Scanner;

public class MoveZeroestoEnd {
  public static void main(String[] args) {

    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter array elemnents: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Move0atEnd(arr, n);
    System.out.print("Array after moving 0s at end :[");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.print("]");

    sc.close();
  }

  // // Brute - Force Approach
  // static void Move0atEnd(int arr[] ,int n){
  // ArrayList<Integer> temp = new ArrayList<>();
  // // Collect non-zero elements
  // for(int i=0 ;i<n;i++ ){
  // if(arr[i] != 0){
  // temp.add(arr[i]);
  // }
  // }

  // // Copy non-zero elements back
  // int nz = temp.size();
  // for(int i =0 ;i<nz ;i++){
  // arr[i] = temp.get(i);
  // }

  // // Fill remaining with zeros
  // for(int i = nz;i<n;i++){
  // arr[i] = 0;
  // }
  // }

  // Optimal Approach (two pointers, in-place swapping)
  static void Move0atEnd(int arr[], int n) {
    int j = -1;

    // Find first zero index
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        j = i;
        break;
      }
    }

    // If no zero found, array already fine
    if (j == -1)
      return;

    // Traverse and swap non-zero with zero
    for (int i = j + 1; i < n; i++) {
      if (arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
    }
  }
}
