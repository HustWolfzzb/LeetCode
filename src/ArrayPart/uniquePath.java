package ArrayPart;

public class uniquePath {
    public static int uniquePaths(int m, int n) {
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
//        进行下一个挑战：