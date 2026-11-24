// Given an array of size n . Return all the unique triplets from it whose sum is equal to 0.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
public class ThreeSum{
  public static void main(String args[]){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size");
    n = sc.nextInt();

    int arr[] = new int[n];

    System.out.print("Enter array elements:");
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    //ThreeSumBrute(arr ,n);

    ThreeSumBetter(arr, n);
  }

  static void ThreeSumBrute(int arr[] ,int n){
    HashSet<String> ans = new HashSet<>();
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        for(int k = j+1;k<n;k++){
          if(arr[i] + arr[j] + arr[k] == 0){
            int temp[] = {arr[i],arr[j],arr[k]};
            Arrays.sort(temp);
            ans.add(temp[0]+" "+temp[1]+" "+temp[2]);
          }
        }
      }
    }
    if(ans.isEmpty()){
      System.out.println("No triplets found");
    }else{
      System.out.println("Unique Triplets:");
      
      for(String triplet: ans){
        System.out.print("["+triplet+"]");
      }
    }

  
  }
  static void ThreeSumBetter(int arr[] ,int n){
    HashSet<String>  ans = new HashSet<>();
    for(int i = 0;i<n ;i++){
      HashSet<Integer> hashSet = new HashSet<>();
      for(int j = i+1 ;j<n ;j++){
        int third = -(arr[i]+ arr[j]);
        if(hashSet.contains(third)){
          int temp[] = {arr[i] ,arr[j] ,third};
          Arrays.sort(temp);
          ans.add(temp[0]+" "+temp[1]+" "+temp[2]);
        }
        hashSet.add(arr[j]);
      }
    }
    if(ans.isEmpty()){
      System.out.println("No triplets found!");
    }else{
      System.out.println("Unique Triplets:");
      for(String triplet: ans){
        System.out.println(triplet);
      }
    }
  }
}