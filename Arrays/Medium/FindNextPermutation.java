import java.util.Scanner;

public class FindNextPermutation {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size :");
    n = sc.nextInt();
    System.out.print("Enter array elements:");
    int arr[] = new int[n];
    for (int index = 0; index < arr.length; index++) {
      arr[index] = sc.nextInt();
    }

    FindNextPermutationOptimal(arr ,n);
  }
  static void FindNextPermutationOptimal(int arr[] ,int n){
    int ind = -1;
    
    // Find the break point.
    for(int i=n-2; i>=0 ;i--){
      if(arr[i]  < arr[i+1]){
        ind = i;
        break;
      }
    }

    // If no breakpoint exists reverse the entire array
    if(ind == -1){
      reverse(arr ,0 ,n-1);
      printArray(arr);
      return ;
    }

    // Find the next greater element and swap
    for(int i=n-1;i>ind;i--){
      if(arr[i] > arr[ind]){
        swap(arr ,i ,ind);
        break;
      }
    }

    // Reversing the remaining part.
    reverse(arr ,ind+1 ,n-1);
    printArray(arr);
  }
}
