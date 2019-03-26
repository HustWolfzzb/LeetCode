public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int p=0;
        if (nums.length==0)
            return 0;
        int num = nums[0];
        for(int i =1;i<nums.length;++i){
            if (num!=nums[i]){
                num = nums[i];
                ++p;
                nums[p] = nums[i];
            }
        }
        return p+1;
    }
}
