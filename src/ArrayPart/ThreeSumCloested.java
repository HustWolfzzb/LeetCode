package ArrayPart;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeSumCloested {
    public static int abs(int a,int b){
        if (a>b) return a-b;
        else return b-a;
    }
    public static int threeSumClosest(int[] nums, int target) {
        if (nums.length==3)
            return nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for (int s:nums) System.out.print(s+",");
        System.out.println();
        int a=1,b=nums.length-2;
        int ans = 10000;
        for (int m=a;m<=b;++m){
            int l=0,r=nums.length-1;
            System.out.println("=============the M now is "+m+"=============");
            while(l<m && m<r){
                System.out.println("Now is :nums["+l+"]:"+nums[l]+", nums["+m+"]:"+nums[m]+", nums["+r+"]:"+nums[r]+" = ans:"+ans );
                if (abs(nums[l]+nums[m]+nums[r],target) < abs(ans,target)){
                    ans = nums[l]+nums[m]+nums[r];
                }
                if (nums[l]+nums[m]+nums[r] > target)
                    --r;
                else if (nums[l]+nums[m]+nums[r] <target)
                    ++l;
                else return target;
            }
        }
        return ans;
    }
}


//执行用时 : 88 ms, 在3Sum Closest的Java提交中击败了13.69% 的用户
//内存消耗 : 38 MB, 在3Sum Closest的Java提交中击败了65.81% 的用户