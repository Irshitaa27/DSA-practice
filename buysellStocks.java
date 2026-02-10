import java.util.*;
public class buysellStocks {
    public static int buyAndSellStocks(int prices[]){
  int buyPrice = Integer.MAX_VALUE;
  int maxPro = 0;
  for(int i=0;i<prices.length;i++){
   if(buyPrice<prices[i]){ //profit
    int profit = prices[i]-buyPrice;//today's profit
    maxPro = Math.max(profit,maxPro);
   }else{
    buyPrice=prices[i];
   }
  }
  return maxPro;
} 

public static void main(String[] args) {
    int prices[]={7,1,5,3,6,4};
    System.out.println(buyAndSellStocks(prices));
}
}
