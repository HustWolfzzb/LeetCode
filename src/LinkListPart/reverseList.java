package LinkListPart;

public class reverseList {
    public static ListNode reverseList(ListNode head) {
        ListNode x = head;
        if(x==null)
            return null;
        while(x.next!=null) x=x.next;
        ListNode newL = new ListNode(x.val);
        ListNode p = head;
        ListNode t = p;
        while(p!=x){
            t = p;
            p = p.next;
            t.next = newL.next;
            newL.next = t;
        }
        return newL;
    }
}

//执行用时 : 1 ms, 在Reverse Linked List的Java提交中击败了54.19% 的用户
//内存消耗 : 35.1 MB, 在Reverse Linked List的Java提交中击败了69.89% 的用户
