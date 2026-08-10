// There is a small inventory  game shop . Return  the item based on the Item code.

import java.util.Scanner;

public class SwitchCaseExample{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter code(101-105) for item :");
    int code = sc.nextInt();

    switch(code){
      case 101 : System.out.println("You got Chips(Rs.40)");
                break;
      case 102 : System.out.println("You got Cold Drink(Rs.50)");
                break;
        
      case 103: System.out.println("You got MilkShake(Rs.30)");
                break;
      case 104: System.out.println("You got ButterMilk(Rs.40)");
                break;
      case 105: System.out.println("You got Namkeen(Rs.20)");
                break;
      default:
        System.out.println("Better Luck Next Time!");
    }
    
    
  }
}