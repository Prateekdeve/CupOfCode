// //Complete the function printNumber which takes an integer input from the user and prints it on the screen.



// Use:-

// for C++ : cout << variable_name;
// for Java : System.out.print();
// for Python : print()
// for Javascript : console.log()

// Example 1

// Input(user gives value): 7

// Output: 7

// Example 2

// Input(user gives value): -5

// Output: -5

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Output ="+number);
    }
}