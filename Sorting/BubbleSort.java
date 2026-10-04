import java.util.Scanner;

// Given an array of size n , sort the elements in the ascending order using Bubble sort.
public class BubbleSort{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    n = sc.nextInt();

    int arr[] = new int[n];
    for(int i =0;i<n ;i++){
      arr[i] = sc.nextInt();
    }

    Bubblesort(arr ,n);

    System.out.print("Sorted Array:[");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.print("]");
    sc.close();
  }

  // Bubble Sort logic
  static void Bubblesort(int arr[] ,int n){
    for(int i=n;i>0;i--){
      for(int j=0;j<i-1;j++){
        if(arr[j] >arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
}