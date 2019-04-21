package ArrayPart;

public class ContainersWithMostWater {
    public static int maxArea(int[] height) {
        int first = 0,last = height.length-1;
        int area = height[last]<height[first]?(last-first)*height[last]:(last-first)*height[first];
        if (last==1) return area;
        while(last>first) {
            if (height[last]>height[first])
                first = first+1;
            else last = last - 1;
            if (area<=(height[last]<height[first]?(last-first)*height[last]:(last-first)*height[first])){
                area = (height[last]<height[first]?(last-first)*height[last]:(last-first)*height[first]);
            }
        }
        return area;
    }
}
//执行用时 : 5 ms, 在Container With Most Water的Java提交中击败了95.77% 的用户
//内存消耗 : 45.7 MB, 在Container With Most Water的Java提交中击败了43.32% 的用户
//进行下一个挑战：接雨水