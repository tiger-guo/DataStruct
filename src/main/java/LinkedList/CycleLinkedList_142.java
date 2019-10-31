package LinkedList;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: LeetCode 142 环形链表
 * @date: 2019/10/31
 */
public class CycleLinkedList_142 {
    public ListNode detectCycle(ListNode head) {
        if(head ==null)
            return null;

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!= null){
            if(slow == fast)
                break;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null || fast.next == null)
            return null;
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
