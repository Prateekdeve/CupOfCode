import java.util.Scanner;

public class Pattern22{
  public static void main(String args[]){
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n:");
    n = sc.nextInt();
    

    for(int i = 0;i< (2*n)-1;i++){
      for(int j = 0;j<(2*n)-1;j++){
        int top = i;
        int left = j;
        int bottom = (2*n-2) -i;
        int right = (2*n-2) -j;
        
        int minDis = Math.min(Math.min(top ,bottom) ,Math.min(left ,right));
        int val = n -minDis;
        System.out.print(val+" ");
      }
      System.out.println(" ");
    }
  }
}

// Difficult Target Pattern
// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5