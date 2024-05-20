class Solution {
  public int maxProfit(int[] prices) {
      
    if(prices.length == 0 || prices.length == 1){
      return 0;
    }

    int maxProfit = 0;
    int leftPointer = prices[0];
    int rightPointer = prices[1];

    for(int i = 1; i < prices.length; i++){
    

      if(rightPointer>leftPointer){
        int profit = rightPointer-leftPointer;
        if(i < prices.length-1){
          rightPointer = prices[i+1];
        }
        if(profit > maxProfit){
          maxProfit = profit;
        }
      } else{
        leftPointer = rightPointer;
          if(i < prices.length-1){
            rightPointer = prices[i+1];
          }
      }


    }

    return maxProfit;

  }
}