import java.util.Scanner;

public class MaximumConsecutiveOnes{
  public static void main(String[] args) {
    int n;
    System.out.print("Enter array size:");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter array elements:");
    for(int i =0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    int count =0;
    int maxi =0;

    // Maximum 1s in array.
    for(int i =0; i < n; i++){
      if(arr[i] == 1){
        count++;
        maxi = Math.max(maxi ,count);
      }else{
        count =0;
      }
    }
    System.out.print("Maximum no. of 1s :"+maxi);
    sc.close();
  }
}