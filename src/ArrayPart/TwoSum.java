package ArrayPart;

public class TwoSum {
    public static int[] TwoSum(int[] nums, int target){
        int [] re = new int[2];
        int flag = 0;
        for (int i=0;i<nums.length;++i){
            if (flag == 1){
                break;
            }
            for (int j = i+1;j<nums.length;++j){
                if (nums[i]+nums[j]==target){
                    re[0] = i;
                    re[1] = j;
                    flag = 1;
                }
            }
        }
        return re;
    }
}
//
//Runtime: 64 ms, faster than 5.48% of Java online submissions for Two Sum.
//Memory Usage: 38.5 MB, less than 48.64% of Java online submissions for Two Sum.