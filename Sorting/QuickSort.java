
// Recursion + Divide and Conquer.
import java.util.Scanner;

public class QuickSort{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array:");
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter elements of array:");
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int low =0;
    int high = n-1;
    quickSort(arr ,low ,high);

    System.out.print("Sorted Array:");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }

    sc.close();
  }
  static void quickSort(int arr[],int low ,int high){
    if(low <high){
      int partIndex = part(arr ,low ,high);
      quickSort(arr,low ,partIndex-1);
      quickSort(arr ,partIndex+1,high);
    }
  }
  static int part(int[] arr,int low,int high){
    int pivot = arr[low];
    int i =low;
    int j = high;

    while(i<j){
      while(arr[i] <= pivot && i<= high){
        i++;
      }
      while(arr[j] > pivot && j >= low){
        j--;
      }
      if(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j;
  }
}