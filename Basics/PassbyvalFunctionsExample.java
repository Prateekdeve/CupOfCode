
// Pass by value -> You take a photocopy of their resume and edit it. Their original stays unchanged. 
// Pass by reference -> You take the actual resume and make edits. Now, their original resume is changed.

public class PassbyvalFunctionsExample{
  public static void main(String args[]){
    int num = 10;
    System.out.println("Before: "+num);
    changeValue(num);
    System.out.println("After :"+ num);
  }
  public  static void changeValue(int num){
    num = 20;
    System.out.println("Inside Method: "+ num);
    // Here, the variable number remains unchanged after the method call because Java passes a copy of the primitive value.

  }
}