public class MaxProfit {
    public static int maxProfit2(int[] prices) {
        int maxprofit = 0;
        int times = prices.length;
        if(times==1)
            return 0;
        for (int i=0;i<times-1;++i) {
            if (prices[i] < prices[i + 1]) {
                maxprofit += (prices[i + 1] - prices[i]);
            }
        }
        return maxprofit;
    }

    public static int maxProfit1(int[] prices) {
        int maxprofit = 0;
        int times = prices.length;
        if(times==1)
            return 0;
        for (int i=0;i<times;++i) {
            for(int j=i;j<times;++j){
                if (prices[j]-prices[i]>maxprofit)
                    maxprofit = prices[j]-prices[i];
            }
        }
        return maxprofit;
    }
}
