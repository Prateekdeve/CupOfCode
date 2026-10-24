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
    int ans = numAppearOnceHash(arr ,n);
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

  static int numAppearOnceHash(int arr[],int n){
    int maxi = arr[0];
    for(int i =0; i< n;i++){
      maxi = Math.max(maxi ,arr[i]);
    }
    // Creating the hash array
    int[] hash = new int[maxi+1];

    //Store frequencies
    for(int i =0;i<n;i++){
      hash[arr[i]]++;
    }

    // Find elemment occuring once
    for(int i=0;i<n;i++){
      if(hash[arr[i]] == 1){
        return arr[i];
      }
    }
    return -1;
  }
}
