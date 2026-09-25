import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String s = sc.next();

        // Pre-computing frequencies
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        // Number of queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter character to query: ");
            char c = sc.next().charAt(0);

            // Fetch frequency
            System.out.println("Frequency of '" + c + "' = " + hash[c]);
        }

        sc.close();
    }
}
