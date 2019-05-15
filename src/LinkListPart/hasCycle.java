package LinkListPart;

public class hasCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode p = head, s = head;
        if (head==null)
            return false;
        while(p.next!=null && (s.next!=null &&s.next.next!=null)){
            p=p.next;
            s=s.next.next;
            if (s==p){
                return true;
            }
        }
        return false;
    }
}
//执行用时 : 1 ms, 在Linked List Cycle的Java提交中击败了91.77% 的用户
//内存消耗 : 37.8 MB, 在Linked List Cycle的Java提交中击败了95.98% 的用户