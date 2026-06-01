class Solution{
    public int maxProfit(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
             minPrice=prices[i];
            }
            else{
                int profit = prices[i]-minPrice;
                if(profit>maxProfit){
                 maxProfit=profit;
                }
            }
        }
    return maxProfit;      
    }
}
class Stack{
    public static void main(String[] args) {
       Solution obj = new Solution();
       int[] prices={7,1,5,3,6,4};
       int result=obj.maxProfit(prices);
       System.out.println("Maximun Profit is :"+result);

    }
}