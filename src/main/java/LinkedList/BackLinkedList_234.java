package LinkedList;

/*
 * @author: LiuGuohu
 * @company: XGLAB
 * @description:LeetCode 234回文链表
 * @date: 2019/10/31
 */
public class BackLinkedList_234 {

    public boolean isPalindrome(ListNode head) {
        ListNode p1=null,p2=null;
        ListNode slow = head;
        ListNode fast = head.next;

        while(true){
            if(fast.next == null){
                p2 = slow.next;
                p1 = relese(p1,slow);
                break;
            }else if(fast.next.next == null){
                p2 = slow.next.next;
                p1 = relese(p1,slow);
                break;
            }
            ListNode s = slow;
            slow = slow.next;
            p1 = relese(p1,s);
            fast = fast.next.next;
        }

        while(p1!=null && p2 != null){
            if(p1.val == p2.val){
                p1 = p1.next;
                p2 = p2.next;
                continue;
            }
            return false;
        }
        return true;
    }

    ListNode relese(ListNode node1, ListNode node2){
        node2.next = node1;
        return node2;
    }

}
