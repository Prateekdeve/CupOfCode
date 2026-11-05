// Given an array of size n with both negatives and positive integer find the maximum sum that we can get from a subarray .

import java.util.Scanner;

public class KadaneAlgoMaxSubArraySum {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter elements of array:");
    for (int index = 0; index < n; index++) {
      arr[index] = sc.nextInt();
    }

    BruteForceMaxElem(arr ,n);

    sc.close();
  }

  // Brute Force Method -> O(n^3)
  static void BruteForceMaxElem(int arr[],int n){
    int maxi = Integer.MIN_VALUE;
    
    for(int i =0;i<n;i++){
      for(int j=i;j<n;j++){
        int sum =0;
        for(int k =i;k <= j;k++){
          sum += arr[k];
        }
        if (sum > maxi) {
          maxi = sum;
        }
      }
    }
    System.out.print("Maximum sum in subarray is "+maxi);
  } 

  // Better Approach -> O(n^2)
  static void BetterApproach(int arr[],int n){
    int maxi = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      int sum =0;
      for(int j=i;j<n;j++){
        sum += arr[j];
        if(sum >maxi){
          maxi = sum;
        }
      }
    }
    System.out.println("Max element is "+ maxi);
  }

  // Optimal Approach -> Kadane's Algorithm(O(n))
  static void KadaneAlgo(int arr[],int n){
    int maxi = Integer.MIN_VALUE;
    int sum =0;
    int start =0;
    int end =0;
    int tempstart=0;
    for(int i =0;i<n;i++){
      if(sum == 0){
        tempstart =i;
      }
      sum += arr[i];

      if(sum > maxi){
        maxi = sum;
        start = tempstart;
        end =i;
      }
      if(sum <0){
        sum =0;
      }
    }
    System.out.println("Maximum Sum ="+maxi);
    System.out.print("Subarray:[");
    for(int i=start;i<= end;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println("]");
  }

}
