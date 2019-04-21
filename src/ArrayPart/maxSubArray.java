package ArrayPart;
class maxSubArray {
    public static int maxSubArray(int[] nums){
        int sum = 0,maxsub = nums[0];
        for (int i=0; i< nums.length;++i){
            if (sum>0){
                sum+=nums[i];
            }
            else sum = nums[i];
            if (maxsub<sum) maxsub = sum;
        }
        return maxsub;
    }
}
