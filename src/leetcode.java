import java.util.*;

public class leetcode {
    public static void main(String args[]){
        long startTime=System.currentTimeMillis();
        //众数
//        ZhongShu.Zhongshu();

        //最大股票利润2
//        int[] prices = new int[]{7,1,5,3,6,4};
//        System.out.println(MaxProfit.maxProfit2(prices));

        // 最大股票利润
//        int[] prices = new int[]{7,1,5,3,6,4};
//        System.out.println(MaxProfit.maxProfit1(prices));

//        //containsDuplicate
//
//        int[] nums = new int[]{1,2,3,1};
//        System.out.println(containsDuplicate.containsDuplicate(nums));

        // maxSubArray
//        int[] nums = new int[]{ -2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(maxSubArray.maxSubArray(nums));


        //removeDuplicates
//
//        int[] nums = new int[]{ 1,1,2};
//        System.out.println(removeDuplicates.removeDuplicates(nums));

//       Merge Sorted Array
//        int[] nums1 = new int[]{2, 7, 11, 15};
//        int[] nums2 = new int[]{2,3,4};
//        MergeSortedArray.merge(nums1,0,nums2,1);
//        for (int i=0;i<1;++i){
//            System.out.print(nums1[i]+" --> ");
//        }

//        TwoSum
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] re = TwoSum.TwoSum(nums,target);
        for (int i:re) {
            System.out.println("Index: "+i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime - startTime)+" ms");
    }
}
