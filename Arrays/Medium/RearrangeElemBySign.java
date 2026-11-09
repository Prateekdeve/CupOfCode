// Given an array of n elements where n is even . Rearrange the array elements with elements in order first +ve and then -ve element.

import java.util.Scanner;

public class RearrangeElemBySign {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size:");
    n = sc.nextInt();

    System.out.println("Enter array elements:");
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    RearrangeBySignEvenN(arr, n);

    System.out.println();
    sc.close();
  }

  // Optimal (O(n))
  static void RearrangeBySignEvenN(int arr[], int n) {

    int ans[] = new int[n];

    int posIndex = 0;
    int negIndex = 1;

    for (int i = 0; i < n; i++) {

      if (arr[i] >= 0) {
        ans[posIndex] = arr[i];
        posIndex += 2;
      } else {
        ans[negIndex] = arr[i];
        negIndex += 2;
      }
    }

    System.out.println("Rearranged Array:");

    for (int i = 0; i < n; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}
