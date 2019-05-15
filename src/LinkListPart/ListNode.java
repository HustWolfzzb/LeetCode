package LinkListPart;

public class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int x) {val = x;}
    public ListNode(int[] num){
        this.val = num[0];
        ListNode p = this;
        for(int i=1;i<num.length;++i){
            p.next = new ListNode(num[i]);
            p = p.next;
        }
    }
}