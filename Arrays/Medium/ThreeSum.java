// Given an array of size n . Return all the unique triplets from it whose sum is equal to 0.

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
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

    //ThreeSumBetter(arr, n);

    // Optimal Approach
    ThreeSumOptimal(arr ,n);
    sc.close();
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
        System.out.println("["+triplet+"]");
      }
    }
  }

  // Optimal Approach
  static void ThreeSumOptimal(int arr[] ,int n){
    Arrays.sort(arr);

    List<List<Integer>> ans = new ArrayList<>();
    for(int i =0;i<n;i++){

      // Skip duplicate first element
      if(i >0 && arr[i] == arr[i-1]){
        continue;
      }
      int left = i+1 ,right = n-1;

      while(left <right){
        int sum = arr[i]+ arr[left] + arr[right];
        if(sum <0){left++;}
        else if(sum >0){right--;}
        else{
          ans.add(Arrays.asList(arr[i] ,arr[left],arr[right]));
          left++;
          right--;

          // Skip duplicate second elment
          while(left <right && arr[left] == arr[left-1]){
            left++;
          }

          // Skip duplicate third element
          while(left <right && arr[right] == arr[right+1]){
            right--;
          }
        }
      }
    }
    if(ans.isEmpty()){
      System.out.println("No Triplets FOund!");
    }else{
      System.out.println("Unique Triplets:");
      for(List<Integer> triplet:ans){
        System.out.print(triplet);
      }
    }
  }
}