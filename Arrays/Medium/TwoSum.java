import java.util.Scanner;

public class TwoSum{
  public static void main(String args[]){
    int n;
    System.out.print("Enter array size:");
    Scanner sc = new Scanner(System.in);
    n= sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter array elements:");
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter target value:");
    int target = sc.nextInt();
    TwoSumBruteForce(arr ,n,target);
  }
  static void TwoSumBruteForce(int arr[],int n,int target){
    for(int i=0 ;i<n ;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]+arr[j] == target){
          System.out.println("Indices for i= "+i+"j= "+j);
          return ;
        }
      }
    }
    System.out.println("No pair found.");
  }
}