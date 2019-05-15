package LinkListPart;

public class mergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode re = new ListNode(10086);
        ListNode p = re;
        while (l1 != null && l2!=null){
            if (l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            }
            else {
                p.next = l2;
                l2 = l2.next;
                p = p.next;
            }
        }
        if (l1 == null){
            p.next = l2;
        }
        else {
            p.next = l1;
        }
        re= re.next;
        return re;
    }
}

//执行用时 : 2 ms, 在Merge Two Sorted Lists的Java提交中击败了97.49% 的用户
//内存消耗 : 35.6 MB, 在Merge Two Sorted Lists的Java提交中击败了87.88% 的用户