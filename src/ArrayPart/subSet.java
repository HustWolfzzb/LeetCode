package ArrayPart;

import java.util.List;
import java.util.LinkedList;


public class subSet {
    public static LinkedList<Integer> scan(int size,int[] nums){
        LinkedList<Integer> re = new LinkedList<>();
        int m=size;
        for (int i=0;i<nums.length;++i){
            if (m%2==1)
                re.add(nums[i]);
            m=m>>1;
        }
        return re;
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new LinkedList<List<Integer>>();
        int size = (int)Math.pow(2,nums.length)-1;
        System.out.println(size);
        while(size>=0){
            sets.add(scan(size,nums));
            size--;
        }
        return sets;
    }

    public static void test(){
        int s= 100;
        for (int i=0;i<10;i++){
            System.out.println(s>>1);
            s=s>>1;
        }
    }
}
//
//执行用时 : 3 ms, 在Subsets的Java提交中击败了55.86% 的用户
//内存消耗 : 36.3 MB, 在Subsets的Java提交中击败了0.73% 的用户