package ArrayPart;

public class productExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] re = new int[len];
        int [] l = new int[len];
        int [] r = new int[len];
        l[0] = 1;
        l[1] = nums[0];
        r[len-1] = 1;
        r[len-2] = nums[len-1];
        for (int i=1;i<len;++i){
            l[i]=nums[i-1]*l[i-1];
        }
        for (int i=len-2;i>=0;--i){
            r[i] = nums[i+1]*r[i+1];
        }
        re[0]=r[0];
        re[len-1] = l[len-1];
        for (int i=0;i<len;++i){
            re[i] = r[i]*l[i];
            System.out.println("No."+i+" num is multi by:"+l[i]+"*"+r[i]);
        }
        return re;
    }
}
