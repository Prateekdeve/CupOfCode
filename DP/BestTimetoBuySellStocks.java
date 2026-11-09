// Given an array displaying the stock price of stocks each day . Find the best time to buy and sell stocks by returning the maximum Profit.

import java.util.Scanner;

public class BestTimetoBuySellStocks {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter no. of days stocks are kept:");
    n = sc.nextInt();
    int stockPrice[] = new int[n];

    System.out.print("Enter stock value on following days:");
    for(int i =0;i<n;i++ ){
      stockPrice[i]= sc.nextInt();
    }
    
    int mini = stockPrice[0];
    int maxProfit =0;
    for(int i=0;i<n;i++){
      int cost = stockPrice[i] - mini;
      maxProfit = Math.max(maxProfit ,cost);
      mini = Math.min(mini ,stockPrice[i]);
    }

    System.out.print("Maximum profit is "+maxProfit);

    sc.close();
  }
}
