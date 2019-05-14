package LinkListPart;

public class reverseList {
    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        while(p.next!=null) p=p.next;
        ListNode newL = new ListNode(p.val);
        p = head;
        ListNode t = newL;
        while(p!=null){
            newL.next = p;
            t = p;
            p = p.next;
//            t.next =
        }
        return newL;
    }
}
