//import java.util.*;
import ArrayPart.*;
import LinkListPart.*;

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
////
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
//        int[] nums = new int[]{2, 7, 11, 15};
//        int target = 9;
//        int[] re = TwoSum.TwoSum(nums,target);
//        for (int i:re) {
//            System.out.println("Index: "+i);
//        }

//        subsets
//        int[] nums = new int[]{2, 7, 11};
//        List<List<Integer>> set = subSet.subsets(nums);
//        for (List<Integer> i:set) {
//            System.out.println(i.toString());
//        }


//        Spiral_Matrix2
//        int n = 10;
//        int[][] set = Spiral_Matrix2.generateMatrix(n) ;
//        for (int [] i:set) {
//            System.out.print("[ ");
//            for (int j:i) {
//                System.out.print(j + " , ");
//            }
//            System.out.println("]");
//        }


//        productExceptSelf
//        int[] nums = new int[]{1,2,3,4};
//        int [] output = productExceptSelf.productExceptSelf(nums);
//        for (int i:output){
//            System.out.println(i);
//        }


//       ContainersWithMostWater
//        int[] heights = new int[]{1,8,6,2,5,4,8,3,7};
//        System.out.println(ContainersWithMostWater.maxArea(heights));


//      uniquePaths
//        System.out.println(uniquePath.uniquePaths(100,50));


//        3Sum Closest
//        int[] nums = new int[]{-55,-24,-18,-11,-7,-3,4,5,6,9,11,23,33};
//        System.out.println(ThreeSumCloested.threeSumClosest(nums,0));


//        Search in Rotated Sorted Array
//        int[] nums = new int[]{1,3};
//        System.out.println(SearchinRotatedSortedArray.search(nums,0));



//========================链表部分========================
        // 删除链表中的一个节点
//        int[] nums = new int[]{1,4,5,6,3};
//        int nodeval = 5;
//        ListNode head = new ListNode(nums[0]);
//        ListNode p = head;
//        for(int i=1;i<nums.length;++i){
//             p.next = new ListNode(nums[i]);
//             p = p.next;
//        }
//        p = head;
//        while(p.val != nodeval)
//            p = p.next;
//        deleteNode.deleteNode(p);
//        p=head;
//        while(p!=null){
//            System.out.println(p.val);
//            p=p.next;
//        }


        // 反转链表

//        int[] nums = new int[]{4,4,-3,-2,4};
//        ListNode head = new ListNode(nums[0]);
//        ListNode p = head;
//        for(int i=1;i<nums.length;++i){
//             p.next = new ListNode(nums[i]);
//             p = p.next;
//        }
//        p = reverseList.reverseList(head);
//        while(p!=null){
//            System.out.println(p.val);
//            p = p.next;
//        }

        // 合并有序链表
//        int[] nums1 = new int[]{1,2,3,4};
//        int[] nums2 = new int[]{2,3,4,5,6};
//        ListNode head = new ListNode(nums1[0]);
//        ListNode p = head;
//        for(int i=1;i<nums1.length;++i){
//            p.next = new ListNode(nums1[i]);
//            p = p.next;
//        }
//        ListNode head1 = new ListNode(nums2[0]);
//        ListNode p1 = head1;
//        for(int i=1;i<nums2.length;++i){
//            p1.next = new ListNode(nums2[i]);
//            p1 = p1.next;
//        }
//        p = mergeTwoLists.mergeTwoLists(head1,head);
//        while(p!=null){
//            System.out.println(p.val);
//            p = p.next;
//        }

        // 找出两个链表的相交点
//        int[] nums1 = new int[]{4,1,8,4,5};
//        int[] nums2 = new int[]{5,0,1,8,4,5};
//        ListNode head = new ListNode(nums1[0]);
//        ListNode p = head;
//        for(int i=1;i<nums1.length;++i){
//            p.next = new ListNode(nums1[i]);
//            p = p.next;
//        }
//        ListNode head1 = new ListNode(nums2[0]);
//        ListNode p1 = head1;
//        for(int i=1;i<nums2.length;++i){
//            p1.next = new ListNode(nums2[i]);
//            p1 = p1.next;
//        }
//        p = IntersectionofTwoLinkedLists.getIntersectionNode(head,head1);
//        if (p==null) System.out.println("NULL");
//        while(p!=null){
//            System.out.println(p.val);
//            p = p.next;
//        }

        // 链表是否成环
//        int[] nums1 = new int[]{4,1,8,4,5};
//        int pos = 2;
//        ListNode head = new ListNode(nums1);
//        ListNode p = head;
//        while (pos != 0){
//            p=p.next;
//            pos--;
//        }
//        ListNode t = p;
//        while (t.next!=null) t=t.next;
//        t.next = p;
//        System.out.println(hasCycle.hasCycle(head));


        //
        long endTime=System.currentTimeMillis();
        System.out.println("Running Time: "+(endTime - startTime)+" ms");
    }
}
