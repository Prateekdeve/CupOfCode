import java.util.Scanner;

// Given an array of size n and it contain number that appears twice and a single number that appears once only . 
// Find that one number that appears once.

public class NumberAppearingOnce {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of the array:");
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter elements:");
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    // Brute Force Approach : Linear Search
    int ans = numAppearOnceBrute(arr ,n);
    System.out.print("Number appearing once is "+ans);

    sc.close();
  }
  static int numAppearOnceBrute(int arr[],int n){
    for(int i =0 ;i<n;i++){
      int cnt =0;
      int num = arr[i];
      for(int j=0;j<n;j++){
        if(arr[j] == num){
          cnt++;
        }
      }
      if(cnt == 1){
        return num;
      }
    }
    return -1;
  }
}
