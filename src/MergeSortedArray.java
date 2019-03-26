public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

//        执行用时 : 5 ms, 在Merge Sorted Array的Java提交中击败了68.74% 的用户
//        内存消耗 : 36 MB, 在Merge Sorted Array的Java提交中击败了0.81% 的用户

        int p1=m-1,p2=n-1;

        for (int i=m+n-1;i>=0;--i){
            if (p2>=0 && p1>=0 && nums1[p1]<nums2[p2] ){
                nums1[i] = nums2[p2];
                p2--;
            }
            else if (p1>=0 ){
                nums1[i] = nums1[p1];
                p1--;
            }
            else if (p2>=0){
                nums1[i] = nums2[p2];
                p2--;
            }
        }
    }
}
