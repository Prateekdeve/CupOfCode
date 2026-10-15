import java.util.Scanner;

public class OptimalLeftRotateDPlace{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size:");
    n = sc.nextInt();

    // Array input
    int arr[] = new int[n];
    System.out.print("Enter array elements:");
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int d;
    System.out.print("Enter d");
    d = sc.nextInt();

    d= d%n;
    RotateDPlace(arr ,n ,d);

    System.out.print("Rotated Array: [ ");
    for(int i =0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println(" ]");

    sc.close();
  }
  static void RotateDPlace(int arr[] ,int n ,int d){
    reverse(arr ,0 ,d-1);// Reverse d elements
    reverse(arr ,d ,n-1);// Reverse n-d elem
    reverse(arr ,0 ,n-1);//Reverse whole array
  }
  static void reverse(int arr[],int start ,int end){
    while(start <= end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}