package LinkListPart;

public class IntersectionofTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB ==null)
            return null;
        ListNode pA = headA,pB = headB;
        int lenA = 0,lenB = 0;
        while(pA!=null){
            lenA++;
            pA = pA.next;
        }
        while (pB!=null){
            lenB++;
            pB = pB.next;
        }
        int gap = lenA>lenB?(lenA - lenB):(lenB - lenA);
        pA = headA;
        pB = headB;
        if (lenA > lenB){
            while(gap != 0){
                pA = pA.next;
                gap--;
            }
        }
        else {
            while (gap!= 0){
                pB = pB.next;
                gap--;
            }
        }
        while(pA!=null  && pB !=null){
            if (pA == pB){
//                System.out.println("I find it!");
                return pA;
            }

            pA = pA.next;
            pB = pB.next;
        }
        return pA;
    }
}

//执行用时 : 2 ms, 在Intersection of Two Linked Lists的Java提交中击败了94.83% 的用户
//内存消耗 : 47.3 MB, 在Intersection of Two Linked Lists的Java提交中击败了20.42% 的用户
