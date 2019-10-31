package LinkedList;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description: LeetCode 876 求链表中点
 * @date: 2019/10/31
 */
public class MidPointLinkdList_876 {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
