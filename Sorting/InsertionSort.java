import java.util.Scanner;

public class InsertionSort{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array:");
    n = sc.nextInt();

    // Array
    int arr[] = new int[n];
    for(int i=0 ;i<n ;i++){
      arr[i] = sc.nextInt();
    }

    Insertionsort(arr,n);

    System.out.print("Sorted Array[");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+"  ");
    }
    System.out.print(("]"));

    sc.close();
  }

  static void Insertionsort(int arr[],int n){
    for(int i =0;i<=n-1;i++){
      int j=i;
      while(j>0 && arr[j-1] > arr[j]){
        int temp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = temp;
        j--;
      }
    }
  }
}