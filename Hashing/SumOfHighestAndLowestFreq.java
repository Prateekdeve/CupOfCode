// Given an array of n integers, find the sum of the frequencies of the highest occurring number and lowest occurring number.

import java.util.Scanner;

public class SumOfHighestAndLowestFreq{
  public static void main(String[] args) {
    int n;
    System.out.print("Enter the size of the array");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
      arr[i] = sc.nextInt();
    }

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