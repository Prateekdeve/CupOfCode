
// Given an array of size n . Find the length of the longest subarray such that its elements sum is equal to k.

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArraywithKSum {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n = sc.nextInt();

    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    int k;
    System.out.println("Enter value of k:");
    k= sc.nextInt();
    
    // Finding the length of longest subarray

    // int len = LongestSubarraywithKSumBrute(arr ,n ,k);
    int len = LongestSubarraywithKSumHashing(arr ,n ,k);
    System.out.print("Length of longest subarray with sum="+k+"is "+len);


    sc.close();
  }

  static int LongestSubarraywithKSumBrute(int arr[],int n,int k){
    int len =0;
    for(int i=0 ;i<n ;i++){
      int sum =0;
      for(int j=i ;j<n;j++){
        sum += arr[j];
        if(sum == k){
          len = Math.max(len ,j-i+1);
        }
      }
    }
    return len;
  }

  static int LongestSubarraywithKSumHashing(int arr[] ,int n ,int k){
    int maxLen =0;
    int prefixSum =0;

    HashMap<Integer ,Integer> prefixMap = new HashMap<>();
    for(int i=0;i<n;i++){

      // Subarray starts from index 0
      prefixSum += arr[i];

      if(prefixSum == k){
        maxLen += 1;
      }
      
      // Check if (sum-k) exists 
      int rem = prefixSum -k;
      if(prefixMap.containsKey(rem)){
        int len = i - prefixMap.get(rem);
        maxLen = Math.max(maxLen ,len);
      }

      // Store first occurence only.
      if(!prefixMap.containsKey(prefixSum)){
        prefixMap.put(prefixSum,i);
      }
      
    }
    return maxLen;
  }
}
