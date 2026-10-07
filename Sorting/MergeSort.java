// Merge Sort -> The art of breaking array into equal pieces and the perform sorting using recursion.

// Concept Used -> Recursion
import java.util.Scanner;

public class MergeSort {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of the array: ");
    n = sc.nextInt();

    int arr[] = new int[n];

    System.out.print("Enter elements: ");
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    int l = 0;
    int r = n - 1;
    mergeSort(arr, l, r);

    System.out.print("Sorted Array [ ");
    for(int i = 0; i < n; i++){
      System.out.print(arr[i] + " "); 
    }
    System.out.print("]");

    sc.close();
  }

  static void mergeSort(int arr[], int l, int r){
    // Base Case
    if(l >= r){
      return;
    }
    int mid = l + (r - l) / 2;
    mergeSort(arr, l, mid);
    mergeSort(arr, mid + 1, r);
    merge(arr, l, mid, r);
  }

  static void merge(int[] arr, int l, int mid, int r){
    int n1 = mid - l + 1;
    int n2 = r - mid;
    int L[] = new int[n1];
    int R[] = new int[n2]; 
    
    int k = l;
    for(int i = 0; i < n1; i++){
      L[i] = arr[k];
      k++;
    }
    for(int j = 0; j < n2; j++){
      R[j] = arr[k];
      k++;
    }

    int i = 0;
    int j = 0;

    k = l;

    while(i < n1 && j < n2){
      if(L[i] <= R[j]){
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }
    
    while(i < n1){
      arr[k] = L[i];
      i++;
      k++;
    }
    while(j < n2){
      arr[k] = R[j];
      k++;
      j++;
    }
  }
}