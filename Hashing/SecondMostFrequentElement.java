// Given an array of n integers, find the second most frequent element in it.

// If there are multiple elements that appear second most frequent times, find the smallest of them.

// If second most frequent element does not exist return -1.

// Reference = Tuf_dsa

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondMostFrequentElement{
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array :");
    n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<n;i++){
      System.out.print("Enter element:");
      arr[i]= sc.nextInt();

     
    }
    int result = findSecMostFreq(arr);
    System.out.println("Output :"+result);

    sc.close();
    
  }
  public static int findSecMostFreq(int[] arr){
      if(arr == null || arr.length<2){
        return -1;
      }
      //Count Frequencies
      Map<Integer,Integer> freqMap = new HashMap<>();
      for(int num:arr){
        freqMap.put(num ,freqMap.getOrDefault(num ,0)+1);

      }
      int maxFreq =0;
      int secMaxFreq = 0;

      // Find maximum frequency
      for(int freq :freqMap.values()){
        if(freq> maxFreq){
          maxFreq = freq;
        }
      }

      // Find second maximum frequency
      for(int freq:freqMap.values()){
        if(freq> secMaxFreq && freq<maxFreq){
          secMaxFreq = freq;
        }
      }

      // If all elements have same frequency ,second max does not exist.
      if(secMaxFreq == 0){
        return -1;
      }

      // Find the smallest elemnt that matches the second max frequency.
      int smallestElement =Integer.MAX_VALUE;
      for(Map.Entry<Integer,Integer> entry :freqMap.entrySet()){
        if(entry.getValue() == secMaxFreq){
          smallestElement = Math.min(smallestElement,entry.getKey());
        }
      }

      return smallestElement == Integer.MAX_VALUE ? -1 :smallestElement;
    }
}



// Example 1:

// Input: arr = [1, 2, 2, 3, 3, 3]
// Output: 2

// Explanation:The number 2 appears the second most (2 times) and number 3 appears the most(3 times). 