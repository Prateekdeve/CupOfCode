import java.util.Scanner;

public class PalindromeS{
  static boolean Palindrome(int i ,int j ,String s){
    if(i >= j){
      return true;
    }
    if(s.charAt(i) != s.charAt(j)){
      return false;
    }
    // i = i+1 ;
    // j = j-1;
    return Palindrome(i+1 ,j-1 ,s);
  }
  public static void main(String[] args) {
    // boolean checkPalindrome = Palindrome(0 , 3 ,"aabb");
    // System.out.println(checkPalindrome);

    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter a string: ");
    String str = sc.nextLine();        

    boolean checkPalindrome = Palindrome(0, str.length() - 1, str);
    System.out.println("Is palindrome? " + checkPalindrome);

    sc.close(); 
  }
}

// Given a string s, return true if the string is palindrome, otherwise false.



// A string is called palindrome if it reads the same forward and backward.