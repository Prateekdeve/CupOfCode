import java.util.Scanner;

public class PalindromeS{
  static boolean Palindrome(int i ,int j ,String s){
    if(i >= j){
      return true;
    }
    if(s.charAt(i) != s.charAt(j)){
      return false;
    }
    i = i+1 ;
    j = j-1;
    return Palindrome(i ,j ,s);
  }
  public static void main(String[] args) {
    boolean checkPalindrome = Palindrome(0 , 3 ,"aabb");
    System.out.println(checkPalindrome);

  }
}

// Given a string s, return true if the string is palindrome, otherwise false.



// A string is called palindrome if it reads the same forward and backward.