package ArrayPart;

public class uniquePath {
    public static int uniquePaths(int m, int n) {
        //最大的雷区 排列组合数字太大的问题，通过类型转换搞定了。。然后我还一边乘一边除。。差不多也行
        double ck1=1,ck2=1;
        for (int i=(m>n?m:n);i<=m+n-2;++i){
            ck1 *= i;
            if (ck2 <= (m<n?m:n)) {
                ck1 /= ck2;
                ++ck2;
            }
            System.out.println("ck1:"+ck1+" ck2:"+ck2);
        }
        return (int)ck1;
    }
}


//执行用时 : 1 ms, 在Unique Paths的Java提交中击败了85.42% 的用户
//内存消耗 : 32.6 MB, 在Unique Paths的Java提交中击败了37.95% 的用户


//class Solution {
//    public static int uniquePaths(int m, int n) {
//        double ck1=1,ck2=1;
//        for (int i=(m>n?m:n);i<=m+n-2;++i){
//            ck1 *= i;
//        }
//        for (int i=2;i<(m<n?m:n);++i){
//            ck2 *= i;
//        }
//        return (int)(ck1/ck2);
//    }
//}


//执行用时 : 0 ms, 在Unique Paths的Java提交中击败了100.00% 的用户
//内存消耗 : 31.6 MB, 在Unique Paths的Java提交中击败了97.40% 的用户