// Given an array of n integers, find the sum of the frequencies of the highest occurring number and lowest occurring number.

import java.util.HashMap;
import java.util.Scanner;

public class SumOfHighestAndLowestFreq{
  public static void main(String[] args) {
    int n;
    System.out.print("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
      System.out.print("Enter element:");
      arr[i] = sc.nextInt();
    }

    HashMap<Integer ,Integer> freqMap = new HashMap<>();
    for(int num:arr){
      freqMap.put(num ,freqMap.getOrDefault(num ,0)+1);
    }
    
    // Initialize the max and min frequency
    int maxFreq = Integer.MIN_VALUE;
    int minFreq = Integer.MAX_VALUE;


    // Find highest and smallest frequency
    for(int freq :freqMap.values()){
      if(freq >maxFreq){
        maxFreq = freq;
      }
      if(freq <minFreq){
        minFreq = freq;
      }
    }

    // Calculate sum of highest & lowest frequencies
    int result = maxFreq + minFreq;
    System.out.println("Sum of maximum and minimum frequencies ="+ result);

    sc.close();

  }
}


// Example 1:
// Input: arr = [1, 2, 2, 3, 3, 3]

// Output: 4

// Explanation: The highest frequency is 3 (element 3), and the lowest frequency is 1 (element 1). Their sum is 3 + 1 = 4.

// Example 2:
// Input: arr = [4, 4, 5, 5, 6]

// Output: 3

// Explanation: The highest frequency is 2 (elements 4 and 5), and the lowest frequency is 1 (element 6). Their sum is 2 + 1 = 3.