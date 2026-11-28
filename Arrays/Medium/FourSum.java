
import java.util.Scanner;
public class FourSum{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n = sc.nextInt();

    System.out.println("Enter array elments:");
    int arr[]  = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int target;
    // arr[i]+arr[j]+arr[k]+arr[l] == target
    System.out.print("Enter target value");
    target = sc.nextInt();
    BruteForce(arr ,n,target);

    sc.close();
  }

  static void BruteForce(int arr[],int n,int target){
    boolean found = false;
    for(int i=0;i<n-3;i++){
      for(int j=i+1; j<n-2;j++){
        for(int k=j+1;k<n-1;k++){
          for(int l=k+1;l<n;l++){
            int sum = arr[i]+arr[j]+arr[k]+arr[l];
            if(sum == target){
              found =true;
              System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+","+arr[l]+"]");
            }
          }
        }
      }
    }

    if(!found ){
      System.out.println("No quadruplet found.");
    }
  }
}