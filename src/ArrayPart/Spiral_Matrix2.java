package ArrayPart;

public class Spiral_Matrix2 {
    public static int[][] generateMatrix(int n){
        if (n==0)
            return new int[1][1];
        if (n==1){
            int[][] re = new int[1][1];
            re[0][0] =1;
        }
        boolean[][] flag = new boolean[n][n];
        for(int i=0;i<n;++i)
            for (int j=0;j<n;++j)
                flag[i][j] = false;
        int [][] re = new int[n][n];
        for(int i=0;i<n;++i)
            for (int j=0;j<n;++j)
                re[i][j] = 0;

        int num=1;
        int dy=1,dx=0,px=0,py=0;
        while(num<=Math.pow(n,2)) {
            re[px][py] = num;
            flag[px][py] = true;
            if (dx == 1 && (px == n - 1 || flag[px + dx][py + dy]) ) {
                dy = -1;
                dx = 0;
            }

            if ( dx == -1 && ( px == 0 || flag[px + dx][py + dy]) ) {
                dy = 1;
                dx = 0;
            }

            if (dy == 1 && (py == n - 1 || flag[px + dx][py + dy]) ) {
                dx = 1;
                dy = 0;
            }

            if ( dy == -1 && (py == 0 || flag[px + dx][py + dy])) {
                dx = -1;
                dy = 0;
            }

            px += dx;
            py += dy;
            num++;
        }
        return re;
    }
}

//执行用时 : 1 ms, 在Spiral Matrix II的Java提交中击败了100.00% 的用户
//内存消耗 : 33.6 MB, 在Spiral Matrix II的Java提交中击败了0.56% 的用户
