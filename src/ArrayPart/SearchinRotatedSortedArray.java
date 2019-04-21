package ArrayPart;

public class SearchinRotatedSortedArray {
    static int find(int [] nums, int f, int t, int target){
        //如果当前数组只剩下一个数字，那么很明显在下一次的递归中就会出现下列情况，故而可以跳出
        if (f > t)
            return -1;

        //下面是 每次递归实现
        int m = (f+t)/2;
        //每次都只检查index为m的数字，不做其他的考虑
        if (nums[m] == target)
            return m;
        //如果未中，那么选择有序段进行判断，如果后半段有序，如下：
        if (nums[m] < nums[t]){
            //如果target在有序段中，那么在有序段中继续分割查找。通过有序段来确定target的二分位置。
            if (nums[m]<target && nums[t] >= target)
                return find(nums,m+1,t,target);
            //如果target在无序段中，就会继续分割。
            else return find(nums,f,m-1,target);
        }
        //如果前半段有序，处理方式如下：
        else {
            if (nums[f] <= target && nums[m] > target)
                return find(nums,f,m-1,target);
            else return find(nums,m+1,t,target);
        }
    }
    public static int search(int[] nums, int target) {
        if (nums.length==0)
            return 0;
        return find(nums,0,nums.length-1,target);
    }
}

//执行用时 : 2 ms, 在Search in Rotated Sorted Array的Java提交中击败了95.70% 的用户
//内存消耗 : 37.4 MB, 在Search in Rotated Sorted Array的Java提交中击败了73.32% 的用户