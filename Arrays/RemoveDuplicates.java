import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Removing duplicates from the above array
        int remdup = removeDuplicates(arr, n);
        System.out.println("Array without duplicates:");
        for (int i = 0; i < remdup; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    // Removing duplicates using two pointer approach.
    static int removeDuplicates(int arr[], int n) {
        // Array with 0 or 1 elements -> No duplicates
        if (n == 0 || n == 1) return n;

        // Maintain array of unique elements
        int[] temp = new int[n];
        int j = 0; // No. of unique elements.

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        // Copy back to original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
}
