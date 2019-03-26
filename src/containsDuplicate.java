import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        //超出时间限制的版本
//        for(int i=0;i<nums.length;++i){
//            for (int j = i+1;j<nums.length;++j){
//                if (nums[j]==nums[i]){
//                    return true;
//                }
//            }
//        }
//        return false;
        //通过的版本
//        Set num = new HashSet();
//        for (int i=0;i<nums.length;++i){
//            if (!num.add(nums[i]))
//                return true;
//        }
//        return false;

        //快速版本
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;++i){
            if (nums[i]==nums[i+1]) return true;
        }
        return false;
    }
}
